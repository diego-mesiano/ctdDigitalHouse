package com.diego.HQLtime.repository;

import com.diego.HQLtime.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
    //para criar um novo jogador, podemos usar um método save do JPA
    //para listar todos os jogadores, podemos usar um método findAll do JPA

    @Query("SELECT j FROM Jogador j WHERE j.nome = ?1")
    Optional<Jogador> findByNome(String nome);

    @Query("SELECT j FROM Jogador j WHERE j.nome = ?1")
    List<Jogador> findByNomeContaining(String nome);


}
