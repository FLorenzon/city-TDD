package com.devsuperior.bds02.services.exceptions;

public class BadRequestException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public BadRequestException(String msg) {
		super(msg);
	}

}
