package test.com.dh.academia.dao;

import main.com.dh.academia.dao.IDao;
import main.com.dh.academia.dao.impl.AlunoDaoEmMemoria;
import main.com.dh.academia.model.Aluno;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AlunoDaoEmMemoriaTest {
    private IDao<Aluno> alunoDao = new AlunoDaoEmMemoria(new ArrayList());

    @Before
    public void cargarEstudiantes() {
        alunoDao.salvar(new Aluno("1", "EstudianteUno", "ApellidoUno"));
        alunoDao.salvar(new Aluno("2", "EstudianteDos", "ApellidoDos"));
        alunoDao.salvar(new Aluno("3", "EstudianteTres", "ApellidoTres"));
        alunoDao.salvar(new Aluno("4", "EstudianteCuatro", "ApellidoCuatro"));
    }

    @Test
    public void guardarYBuscarEstudiantesTest() {

        alunoDao.salvar(new Aluno("5", "Tomas", "Pereyra"));
        Aluno aluno = alunoDao.buscar("5");
        Assert.assertNotNull(aluno);
        Assert.assertEquals(aluno.getNome(), "Tomas");

    }

    @Test
    public void traerTodosLosEstudiantesTest() {
        List<Aluno> alunos = alunoDao.buscarTodos();
        Assert.assertEquals(alunos.size(), 4);
    }
    @Test
    public void eliminarEstudianteTest() {
        alunoDao.apagar("1");
        Assert.assertEquals(alunoDao.buscar("1"),null);


    }
}
