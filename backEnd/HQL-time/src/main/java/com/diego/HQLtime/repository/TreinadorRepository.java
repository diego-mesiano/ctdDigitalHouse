package com.diego.HQLtime.repository;

import com.diego.HQLtime.model.Jogador;
import com.diego.HQLtime.model.Treinador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TreinadorRepository extends JpaRepository<Treinador, Long> {

    //para criar um novo treinador, podemos usar um método save do JPA
    //para listar todos os treinadores, podemos usar um método findAll do JPA


    @Query("SELECT t FROM Treinador t WHERE t.nome = ?1")
    Optional<Treinador> findByNome(String nome);

    @Query("SELECT j FROM Jogador j WHERE j.treinador.nome = ?1")
    List<Jogador> findByNomeTreinador(String nome);
}
