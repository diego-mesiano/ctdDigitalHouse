package com.example.ClinicaOdontologica.controller;




import com.example.ClinicaOdontologica.model.Dentista;
import com.example.ClinicaOdontologica.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/dentista")
public class DentistaController {

    private DentistaService dentistaService;

    @Autowired
    public DentistaController(DentistaService dentistaService) {
        this.dentistaService = dentistaService;
    }

    @PostMapping()
    public ResponseEntity<Dentista> registrar(@RequestBody Dentista dentista) {
        return ResponseEntity.ok(dentistaService.cadastrar(dentista));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dentista> buscarPorId(@PathVariable Long id) {// Long?
        Dentista dentista = dentistaService.buscarPeloId(id); //.orElse(null);

        return ResponseEntity.ok(dentista);
    }

    @PutMapping()
    public ResponseEntity<Dentista> atualizar(@RequestBody Dentista dentista) {
        return ResponseEntity.ok(dentistaService.atualizar(dentista));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarPorId(@PathVariable Long id) {
        dentistaService.deletar(dentistaService.buscarPeloId(id));
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @GetMapping
    public ResponseEntity<List<Dentista>> buscarTodos(){
        return ResponseEntity.ok(dentistaService.buscarTodos());
    }



}

