package com.example.practise.controller;

import com.example.practise.payload.EmployeeRequest;
import com.example.practise.response.EmployeeResponse;
import com.example.practise.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class UpdateEmployee {
    @Autowired
    private EmployeeService employeeService;
    @PutMapping("/{id}")
    public EmployeeResponse updateEmployee(@Valid @PathVariable Integer id, @RequestBody EmployeeRequest request) {
        return employeeService.updateEmployee(id, request);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<EmployeeResponse> patchEmployee(@PathVariable Integer id, @RequestBody EmployeeRequest request) {
        EmployeeResponse response = employeeService.patchEmployee(id, request);
        if ("ID not Exist".equals(response.getMessage())) {
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }
}
