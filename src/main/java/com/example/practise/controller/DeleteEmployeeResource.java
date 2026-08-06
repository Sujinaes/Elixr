package com.example.practise.controller;

import com.example.practise.response.EmployeeResponse;
import com.example.practise.response.GenericResponse;
import com.example.practise.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class DeleteEmployeeResource {
    @Autowired
    EmployeeService employeeService;
    @DeleteMapping("/{id}")
    public ResponseEntity<GenericResponse<EmployeeResponse>> deleteEmployee(
            @PathVariable Integer id) {
        GenericResponse<EmployeeResponse> response =
                employeeService.deleteEmployee(id);
        return ResponseEntity.ok(response);
    }
}
