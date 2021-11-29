package com.example.ClinicaOdontologica.service;

import com.example.ClinicaOdontologica.model.Paciente;
import com.example.ClinicaOdontologica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService implements IService<Paciente>{

    private PacienteRepository pacienteRepository;

    @Autowired
    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public Paciente cadastrar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public void deletar(Paciente paciente) {
        pacienteRepository.delete(paciente);
    }

    @Override
    public Paciente buscarPeloId(Long id) {
        return pacienteRepository.findById(id).get();
    }

    @Override
    public List<Paciente> buscarTodos() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente atualizar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }
}
