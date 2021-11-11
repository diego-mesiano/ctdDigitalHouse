package com.example.ClinicaOdontologica.controller;

import com.example.ClinicaOdontologica.domain.Endereco;
import com.example.ClinicaOdontologica.domain.Paciente;
import com.example.ClinicaOdontologica.service.IPacienteService;
import com.example.ClinicaOdontologica.service.impl.PacienteServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
public class PacienteController {
    @Autowired
    IPacienteService pacientes;

    public PacienteController(PacienteServiceImpl pacientes) {
        this.pacientes = pacientes;
    }


    @GetMapping("/pacientes")
    @ResponseBody
    public List<Paciente> mostrarPacientes(){

        return pacientes.mostrar();

    }

}
