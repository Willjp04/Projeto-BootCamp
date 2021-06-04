package com.project.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bootcamp.model.Stock;

@Repository //ESSA CAMADA FAZ A CONEXÃO DA ENTIDADE/CLASSE COM O BANCO DE DADOS ONDE FAZ O CRUD.
// TRABALHANDO COM JPA O REPORITÓRIO É UMA INTERFACE.
public interface StockRepository extends JpaRepository<Stock, Long> {

}
