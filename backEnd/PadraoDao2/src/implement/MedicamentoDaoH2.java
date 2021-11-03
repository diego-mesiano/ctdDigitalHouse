package implement;

import configuracao.ConfigurationJDBC;
import model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicamentoDaoH2 implements IDao<Medicamento> {

    private ConfigurationJDBC configurationJDBC;
    private static Logger log = Logger.getLogger(Medicamento.class);

    public MedicamentoDaoH2(ConfigurationJDBC configurationJDBC) {
        this.configurationJDBC = configurationJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) {
        log.debug("Registrando um novo medicamento: " + medicamento.toString());
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO MEDICAMENTO (NOME, LABORATORIO, QUANTIDADE, PRECO) " +
                "VALUES ('%s', '%s', '%s', '%s')",medicamento.getNome(), medicamento.getLaboratorio(), medicamento.getQuantidade(), medicamento.getPreco());
        try{
            statement = connection.createStatement();
            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next()){
                medicamento.setId(keys.getInt(1));
                statement.close();
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return medicamento;
    }

    @Override
    public Medicamento buscarPorId(Integer id) {
        log.debug("Buscando um medicamento com id: " + id);
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT * FROM MEDICAMENTO WHERE ID = '%s'", id);
        Medicamento medicamento = null;

        try{
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                medicamento = new Medicamento(resultSet.getInt("id"), resultSet.getString("nome"),resultSet.getString("laboratorio"),
                        resultSet.getInt("quantidade"), resultSet.getDouble("preco"));
            }
            statement.close();
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return medicamento;
    }
}
