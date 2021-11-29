package com.dh.clinica.service;

import com.dh.clinica.repository.IDao;
import com.dh.clinica.model.Consulta;

import java.util.List;
import java.util.Optional;

public class ConsultaService {

    private IDao<Consulta> consultaRepository;

    public ConsultaService(IDao<Consulta> consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    public Consulta registrar(Consulta consulta){
        return  consultaRepository.salvar(consulta);
    }

    public List<Consulta> listar(){
        return consultaRepository.buscarTodos();
    }

    public void excluir(Integer id){
        consultaRepository.excluir(id);
    }

    public Consulta atualizar(Consulta consulta){
        return consultaRepository.atualizar(consulta);
    }

    public Optional<Consulta> buscar(Integer id){
        return consultaRepository.buscar(id);
    }

}
