package com.digitalhouse.escola.model;

import jdk.dynalink.linker.LinkerServices;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_professores")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String curso;

    @OneToMany(mappedBy = "professor",fetch = FetchType.LAZY)
    private List<Aluno> alunos = new ArrayList<>();
}
