package com.example.ClinicaOdontologica.service;

import com.example.ClinicaOdontologica.model.Endereco;
import com.example.ClinicaOdontologica.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService implements IService<Endereco>{

    private EnderecoRepository enderecoRepository;

    @Autowired
    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    @Override
    public Endereco cadastrar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    @Override
    public void deletar(Endereco endereco) {
        enderecoRepository.delete(endereco);
    }

    @Override
    public Endereco buscarPeloId(Long id) {
        return enderecoRepository.findById(id).get();
    }

    @Override
    public List<Endereco> buscarTodos() {
        return enderecoRepository.findAll();
    }

    @Override
    public Endereco atualizar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
}
