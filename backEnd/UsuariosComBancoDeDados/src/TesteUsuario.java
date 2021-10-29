import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class TesteUsuario {

    private static final String CRIAR_TABELA_SQL = "DROP TABLE IF EXISTS USUARIO; CREATE TABLE USUARIO"
            + "("
            +" ID INT PRIMARY KEY,"
            +" NOME VARCHAR (100) NOT NULL,"
            +" SOBRENOME VARCHAR (100) NOT NULL,"
            +" IDADE INT NOT NULL"
            +")"
            ;

    private static final String SQL_INSERT_1 = "INSERT INTO USUARIO (ID, NOME, SOBRENOME, IDADE) VALUES (1, 'JOAREZ', 'MEDEIROS', 32)";
    private static final String SQL_INSERT_2 = "INSERT INTO USUARIO (ID, NOME, SOBRENOME, IDADE) VALUES (2, 'ANA', 'SILVA', 83)";
    private static final String SQL_INSERT_3 = "INSERT INTO USUARIO (ID, NOME, SOBRENOME, IDADE) VALUES (3, 'MANOEL', 'ROBERTO', 70)";

    private static final String SQL_DELETE = "DELETE FROM USUARIO WHERE ID = 3";

    private static final Logger LOGGER = Logger.getLogger(TesteUsuario.class);



    public static void main(String[] args) throws Exception{

        Connection conexao = null;
        try{
            conexao = obterConexao();
            Statement statement = conexao.createStatement();

            statement.execute(CRIAR_TABELA_SQL);

            statement.execute(SQL_INSERT_1);
            statement.execute(SQL_INSERT_2);
            statement.execute(SQL_INSERT_3);

            statement.execute(SQL_DELETE);

            LOGGER.info("O usuário com id 3 foi excluído");

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            conexao.close();
        }

    }

    private static Connection obterConexao() throws Exception{
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/teste","sa","");
    }
}
