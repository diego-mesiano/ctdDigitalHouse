package com.diego.HQLtime.controler;

import com.diego.HQLtime.model.Treinador;
import com.diego.HQLtime.repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/treinador")
public class TreinadorController {

    private TreinadorRepository treinadorRepository;

    @Autowired
    public TreinadorController(TreinadorRepository treinadorRepository) {
        this.treinadorRepository = treinadorRepository;
    }

    @PostMapping
    private ResponseEntity<Treinador> treinadorJogador(@RequestBody Treinador treinador){
        return ResponseEntity.status(HttpStatus.CREATED).body(treinadorRepository.save(treinador));
    }

    @GetMapping
    private ResponseEntity<List<Treinador>> listarTreinadoresCadastrados(){
        return ResponseEntity.ok(treinadorRepository.findAll());
    }

    @GetMapping("/nome/{nome}")
    private ResponseEntity<Optional<Treinador>> listarTreinadorPorNome(@PathVariable String nome){
        return ResponseEntity.ok(treinadorRepository.findByNome(nome));
    }
}
