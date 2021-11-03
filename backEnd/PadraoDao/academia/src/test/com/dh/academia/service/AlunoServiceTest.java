package test.com.dh.academia.service;

import main.com.dh.academia.dao.ConfiguracaoJDBC;
import main.com.dh.academia.dao.IDao;
import main.com.dh.academia.dao.impl.AlunoDaoEmMemoria;
import main.com.dh.academia.dao.impl.AlunoDaoH2;
import main.com.dh.academia.model.Aluno;
import main.com.dh.academia.service.AlunoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class AlunoServiceTest {

    private IDao<Aluno> alunoDaoEmMemoria = new AlunoDaoEmMemoria(new ArrayList());
    private IDao<Aluno> alunoDaoH2 = new AlunoDaoH2(new ConfiguracaoJDBC());
    private AlunoService alunoService = new AlunoService();


    @Before
    public void cargarEstudiantesCambiandoImplementacionDAO() {
        alunoService.setAlunoDao(alunoDaoEmMemoria);
        alunoService.salvarAluno(new Aluno("1", "EstudianteUno", "ApellidoUno"));
        alunoService.setAlunoDao(alunoDaoH2);
        alunoService.salvarAluno(new Aluno("2", "EstudianteDos", "ApellidoDos"));


    }
    @Test
    public void buscarEstudiantesCambiandoImplementacionDAO(){
        alunoService.setAlunoDao(alunoDaoEmMemoria);
        Aluno aluno = alunoService.buscar("1");
        Assert.assertEquals(aluno.getId(),"1");
        Assert.assertEquals(aluno.getNome(),"EstudianteUno");
        Assert.assertEquals(aluno.getSobrenome(),"ApellidoUno");
        alunoService.setAlunoDao(alunoDaoH2);
        aluno = alunoService.buscar("2");
        Assert.assertEquals(aluno.getId(),"2");
        Assert.assertEquals(aluno.getNome(),"EstudianteDos");
        Assert.assertEquals(aluno.getSobrenome(),"ApellidoDos");

    }



}
