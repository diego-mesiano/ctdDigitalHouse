/*

Enunciado:

Utilizaremos um statement para criar uma tabela de funcionários com cinco colunas. A única coluna obrigatória será a
coluna ID, que também é Primary Key, e as demais colunas são de livre escolha. Em seguida:

Devemos inserir três linhas com dados diferentes, e uma delas deve conter o ID repetido;

Verificar se está ocorrendo o erro: “Unique index or primary key violation”, ocasionado ao tentar inserir dois
registros com o mesmo ID. Então devemos tratá-lo como exceção, registar o erro em log e continuar com a execução das
demais instruções;

Em seguida, você deve atualizar um dos funcionários com um novo valor em uma de suas colunas e registrar com um
objeto de depuração (debug) as informações do funcionário;

Posteriormente, temos que excluir um funcionários de acordo com o ID e registrar as informações do funcionário
excluído como um objeto de informação (info);

Por último, excluir outro funcionário utilizando como critério outra coluna que não seja o ID, como por exemplo o
e-mail, e registrar as informações do funcionário excluído como um objeto de informação (info).

*/

import org.apache.log4j.Logger;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static Connection conexao = null;
    public static Statement statement = null;

    //metodo parar obter a conexão
    public static Connection obterConexao() throws Exception{
        //driver de como acontece a conexão, qual banco de dados vai usar, pede a driver class do banco
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();

        //faz a conexão com o banco informando a url, nome de usuario e senha
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

    //metodo para criar a tabela
    public static void sqlCriarTabela() throws Exception{
        try{
            conexao = obterConexao();
            statement = conexao.createStatement();
            statement.execute("DROP TABLE IF EXISTS FUNCIONARIOS; CREATE TABLE FUNCIONARIOS"
                    + "("
                    + "ID INT PRIMARY KEY,"
                    + "NOME VARCHAR(255) NOT NULL,"
                    + "TELEFONE VARCHAR(30),"
                    + "CARGO VARCHAR(50),"
                    + "SALARIO DOUBLE"
                    + ")");
        }catch(Exception e){
            System.err.println("Impossivel conectar ao banco de dados");
        }finally {
            conexao.close();
        }
    }

    //metodo para atualizar dados da tabela
    public static void sqlUpdate(String tabela, String id, String campo, String novosDados ) throws Exception{
        try{
            conexao = obterConexao();
            statement = conexao.createStatement();
            statement.execute("UPDATE "+tabela+" SET "+campo+"='"+novosDados+"' WHERE id="+id);
        }catch(Exception e){
            System.err.println("Impossivel conectar ao banco de dados");
        }finally {
            logger.debug("Usuário com id = "+id+" e campo = "+campo+" foi atualizado!");
            conexao.close();
        }

    }

    //metodo para conectar e mostrar a tabela
    public static void mostrarDados(){
        try{
            conexao = obterConexao();
            statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM FUNCIONARIOS");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5));
            }
        }catch (Exception e) {
            System.err.println("Impossivel conectar ao banco de dados");
        }


    }

    //metodo para inserir na tabela
    public static void inserirLinha(String tabela, String id, String nome, String telefone, String cargo, String salario) throws Exception{
        try {
            conexao = obterConexao();
            statement = conexao.createStatement();
            try{
                statement.execute("INSERT INTO " + tabela + " (ID,NOME,TELEFONE,CARGO,SALARIO) VALUES ("+id+", '"+nome+"', '"+telefone+
                        "',  '"+cargo+"', "+salario+")");

            }catch (JdbcSQLIntegrityConstraintViolationException e){
                logger.error("Tentou inserir ids iguais na tabela!");
            }
        }catch (Exception e){
            System.err.println("Erro na Conexão com banco de dados");
        }finally { //IMPORTANTE: FECHA A CONEXÃO COM O BANCO!!!
            conexao.close();
        }
    }

    //metodo para apagar dados da tabela
    public static void sqlApagar(String tabela, String campoDoWhere, String valor) throws Exception{
        try{
            conexao = obterConexao();
            statement = conexao.createStatement();
            statement.execute("DELETE FROM "+tabela+" WHERE "+campoDoWhere+"='"+valor+"'");
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Impossivel conectar ao banco de dados");
        }finally {
            logger.info("Usuário com "+campoDoWhere+" = "+valor+" foi apagado!");
            conexao.close();
        }

    }

    public static void main(String[] args) throws Exception {
        //criando a tabela
        sqlCriarTabela();

        //inserindo dados
        inserirLinha("FUNCIONARIOS","1","João","19-9983-5583","Estagiário","1500.00");
        inserirLinha("FUNCIONARIOS","2","Mateus","19-98544-6319","Dev Front End Junior","4500.00");
        inserirLinha("FUNCIONARIOS","2","Amanda","11-9554-3336","Dev Back End Pleno","8790.00");
        inserirLinha("FUNCIONARIOS","3","Bruna","19-9996-6547","Dev Java","15400.00");

        //Atualizando os dados da tebela
        sqlUpdate("FUNCIONARIOS", "1", "CARGO", "DEV JUNIOR");

        //Apagando um registro
        sqlApagar("FUNCIONARIOS","ID","2");
        sqlApagar("FUNCIONARIOS","NOME","João");

        //mostra a tabela
        mostrarDados();



    }
}
