package com.bootcamp.Desafio.quality.exceptions;

import com.bootcamp.Desafio.quality.dtos.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ApiExceptionControllerAdvice {
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    protected ResponseEntity<Object> handleDefault(MethodArgumentNotValidException ex, WebRequest request){
        var responseBody = new ErrorResponseDTO();
        responseBody.setCause(ex.getFieldError().getField());
        responseBody.setMessage(ex.getFieldError().getDefaultMessage());
        return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DistrictNotFound.class)
    public ResponseEntity<Object> handleException(DistrictNotFound e) {
        var responseBody = new ErrorResponseDTO();
        responseBody.setCause("This district could not be found");
        responseBody.setMessage(e.getMessage());
        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
    }
}
