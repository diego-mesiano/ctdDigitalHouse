package com.integradoraIX.loja.service;

import com.integradoraIX.loja.model.Produto;

import java.util.List;

public interface ProdutoService {

    public List<Produto> listarTodos();
    public  Produto cadastrar(Produto produto);
    public void excluir(Long id);
    public  Produto atualizar(Produto produto);

}
