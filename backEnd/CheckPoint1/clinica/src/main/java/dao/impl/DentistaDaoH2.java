package dao.impl;

import configuration.ConfigurationJDBC;
import dao.IDao;
import model.Dentista;
import model.Paciente;
import org.apache.log4j.Logger;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DentistaDaoH2 implements IDao <Dentista> {

    private ConfigurationJDBC configurationJDBC;
    final static Logger log = Logger.getLogger(PacienteDaoH2.class);

    public DentistaDaoH2() {
        this.configurationJDBC = new ConfigurationJDBC();
    }

    @Override
    public Dentista salvar(Dentista dentista){
        log.debug("Registrando novo dentista: " + dentista.toString());
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO DENTISTA (N_MATRICULA, NOME, SOBRENOME) VALUES ('%s', '%s', '%s')",
                dentista.getNumeroMatricula(), dentista.getNome(), dentista.getSobrenome());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);

            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return dentista;
    }

    @Override
    public Optional<Dentista> buscar(Integer numeroMatricula) {
        Dentista dentista = null;
        log.debug("Buscando dentista com numero de matricula: " + numeroMatricula);
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;

        String query = String.format("SELECT N_MATRICULA, NOME, SOBRENOME FROM DENTISTA WHERE N_MATRICULA = '%s'", numeroMatricula);

        try {
            statement = connection.createStatement();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                dentista = criarObjetoDentista(rs);
            }
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return dentista != null ? Optional.of(dentista) : Optional.empty();
    }

    @Override
    public void excluir(Integer numeroMatricula) {
        log.debug("Excluindo Dentista com numero de matricula: " + numeroMatricula);
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("DELETE FROM DENTISTA WHERE N_MATRICULA = '%s'", numeroMatricula);
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Dentista> buscarTodos() {
        log.debug("Bucando todos os dentistas");
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = "SELECT * FROM DENTISTA";
        List<Dentista> dentistas = new ArrayList<>();

        try{
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                dentistas.add(criarObjetoDentista(rs));
            }
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return dentistas;
    }

    private Dentista criarObjetoDentista(ResultSet rs) throws SQLException {

        Integer numeroMatricula = rs.getInt("N_MATRICULA");
        String nome = rs.getString("NOME");
        String sobrenome = rs.getString("SOBRENOME");



        return new Dentista(numeroMatricula, nome, sobrenome);
    }
}
