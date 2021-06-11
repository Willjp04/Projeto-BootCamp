package com.project.bootcamp.exceptions;

//CAMADA DE EXCESSÃO

public class BusinessException extends RuntimeException {

	public BusinessException(String message) {
		super(message);
	}

}
