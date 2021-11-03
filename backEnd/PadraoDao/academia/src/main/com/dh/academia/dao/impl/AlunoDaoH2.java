package main.com.dh.academia.dao.impl;

import main.com.dh.academia.dao.ConfiguracaoJDBC;
import main.com.dh.academia.dao.IDao;
import main.com.dh.academia.model.Aluno;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlunoDaoH2 implements IDao<Aluno> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public AlunoDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Aluno salvar(Aluno aluno) {
        Connection connection = configuracaoJDBC.conectarComBaseDeDados();
        Statement stmt = null;
        String query = String.format("INSERT INTO estudiantes VALUES('%s','%s','%s')", aluno.getId(), aluno.getNome(), aluno.getSobrenome());
        try {
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return aluno;
    }

    @Override
    public void apagar(String id) {
        Connection connection = configuracaoJDBC.conectarComBaseDeDados();
        Statement stmt = null;
        String query = String.format("DELETE FROM estudiantes where id = %s", id);
        try {
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    @Override
    public Aluno buscar(String id) {
        Connection connection = configuracaoJDBC.conectarComBaseDeDados();
        Statement stmt = null;
        String query = String.format("SELECT id,nombre,apellido  FROM estudiantes where id = '%s'", id);
        Aluno aluno = null;
        try {
            stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                String idEstudiante = result.getString("id");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                aluno = new Aluno(idEstudiante, nombre, apellido);
            }

            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return aluno;
    }

    @Override
    public List<Aluno> buscarTodos() {
        Connection connection = configuracaoJDBC.conectarComBaseDeDados();
        Statement stmt = null;
        String query = "SELECT *  FROM estudiantes";
        List<Aluno> alunos = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                String id = result.getString("id");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");
                alunos.add(new Aluno(id, nombre, apellido));

            }

            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return alunos;
    }
}
