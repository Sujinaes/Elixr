package com.example.practise.service;

import com.example.practise.model.EmployeeModel;
import com.example.practise.payload.EmployeeRequest;
import com.example.practise.response.EmployeeResponse;

import java.util.List;

public interface EmployeeService {

    List<EmployeeModel> getEmployees();
    EmployeeResponse createEmployee(EmployeeRequest request);
    EmployeeResponse updateEmployee(Integer id, EmployeeRequest request);
    EmployeeResponse deleteEmployee(Integer id);
    EmployeeResponse patchEmployee(Integer id,EmployeeRequest request);
    EmployeeResponse getbyId(Integer id);




}
