package com.dh.clinica.controller;

import com.dh.clinica.model.Paciente;
import com.dh.clinica.repository.impl.PacienteDaoH2;
import com.dh.clinica.service.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private PacienteService pacienteService = new PacienteService(new PacienteDaoH2());

    @PostMapping()
    public ResponseEntity<Paciente> registrar(@RequestBody Paciente paciente) {

        return ResponseEntity.ok(pacienteService.salvar(paciente));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Paciente> buscarPorId(@PathVariable Integer id) {
        Paciente paciente = pacienteService.buscar(id).orElse(null);

        return ResponseEntity.ok(paciente);
    }

    @PutMapping()
    public ResponseEntity<Paciente> atualizar(@RequestBody Paciente paciente) {
        ResponseEntity<Paciente> response = null;

        if (paciente.getId() != null && pacienteService.buscar(paciente.getId()).isPresent())
            response = ResponseEntity.ok(pacienteService.atualizar(paciente));
        else
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarPorId(@PathVariable Integer id) {
        ResponseEntity<String> response = null;

        if (pacienteService.buscar(id).isPresent()) {
            pacienteService.excluir(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Paciente deletado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> buscarTodos(){
        return ResponseEntity.ok(pacienteService.buscarTodos());
    }

}
