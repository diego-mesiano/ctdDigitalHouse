package service;

import model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaServiceImpl {

    private List<Pessoa> pessoas = new ArrayList<>();

    public void guardarPessoa(Pessoa pessoa) {
        if(pessoa.eMaiorIdade()){
            pessoas.add(pessoa);
        }
    }

    public List<Pessoa> getPessoas(){
        return pessoas;
    }

}
