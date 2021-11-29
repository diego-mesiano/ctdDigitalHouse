package com.example.ClinicaOdontologica.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IService<T>  {

    T cadastrar(T t);
    void deletar(T t);
    T buscarPeloId(Long id);
    List<T> buscarTodos();
    T atualizar(T t);
}
