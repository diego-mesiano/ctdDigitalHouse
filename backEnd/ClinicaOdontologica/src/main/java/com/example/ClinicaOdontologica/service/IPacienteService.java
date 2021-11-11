package com.example.ClinicaOdontologica.service;

import com.example.ClinicaOdontologica.domain.Endereco;
import com.example.ClinicaOdontologica.domain.Paciente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface IPacienteService<Paciente> {
    List<Paciente> mostrar();
}
