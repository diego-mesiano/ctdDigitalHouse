package com.digitalhouse.escola.controller;

import com.digitalhouse.escola.model.Aluno;
import com.digitalhouse.escola.repository.IAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {


    private IAlunoRepository alunoRepository;

    @Autowired
    public AlunoController(IAlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    @PostMapping
    private ResponseEntity<Aluno> cadastraAluno(Aluno aluno){
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoRepository.save(aluno));
    }

    @GetMapping
    private ResponseEntity<List<Aluno>> listarT
}
