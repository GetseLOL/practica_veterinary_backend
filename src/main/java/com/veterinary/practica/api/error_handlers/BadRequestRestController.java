package com.veterinary.practica.api.error_handlers;

import com.veterinary.practica.api.models.responses.error.BaseErrorResponse;
import com.veterinary.practica.api.models.responses.error.ErrorResponse;
import com.veterinary.practica.api.models.responses.error.ErrorsResponse;
import com.veterinary.practica.utils.exceptions.IdNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;

@ResponseStatus(HttpStatus.BAD_REQUEST)
@RestControllerAdvice
public class BadRequestRestController{
	@ExceptionHandler(IdNotFoundException.class)
	public BaseErrorResponse handleIdNotFound(IdNotFoundException exception){
		return ErrorResponse
				.builder()
				.message(exception.getMessage())
				.status(HttpStatus.BAD_REQUEST.name())
				.code(HttpStatus.BAD_REQUEST.value())
				.build();
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public BaseErrorResponse handleIdNotFound(MethodArgumentNotValidException exception){
		var errors = new ArrayList<String>();

		exception.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));

		return ErrorsResponse.builder()
		                     .errors(errors)
		                     .status(HttpStatus.BAD_REQUEST.name())
		                     .code(HttpStatus.BAD_REQUEST.value())
		                     .build();

	}

}
