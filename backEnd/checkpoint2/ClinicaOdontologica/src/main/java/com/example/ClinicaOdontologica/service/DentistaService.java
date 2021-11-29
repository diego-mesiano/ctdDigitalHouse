package com.example.ClinicaOdontologica.service;

import com.example.ClinicaOdontologica.model.Dentista;
import com.example.ClinicaOdontologica.repository.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DentistaService implements IService<Dentista>{

    @Autowired
    private DentistaRepository dentistaRepository;



    @Override
    public Dentista cadastrar(Dentista dentista) {
        return dentistaRepository.save(dentista);
    }

    @Override
    public void deletar(Dentista dentista) {
        dentistaRepository.delete(dentista);
    }

    @Override
    public Dentista buscarPeloId(Long id) {
        return dentistaRepository.findById(id).get();
    }

    @Override
    public List<Dentista> buscarTodos() {
        return dentistaRepository.findAll();
    }

    @Override
    public Dentista atualizar(Dentista dentista) {
        return dentistaRepository.save(dentista);
    }
}
