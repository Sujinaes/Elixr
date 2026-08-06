package com.example.practise.controller;

import com.example.practise.payload.EmployeeRequest;
import com.example.practise.response.EmployeeResponse;
import com.example.practise.response.GenericResponse;
import com.example.practise.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class UpdateEmployeeResource {
    @Autowired
    private EmployeeService employeeService;

    @PatchMapping("/{id}")
    public GenericResponse<EmployeeResponse> updateEmployee(@PathVariable Integer id, @RequestBody EmployeeRequest request) {
        GenericResponse<EmployeeResponse> response =
                employeeService.updateEmployee(id , request);
        return ResponseEntity.ok(response).getBody();
    }
}
