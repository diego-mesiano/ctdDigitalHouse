package com.digitalhouse.blogpessoal.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "tb-postagem")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min =2, max=255)
    private String tipoPostagem;

    @Size(min =2, max=511)
    private String textoPostagem;

    @Size(min =2, max=255)
    private String titulo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date data = new Date(System.currentTimeMillis());

    //muitas postagens para 1 usuario
    @ManyToOne
    @JsonIgnoreProperties("postagem")
    private Tema tema;

    //muitas postagens para 1 usuario
    @ManyToOne
    @JsonIgnoreProperties("postagem")
    private Usuario usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoPostagem() {
        return tipoPostagem;
    }

    public void setTipoPostagem(String tipoPostagem) {
        this.tipoPostagem = tipoPostagem;
    }

    public String getTextoPostagem() {
        return textoPostagem;
    }

    public void setTextoPostagem(String textoPostagem) {
        this.textoPostagem = textoPostagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
