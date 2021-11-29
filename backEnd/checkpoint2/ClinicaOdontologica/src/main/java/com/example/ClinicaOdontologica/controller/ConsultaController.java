package com.example.ClinicaOdontologica.controller;

import com.example.ClinicaOdontologica.model.Consulta;
import com.example.ClinicaOdontologica.model.Dentista;
import com.example.ClinicaOdontologica.service.ConsultaService;
import com.example.ClinicaOdontologica.service.DentistaService;
import com.example.ClinicaOdontologica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {


    private ConsultaService consultaService;
    private PacienteService pacienteService;
    private DentistaService dentistaService;

    @Autowired
    public ConsultaController(ConsultaService consultaService, PacienteService pacienteService, DentistaService dentistaService) {
        this.consultaService = consultaService;
        this.pacienteService = pacienteService;
        this.dentistaService = dentistaService;
    }

    @PostMapping("/idPaciente/{idPaciente}/idDentista/{idDentista}")
    public ResponseEntity<Consulta> registrar(@PathVariable Long idPaciente, @PathVariable Long idDentista) {
        Consulta consulta = new Consulta();
        consulta.setPaciente(pacienteService.buscarPeloId(idPaciente));
        consulta.setDentista(dentistaService.buscarPeloId(idDentista));
        return ResponseEntity.status(HttpStatus.CREATED).body(consultaService.cadastrar(consulta));
    }

    @GetMapping
    public ResponseEntity<List<Consulta>> buscarTodos() {
        return ResponseEntity.ok(consultaService.buscarTodos());
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        consultaService.deletar(consultaService.buscarPeloId(id));

    }

    @PutMapping
    public ResponseEntity<Consulta> atualizar(@RequestBody Consulta consulta) {
        return ResponseEntity.ok(consultaService.atualizar(consulta));


    }


}
