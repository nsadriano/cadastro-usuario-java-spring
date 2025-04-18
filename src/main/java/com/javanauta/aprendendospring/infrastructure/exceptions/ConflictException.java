package com.javanauta.aprendendospring.infrastructure.exceptions;

public class ConflictException extends RuntimeException{
	
	public ConflictException(String message) {
		super(message);
	}
	
	public ConflictException(String message, Throwable causa) {
		super(message, causa);
	}
}
