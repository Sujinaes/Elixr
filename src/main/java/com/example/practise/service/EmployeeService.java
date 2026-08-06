package com.example.practise.service;

import com.example.practise.model.EmployeeModel;
import com.example.practise.payload.EmployeeRequest;
import com.example.practise.response.EmployeeResponse;
import com.example.practise.response.GenericResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {

    GenericResponse <List<EmployeeResponse>> getEmployees();
    ResponseEntity<GenericResponse<EmployeeResponse>> createEmployee(EmployeeRequest request);
   GenericResponse<EmployeeResponse> deleteEmployee(Integer id);
    GenericResponse<EmployeeResponse> updateEmployee(Integer id,EmployeeRequest request);
    GenericResponse<EmployeeResponse> getbyId(Integer id);




}
