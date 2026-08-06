package com.example.practise.Exceptions;

import com.example.practise.response.GenericResponse;
import com.example.practise.response.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity <String> handleValidationException(MethodArgumentNotValidException ex){
        String message = ex.getBindingResult()
                .getFieldError()
                .getDefaultMessage();
        return ResponseEntity.badRequest().body(message);
    }
    @ExceptionHandler(EmployeeNotFound.class)
    public ResponseEntity<GenericResponse<Object>> handleNoRecordsFoundException(EmployeeNotFound ex) {
        GenericResponse<Object> response = new GenericResponse<>(
                ResponseStatus.FAILURE,
                ex.getMessage(),
                null);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<?>handleValidationException(ValidationException ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }




    }



