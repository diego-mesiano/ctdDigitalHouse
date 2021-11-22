package com.integradoraIX.loja.repository;

import com.integradoraIX.loja.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {


}
