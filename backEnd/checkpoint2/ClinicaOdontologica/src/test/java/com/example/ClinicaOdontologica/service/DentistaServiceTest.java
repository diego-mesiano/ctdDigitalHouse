package com.example.ClinicaOdontologica.service;

import com.example.ClinicaOdontologica.model.Dentista;
import com.example.ClinicaOdontologica.repository.DentistaRepository;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@RunWith(SpringRunner.class)
@SpringBootTest

public class DentistaServiceTest {

//    static DentistaService dentistaService = new DentistaService();

    @Autowired
    private static DentistaService dentistaService;
//
//    @Test
//    public void testService(){
//        assertThat(dentistaService).isNotNull();
//    }


//    @BeforeAll
//    public void instanciarDentista(){
//        Dentista dentista = new Dentista();
//        dentista.setNome("Joao");
//        dentista.setSobrenome("Junior");
//        dentista.setMatricula((long) 516156);
//        dentistaService.cadastrar(dentista);
//    }
    @Test
    public void buscarPorIdTest(){
        Dentista dentista = new Dentista();
        dentista.setNome("Joao");
        dentista.setSobrenome("Junior");
        dentista.setMatricula((long) 516156);
            Dentista result = dentistaService.cadastrar(dentista);
            assertThat(result).isNotNull();
    }




}
