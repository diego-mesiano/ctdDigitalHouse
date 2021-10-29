import java.sql.*;

public class Test {
    //COMANDOS SQL QUE USAREMOS NO EXEMPLO
    private static final String sqlCriarTabela = "DROP TABLE IF EXISTS TESTE; CREATE TABLE TESTE"
            + "("
            + "ID INT PRIMARY KEY,"
            + "NOME VARCHAR(255) NOT NULL"
            + ");";

    private static final String sqlInserir1 = "INSERT INTO TESTE (ID,NOME) VALUES (5, 'Pedrinho')";
    private static final String sqlInserir2 = "INSERT INTO TESTE (ID,NOME) VALUES (6, 'Amanda')";
    private static final String sqlSelect = "SELECT * FROM TESTE";

    public static void main(String[] args) throws Exception{
        //Primeiro passo é importar e instanciar a biblioteca Conection
        Connection conexao = null;

        //tentamos a conexão
        try{
            //getConnection fara a conexão
            conexao = getConnection();

            //por meio do Statement executamos as queryes, ele que lida diretamente com o banco
            //criamos uma instancia
            Statement statement =  conexao.createStatement();

            //executa as queryes
            //statement.execute(sqlCriarTabela);
            statement.execute(sqlInserir1);
            statement.execute(sqlInserir2);

            //mostra os dados
            showDados(conexao, sqlSelect);

        }catch(Exception e){
            e.printStackTrace();
        } finally { //IMPORTANTE: FECHA A CONEXÃO COM O BANCO!!!
            if (conexao == null)
                return; //SAI SE A CONEXÃO FOR NULA
            conexao.close(); // AQUI FECHA A CONEXÃO
        }


    }

    public static Connection getConnection() throws Exception{
        //driver de como acontece a conexão, qual banco de dados vai usar, pede a driver class do banco
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();

        //faz a conexão com o banco informando a url, nome de usuario e senha
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

    //metodo para conectar e mostrar a tabela
    public static void showDados(Connection connection, String sqlQuery) throws Exception{
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        while (rs.next()){
            //busca na coluna 1 (no caso o ID)
            System.out.println(rs.getInt(1) + " - " + rs.getString(2));
        }

    }

}
