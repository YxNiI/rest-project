package com.vocational_school.rest_project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vocational_school.rest_project.business.exceptions.NotFoundException;
import com.vocational_school.rest_project.domain.ErrorMessage;

/**
 * Handles exceptions which get thrown through a REST-operation.
 */
@ControllerAdvice(basePackageClasses = CottageController.class)
public class RestExceptionHaendler
{
    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<ErrorMessage> handleNotFoundException(NotFoundException e)
    {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setMessage(e.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body(errorMessage);
    }

}
