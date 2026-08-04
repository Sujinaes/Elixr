package com.example.practise.controller;

import com.example.practise.response.EmployeeResponse;
import com.example.practise.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class DeleteEmployee {
    @Autowired
    EmployeeService employeeService;
    @DeleteMapping("/{id}")
    public ResponseEntity<EmployeeResponse> deleteEmployee(@Valid @PathVariable Integer id) {
        EmployeeResponse response = employeeService.deleteEmployee(id);
        if ("ID not Exist".equals(response.getMessage())) {
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);

    }
}
