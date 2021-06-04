package com.project.bootcamp.model.dto;


import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

// ESSA CAMADA É QUEM RECEBE E DEVOLVE INFORMAÇÕES PARA QUEM ESTÁ REQUISITANDO
public class StockDTO   {


	private Long id;
	@NotNull // CAMPO OBRIGATÓRIO
	private String name;

	@NotNull // SIGNIFICA CAMPO OBRIGATÓRIO
	@DecimalMin(value = "0.00")
	@Digits(integer = 6, fraction = 2)
	private Double price;
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy") // CONVERTE EM PADRÃO BRASILEIRO A DATA
	private LocalDate date;
	@NotNull // CAMPO OBRIGATÓRIO
	@Digits(integer = 3, fraction = 2)
	private Double Variation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getVariation() {
		return Variation;
	}

	public void setVariation(Double variation) {
		Variation = variation;
	}

}
