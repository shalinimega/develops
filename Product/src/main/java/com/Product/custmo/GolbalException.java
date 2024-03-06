package com.Product.custmo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GolbalException {
	@ExceptionHandler(Hsnnotfound.class)
	public ResponseEntity<Object> hsnnot(Hsnnotfound e)
	{
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Priceless.class)
	public ResponseEntity<Object> Priceless(Priceless e)
	{
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}

	
}

