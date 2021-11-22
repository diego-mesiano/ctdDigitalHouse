package com.digitalhouse.clinicaodonto.controller;


import com.digitalhouse.clinicaodonto.configuration.ConfigurationJDBC;
import com.digitalhouse.clinicaodonto.model.Dentista;
import com.digitalhouse.clinicaodonto.model.Paciente;
import com.digitalhouse.clinicaodonto.service.DentistaService;
import com.digitalhouse.clinicaodonto.service.PacienteService;
import com.digitalhouse.clinicaodonto.service.impl.DentistaServiceImpl;
import com.digitalhouse.clinicaodonto.service.impl.EnderecoServiceImpl;
import com.digitalhouse.clinicaodonto.service.impl.PacienteServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentista")
public class DentistaController {

    private DentistaService dentistaService = new DentistaService(new DentistaServiceImpl(new ConfigurationJDBC()));

    @PostMapping()
    public ResponseEntity<Dentista> cadastrar(@RequestBody Dentista dentista) {
        return ResponseEntity.ok(dentistaService.cadastrar(dentista));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dentista> buscar(@PathVariable Integer id) {
        return ResponseEntity.ok(dentistaService.buscar(id).orElse(null));
    }

    @PutMapping
    public ResponseEntity<Dentista> atualizar(@RequestBody Dentista dentista) {
        ResponseEntity<Dentista> response = null;
        if (dentista.getId() != null && dentistaService.buscar(dentista.getId()).isPresent())
            response = ResponseEntity.ok(dentistaService.atualizar(dentista));
        else
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluir (@PathVariable Integer id) {
        ResponseEntity<String> response = null;
        if (dentistaService.buscar(id).isPresent()) {
            dentistaService.excluir(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Dentista excluído");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
         return response;
    }

    @GetMapping
    public ResponseEntity <List<Dentista>> buscarTodos () {
        return ResponseEntity.ok(dentistaService.buscarTodos());
    }

}
