package com.example.apiexemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiexemplo.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> { //passada a entidade e o tipo do id

	Produto findById(long id);
}
