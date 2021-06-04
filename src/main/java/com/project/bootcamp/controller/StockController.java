package com.project.bootcamp.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bootcamp.model.dto.StockDTO;
import com.project.bootcamp.service.StockService;

@RestController
@RequestMapping(value = "/stock")
public class StockController {

	// INSERIR NA BASE DE DADOS
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StockDTO> save(@Valid @RequestBody StockDTO dto) {
		return ResponseEntity.ok(dto);
	}

	// ATUALIZAR ALGO NA BASE DE DADOS
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StockDTO> update(@Valid @RequestBody StockDTO dto) {
		return ResponseEntity.ok(dto);
	}

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<StockDTO>> findAll() {
		List<StockDTO> list = new ArrayList<>();
		StockDTO dto = new StockDTO();
		dto.setId(1L);
		dto.setName("Magazine Luiza");
		dto.setPrice(100D);
		dto.setVariation(18D);
		dto.setDate(LocalDate.now());
		list.add(dto);
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StockDTO> findById(@PathVariable Long id) {
		List<StockDTO> list = new ArrayList<>();
		StockDTO stock1 = new StockDTO();
		stock1.setId(1L);
		stock1.setName("Magazine Luiza");
		stock1.setPrice(100D);
		stock1.setVariation(18D);
		stock1.setDate(LocalDate.now());

		StockDTO stock2 = new StockDTO();
		stock2.setId(2L);
		stock2.setName("Ponto Frio");
		stock2.setPrice(200D);
		stock2.setVariation(5D);
		stock2.setDate(LocalDate.now());

		StockDTO stock3 = new StockDTO();
		stock3.setId(3L);
		stock3.setName("Casas Bahia");
		stock3.setPrice(300D);
		stock3.setVariation(8D);
		stock3.setDate(LocalDate.now());
		list.add(stock1);
		list.add(stock2);
		list.add(stock3);
		StockDTO stock4 = new StockDTO();
		stock4.setId(4L);
		stock4.setName("Americanas");
		stock4.setPrice(300D);
		stock4.setVariation(8D);
		stock4.setDate(LocalDate.now());
		list.add(stock1);
		list.add(stock2);
		list.add(stock3);
		list.add(stock4);

		StockDTO dtoSelect = list.stream().filter(x -> x.getId().compareTo(id) == 0).findFirst().get();
		return ResponseEntity.ok(dtoSelect);
	}

}
