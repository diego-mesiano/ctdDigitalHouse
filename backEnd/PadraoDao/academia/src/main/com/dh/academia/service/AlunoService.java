package main.com.dh.academia.service;

import main.com.dh.academia.dao.IDao;
import main.com.dh.academia.model.Aluno;

import java.util.List;

public class AlunoService {

    private IDao<Aluno> alunoDao;

    public AlunoService() {

    }

    public AlunoService(IDao<Aluno> alunoDao) {
        this.alunoDao = alunoDao;
    }

    public void setAlunoDao(IDao<Aluno> alunoDao) {
        this.alunoDao = alunoDao;
    }

    public Aluno salvarAluno(Aluno aluno){
        alunoDao.salvar(aluno);
        return aluno;
    }
    public List<Aluno> buscarTodos(){
        return alunoDao.buscarTodos();
    }

    public Aluno buscar(String id){
        return alunoDao.buscar(id);
    }

}
