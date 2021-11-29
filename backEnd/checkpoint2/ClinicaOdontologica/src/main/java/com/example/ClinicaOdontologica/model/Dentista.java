package com.example.ClinicaOdontologica.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

@Table(name = "tb_dentistas", uniqueConstraints = {@UniqueConstraint(columnNames = {"matricula"})})
public class Dentista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private Long matricula;



    //@OneToMany(targetEntity = Paciente.class, mappedBy = "tb_pacientes", fetch = FetchType.EAGER)
    //@JoinColumn(name = "tb_pacientes")

   // @OneToMany(mappedBy = "dentista")
    //private List<Paciente> pacientes = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}

