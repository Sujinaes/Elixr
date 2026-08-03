package com.example.practise.service.Impl;

import com.example.practise.model.EmployeeModel;
import com.example.practise.payload.EmployeeRequest;
import com.example.practise.response.EmployeeResponse;
import com.example.practise.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private List<EmployeeModel> employees = new ArrayList<>();

    public EmployeeResponse createEmployee(EmployeeRequest request) {
        EmployeeModel emp = new EmployeeModel();
        emp.setId(request.getId());
        emp.setName(request.getName());
        emp.setSalary(request.getSalary());
        employees.add(emp);

        EmployeeResponse response = new EmployeeResponse();
        response.setId(emp.getId());
        response.setName(emp.getName());
        response.setSalary(emp.getSalary());
        response.setMessage("added");

        return response;
    }

    @Override
    public List<EmployeeModel> getEmployees() {
        return employees;
    }

    @Override
    public EmployeeResponse updateEmployee(int id, EmployeeRequest request) {

        for (EmployeeModel emp : employees) {

            if (emp.getId() == id) {
                emp.setName(request.getName());
                emp.setSalary(request.getSalary());
                EmployeeResponse response = new EmployeeResponse();
                response.setId(emp.getId());
                response.setName(emp.getName());
                response.setSalary(emp.getSalary());
                response.setMessage("Data Updated");
                return response;
            }
        }
        return null;
    }

    @Override
    public void deleteEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);

    }


}











