package com.dh.clinica.controller;

import com.dh.clinica.repository.impl.DentistaDaoH2;
import com.dh.clinica.repository.impl.PacienteDaoH2;
import com.dh.clinica.repository.impl.TurnoListRepository;
import com.dh.clinica.model.Consulta;
import com.dh.clinica.service.DentistaService;
import com.dh.clinica.service.PacienteService;
import com.dh.clinica.service.ConsultaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {


    private ConsultaService consultaService = new ConsultaService(new TurnoListRepository());
    private PacienteService pacienteService = new PacienteService(new PacienteDaoH2());
    private DentistaService dentistaService = new DentistaService(new DentistaDaoH2());

    @PostMapping
    public ResponseEntity<Consulta> registrar(@RequestBody Consulta consulta) {
        ResponseEntity<Consulta> response;
        if (pacienteService.buscar(consulta.getPaciente().getId()).isPresent()
                && dentistaService.buscar(consulta.getDentista().getId()).isPresent())
            response = ResponseEntity.ok(consultaService.registrar(consulta));

        else
            response = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        return response;


    }

    @GetMapping
    public ResponseEntity<List<Consulta>> buscarTodos() {
        return ResponseEntity.ok(consultaService.listar());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Integer id) {
        ResponseEntity<String> response;
        if (consultaService.buscar(id).isPresent()) {
            consultaService.excluir(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Consulta deletada");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @PutMapping
    public ResponseEntity<Consulta> atualizar(@RequestBody Consulta consulta) {
        return ResponseEntity.ok(consultaService.atualizar(consulta));

    }


}
