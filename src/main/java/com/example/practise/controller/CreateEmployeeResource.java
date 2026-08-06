package com.example.practise.controller;

import com.example.practise.payload.EmployeeRequest;
import com.example.practise.response.EmployeeResponse;
import com.example.practise.response.GenericResponse;
import com.example.practise.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.practise.ApiConstants.EMPLOYEE_V1;
import static com.example.practise.ApiConstants.EMPLOYEE_V2;


@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class CreateEmployeeResource {
    private final EmployeeService employeeService;
    @PostMapping(value = "/add",produces = EMPLOYEE_V1)
    public ResponseEntity<GenericResponse<EmployeeResponse>>createEmployeeV1(@RequestBody EmployeeRequest request) {
       return employeeService.createEmployee(request);

    }

    @PostMapping(value = "/add" , produces = EMPLOYEE_V2)
    public ResponseEntity<GenericResponse<EmployeeResponse>>createEmployeeV2( @RequestBody EmployeeRequest request) {
       return employeeService.createEmployee(request);


    }}