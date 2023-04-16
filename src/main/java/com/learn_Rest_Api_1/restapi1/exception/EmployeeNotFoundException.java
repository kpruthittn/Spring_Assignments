package com.learn_Rest_Api_1.restapi1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//Q6. Implement Exception Handling for resource not found.
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
