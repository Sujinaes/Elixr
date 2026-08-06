package com.example.practise.controller;

import com.example.practise.response.EmployeeResponse;
import com.example.practise.response.GenericResponse;
import com.example.practise.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class RetrieveEmployeeResource {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/get")
    public GenericResponse<List<EmployeeResponse>> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public GenericResponse<EmployeeResponse> getbyId(@PathVariable Integer id) {
        GenericResponse<EmployeeResponse> response =
                employeeService.getbyId(id);
        return response;
    }

}
