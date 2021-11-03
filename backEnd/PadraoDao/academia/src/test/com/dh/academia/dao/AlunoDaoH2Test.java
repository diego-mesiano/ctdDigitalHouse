package test.com.dh.academia.dao;

import main.com.dh.academia.dao.ConfiguracaoJDBC;
import main.com.dh.academia.dao.IDao;
import main.com.dh.academia.dao.impl.AlunoDaoH2;
import main.com.dh.academia.model.Aluno;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;
@RunWith(JUnit4.class)
public class AlunoDaoH2Test {
    private  static IDao<Aluno> alunoDao = new AlunoDaoH2(new ConfiguracaoJDBC());

    @BeforeClass
    public static void cargarEstudiantes() {
        alunoDao.salvar(new Aluno("1", "EstudianteUno", "ApellidoUno"));
        alunoDao.salvar(new Aluno("2", "EstudianteDos", "ApellidoDos"));
        alunoDao.salvar(new Aluno("3", "EstudianteTres", "ApellidoTres"));
        alunoDao.salvar(new Aluno("4", "EstudianteCuatro", "ApellidoCuatro"));
    }

    @Test
    public  void guardarYBuscarEstudiantesTest() {
        alunoDao.salvar(new Aluno("5", "Tomas", "Pereyra"));
        Aluno aluno = alunoDao.buscar("5");
        Assert.assertNotNull(aluno);
        Assert.assertEquals(aluno.getNome(), "Tomas");

    }

    @Test
    public  void traerTodosLosEstudiantesTest() {
        List<Aluno> alunos = alunoDao.buscarTodos();
        Assert.assertEquals(alunos.size(), 34);
    }

    @Test
    public void eliminarEstudianteTest() {
        alunoDao.apagar("1");
        Assert.assertEquals(alunoDao.buscar("1"),null);


    }


}
