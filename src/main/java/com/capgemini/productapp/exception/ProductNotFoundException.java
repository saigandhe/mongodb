package com.capgemini.productapp.exception;

@SuppressWarnings("serial")
public class ProductNotFoundException extends Exception {
	
	public ProductNotFoundException() {		
	}
	
	public ProductNotFoundException(String message) {
		super(message);
	}
}
