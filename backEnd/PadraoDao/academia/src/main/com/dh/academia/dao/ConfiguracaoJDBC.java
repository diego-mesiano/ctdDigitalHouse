package main.com.dh.academia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {

    private final String jdbcDriver;
    private final String dbUrl;
    private final String nomeDeUsuario;
    private final String senhaDeUsuario;
    private Connection conexao;

    //Podemos usar este construtor para conectarmos com outras configurações
    public ConfiguracaoJDBC(String jdbcDriver, String dbUrl, String nomeDeUsuario, String senhaDeUsuario) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nomeDeUsuario = nomeDeUsuario;
        this.senhaDeUsuario = senhaDeUsuario;
    }

    public ConfiguracaoJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:~/test;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nomeDeUsuario = "sa";
        this.senhaDeUsuario = "";
    }

    public Connection conectarComBaseDeDados() {
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection(dbUrl, nomeDeUsuario, senhaDeUsuario);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return conexao;
    }


}
