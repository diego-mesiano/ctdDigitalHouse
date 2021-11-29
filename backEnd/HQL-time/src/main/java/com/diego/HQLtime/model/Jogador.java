package com.diego.HQLtime.model;

import javax.persistence.*;

@Entity
@Table(name="tb_jogadores")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String timeFavorito;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "treinador_id")
    private Treinador treinador;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTimeFavorito() {
        return timeFavorito;
    }

    public void setTimeFavorito(String timeFavorito) {
        this.timeFavorito = timeFavorito;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }
}


