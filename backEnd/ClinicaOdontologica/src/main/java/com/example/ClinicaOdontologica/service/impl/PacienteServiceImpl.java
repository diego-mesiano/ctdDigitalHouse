package com.example.ClinicaOdontologica.service.impl;

import com.example.ClinicaOdontologica.domain.Endereco;
import com.example.ClinicaOdontologica.domain.Paciente;
import com.example.ClinicaOdontologica.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PacienteServiceImpl implements IPacienteService<Paciente> {

    @Autowired
    private PacienteServiceImpl pacienteService;

    @Override
    public List<Paciente> mostrar() {
        Paciente paciente1 = new Paciente(1, "João", "Almeida", "a@gmail.com", "2222", new Date(), new Endereco("rua a", "20", "Campinas", "SP"));
        Paciente paciente2 = new Paciente(2, "Alan", "Alves", "a@gmail.com", "2222", new Date(), new Endereco("rua a", "20", "Campinas", "SP"));
        Paciente paciente3 = new Paciente(3, "Amanda", "Nogueira", "a@gmail.com", "2222", new Date(), new Endereco("rua a", "20", "Campinas", "SP"));
        List<Paciente> listaPacientes = new ArrayList<>();
        listaPacientes.add(paciente1);
        listaPacientes.add(paciente2);
        listaPacientes.add(paciente3);
        return listaPacientes;
    }
}
