package com.diegomesiano.transportadoramongo.service;

import com.diegomesiano.transportadoramongo.model.Pacote;
import com.diegomesiano.transportadoramongo.model.Status;
import com.diegomesiano.transportadoramongo.repository.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacoteService {

    private PacoteRepository pacoteRepository;

    @Autowired
    public PacoteService(PacoteRepository pacoteRepository) {
        this.pacoteRepository = pacoteRepository;
    }

    public Pacote adicionar (Pacote pacote){
        return pacoteRepository.save(pacote);
    }

    public List<Pacote> listar(){
        return pacoteRepository.findAll();
    }

    public List<Pacote> listarPacoteACaminho(){
        return pacoteRepository.findAllByStatus(Status.A_CAMINHO);
    }

    public List<Pacote> listarPacoteEntregue(){
        return pacoteRepository.findAllByStatus(Status.ENTREGUE);
    }
}
