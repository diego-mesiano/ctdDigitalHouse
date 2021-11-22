package com.digitalhouse.blogpessoal.repository;

import com.digitalhouse.blogpessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Integer>{
    public Usuario buscarPorUsuario(String usuario);
}
