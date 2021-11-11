package com.example.ClinicaOdontologica.service;

import com.example.ClinicaOdontologica.domain.Paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteService {
    private List<Paciente> pacientes = new ArrayList<>();

    public List<Paciente> mostrarTodos(){
        return this.pacientes;
    }
}
