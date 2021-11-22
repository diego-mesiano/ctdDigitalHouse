package com.integradoraIX.loja.service;

import com.integradoraIX.loja.model.Produto;
import com.integradoraIX.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto cadastrar(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void excluir(Long id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public Produto atualizar(Produto produto) {
        return produtoRepository.save(produto);
    }
}
