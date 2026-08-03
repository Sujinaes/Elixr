package com.example.practise.service;

import com.example.practise.model.EmployeeModel;
import com.example.practise.payload.EmployeeRequest;
import com.example.practise.response.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    List<EmployeeModel> getEmployees();
    EmployeeResponse createEmployee(EmployeeRequest request);
    EmployeeResponse updateEmployee(int id, EmployeeRequest request);
    void deleteEmployee(int id);
}
