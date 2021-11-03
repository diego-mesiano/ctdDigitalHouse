package main.com.dh.academia.dao.impl;

import main.com.dh.academia.dao.IDao;
import main.com.dh.academia.model.Aluno;

import java.util.List;

public class AlunoDaoEmMemoria implements IDao<Aluno> {
    private List<Aluno> alunoRepositorio;

    public AlunoDaoEmMemoria(List<Aluno> alunoRepositorio) {
        this.alunoRepositorio = alunoRepositorio;
    }

    @Override
    public Aluno salvar(Aluno aluno) {
        alunoRepositorio.add(aluno);
        return aluno;
    }

    @Override
    public void apagar(String id) {
        alunoRepositorio.removeIf(estudiante -> estudiante.getId().equals(id));
    }

    //Utilizamos streams para buscar una materia por id, y tomamos el primero si hay, si no, devolvemos null.
    @Override
    public Aluno buscar(String id) {
        return alunoRepositorio.stream().filter(estudiante -> estudiante.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Aluno> buscarTodos() {
        return alunoRepositorio;
    }
}
