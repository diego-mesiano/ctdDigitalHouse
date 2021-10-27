package test;

import model.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    Pessoa pessoa;
    Pessoa pessoa1;
    Pessoa pessoa2;

    @BeforeEach
    void doBefore(){
        pessoa = new Pessoa("Bruno","Barbosa");
        pessoa.setIdade(25);
        pessoa1 = new Pessoa("William","Rodrigues");
        pessoa1.setIdade(26);
        pessoa2 = new Pessoa("Anderson", "Ribeiro");
        pessoa2.setIdade(16);
    }

    @Test
    void testConcatenarNomeSobrenome(){
        assertEquals("Bruno Barbosa", pessoa.concatenarNomeSobrenome());
        assertEquals("William Rodrigues", pessoa1.concatenarNomeSobrenome());
        assertEquals("Anderson Ribeiro", pessoa2.concatenarNomeSobrenome());
    }

    @Test
    void testMaiorIdade(){
        assertEquals(pessoa.eMaiorIdade(),true);
        assertEquals(pessoa1.eMaiorIdade(),true);
        assertEquals(pessoa2.eMaiorIdade(),false);
    }
}
