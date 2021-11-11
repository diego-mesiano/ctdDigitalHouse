package com.example.ClinicaOdontologica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PacienteController {
    @GetMapping("/pacientes")
    public String mostrarPaciente(Model model){
        model.addAttribute("nome")
    }

}
