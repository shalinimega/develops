package com.Bank.customException;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(IfscNotfoundException.class)

		public ResponseEntity<Object>IfscNotfound(IfscNotfoundException e)
		{
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	@ExceptionHandler(NoSuchElementException.class)
	    public ResponseEntity<Object>message(NoSuchElementException e)
	    {
		return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	    }

}


