package com.integradoraIX.loja.controller;

import com.integradoraIX.loja.model.Produto;
import com.integradoraIX.loja.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.cadastrar(produto));
    }

    @GetMapping
    public ResponseEntity<List<Produto>> buscarTodosProdutos(){
        return ResponseEntity.ok(produtoService.listarTodos());
    }

    @DeleteMapping("/{id}")
    public void eliminarUmProduto(@PathVariable Long id){
        produtoService.excluir(id);
    }

    @PutMapping
    public ResponseEntity<Produto> subtrairQuantidadeProduto(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.OK).body(produtoService.atualizar(produto));
    }
}
