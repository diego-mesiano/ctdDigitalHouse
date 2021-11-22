package com.digitalhouse.blogpessoal.controller;

import com.digitalhouse.blogpessoal.model.Usuario;
import com.digitalhouse.blogpessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //metodo get obter todos os usuarios cadastrados
    @GetMapping
    private ResponseEntity<List<Usuario>> obterTodos(){
        return ResponseEntity.ok(usuarioRepository.findAll());
    }

    //metodo get para obter um usuario especifico por id
    @GetMapping("/{id}")
    private ResponseEntity<Usuario> obterPorId(@PathVariable Integer id){
        return usuarioRepository.findById(id).map(
                resp -> ResponseEntity.ok(resp)
        ).orElse(ResponseEntity.notFound().build());
    }

    //metodo get para obter usuario por nome especifico
    @GetMapping("/none/{nome}")
    private ResponseEntity<Usuario> obterPorNome (@PathVariable String nome){
        return  ResponseEntity.ok(usuarioRepository.buscarPorUsuario(nome));
    }

    //metodo post para cadastrar usuario
    @PostMapping
    private ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario){
        return  ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuario));
    }

    //metodo put para atualizar usuario
    @PutMapping
    private ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.save(usuario));
    }

    //metodo delete para deletar usuario
    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Integer id){
        usuarioRepository.deleteById(id);
    }

}
