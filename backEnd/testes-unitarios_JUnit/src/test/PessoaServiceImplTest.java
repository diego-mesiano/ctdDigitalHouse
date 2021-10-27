package test;

import model.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.PessoaServiceImpl;

public class PessoaServiceImplTest {
    Pessoa pessoa;
    Pessoa pessoa1;
    Pessoa pessoa2;
    Pessoa pessoa3;
    Pessoa pessoa4;
    PessoaServiceImpl pessoaService;

    @BeforeEach
    void doBefore(){
        pessoa = new Pessoa("Bruno","Barbosa");
        pessoa.setIdade(25);
        pessoa1 = new Pessoa("William","Rodrigues");
        pessoa1.setIdade(26);
        pessoa2 = new Pessoa("Anderson", "Ribeiro");
        pessoa2.setIdade(16);
        pessoa3 = new Pessoa("Maria", "Ribeiro");
        pessoa3.setIdade(29);
        pessoa4 = new Pessoa("Gabi", "Mesiano");
        pessoa4.setIdade(7);
    }

    @Test
    void testGuardaPessoas(){
        PessoaServiceImpl pessoaService = new PessoaServiceImpl();
        pessoaService.guardarPessoa(pessoa);
        pessoaService.guardarPessoa(pessoa1);
        pessoaService.guardarPessoa(pessoa2);
        pessoaService.guardarPessoa(pessoa3);
        pessoaService.guardarPessoa(pessoa4);

        Assertions.assertEquals(pessoaService.getPessoas().size(), 3);



    }

}
