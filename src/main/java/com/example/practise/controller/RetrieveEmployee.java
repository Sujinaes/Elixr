package com.example.practise.controller;

import com.example.practise.model.EmployeeModel;
import com.example.practise.response.EmployeeResponse;
import com.example.practise.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class RetrieveEmployee {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/get")
    public List<EmployeeModel> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/v1/{id}")
    public EmployeeResponse getbyIdV1(@Valid @PathVariable Integer id) {
        EmployeeResponse response = employeeService.getbyId(id);
        response.setSalary(null);

        return response;
    }
    @GetMapping("/v2/{id}")
    public EmployeeResponse getbyIdV2(@Valid @PathVariable Integer id) {
        EmployeeResponse response = employeeService.getbyId(id);
        response.setSalary(null);

        return response;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getbyId(@PathVariable Integer id) {
        EmployeeResponse response = employeeService.getbyId(id);
        if ("ID not Found".equals(response.getMessage())) {
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);


    }


}
