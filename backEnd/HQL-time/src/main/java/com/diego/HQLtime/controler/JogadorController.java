package com.diego.HQLtime.controler;

import com.diego.HQLtime.model.Jogador;
import com.diego.HQLtime.model.Treinador;
import com.diego.HQLtime.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    private JogadorRepository jogadorRepository;

    @Autowired
    public JogadorController(JogadorRepository jogadorRepository) {
        this.jogadorRepository = jogadorRepository;
    }

    @PostMapping
    private ResponseEntity<Jogador> cadastrarJogador(@RequestBody Jogador jogador){
        return ResponseEntity.status(HttpStatus.CREATED).body(jogadorRepository.save(jogador));
    }

    @GetMapping
    private ResponseEntity<List<Jogador>> listarJogadoresCadastrados(){
        return ResponseEntity.ok(jogadorRepository.findAll());
    }

    @GetMapping("/nome/{nome}")
    private ResponseEntity<Optional<Jogador>> listarJogadorPorNome(@PathVariable String nome){
        return ResponseEntity.ok(jogadorRepository.findByNome(nome));
    }
}
