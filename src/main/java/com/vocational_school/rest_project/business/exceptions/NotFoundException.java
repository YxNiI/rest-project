package com.vocational_school.rest_project.business.exceptions;

/**
 * Thrown when requested data is not found.
 */
public class NotFoundException extends RuntimeException
{
    public NotFoundException(String message)
    {
        super(message);
    }

}
