package com.example.ClinicaOdontologica.service;

import com.example.ClinicaOdontologica.model.Consulta;
import com.example.ClinicaOdontologica.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ConsultaService implements IService<Consulta>{

    private ConsultaRepository consultaRepository;

    @Autowired
    public ConsultaService(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    @Override
    public Consulta cadastrar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    @Override
    public void deletar(Consulta consulta) {
        consultaRepository.delete(consulta);
    }

    @Override
    public Consulta buscarPeloId(Long id) {
        return consultaRepository.findById(id).get();
    }

    @Override
    public List<Consulta> buscarTodos() {
        return consultaRepository.findAll();
    }

    @Override
    public Consulta atualizar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }


}
