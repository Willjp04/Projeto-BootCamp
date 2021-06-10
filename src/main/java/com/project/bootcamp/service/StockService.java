package com.project.bootcamp.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bootcamp.mapper.StockMapper;
import com.project.bootcamp.model.Stock;
import com.project.bootcamp.model.dto.StockDTO;
import com.project.bootcamp.repository.StockRepository;

// A CAMADA SERVICE ATENDE A PARTE NEGOCIAL
@Service //GERENCIA AS CRIAÇÕES DOS OBJETOS
public class StockService {
	
	@Autowired
	private StockRepository repository;
	
	@Autowired
	private StockMapper mapper;

	public StockDTO save (@Valid StockDTO dto) {
		Stock stock = mapper.toEntity(dto);
		repository.save(stock);
		return dto;

		
	}
	
	

}
