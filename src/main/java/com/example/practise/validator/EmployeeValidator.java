package com.example.practise.validator;

import com.example.practise.payload.EmployeeRequest;
import com.example.practise.response.EmployeeResponse;
import com.example.practise.Exceptions.ValidationException;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeValidator {

    public void commonvalidate(EmployeeRequest request, List<String> errors) {

        if (request.getId() == null) {
            errors.add("ID should not be null");
        }

        if (request.getName() == null ||
                request.getName().trim().isEmpty()) {
            errors.add("Name is required");
        }

        if (request.getName() != null &&
                !request.getName().matches("^[A-Za-z ]+$")) {
            errors.add("No numbers allowed in name");
        }
    }

    public void validateV1(EmployeeRequest request) {

        List<String> errors = new ArrayList<>();

        commonvalidate(request, errors);

        if (request.getSalary() == null) {
            errors.add("Salary is required");
        }

        if (request.getSalary() != null &&
                request.getSalary() <= 0) {
            errors.add("Salary should be greater than 0");
        }

        if (!errors.isEmpty()) {
            throw new ValidationException(errors);
        }
    }

    public void validateV2(EmployeeRequest request) {
        List<String> errors = new ArrayList<>();
        commonvalidate(request, errors);
        if (!errors.isEmpty()) {
            throw new ValidationException(errors);
        }
    }

}