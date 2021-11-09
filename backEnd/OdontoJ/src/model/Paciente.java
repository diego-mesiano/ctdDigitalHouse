package model;

import java.util.Date;

public class Paciente{
    private int idPaciente;
    private Date dataCadastro;
    private String nome;
    private String sobrenome;
    private String rg;
    private Endereco endereco;

    public Paciente(String nome, String sobrenome, String rg, Endereco endereco) {
        this.idPaciente = idPaciente;
        this.dataCadastro = new Date();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.endereco = endereco;
    }
}
