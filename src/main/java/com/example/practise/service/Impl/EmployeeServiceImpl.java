package com.example.practise.service.Impl;

import com.example.practise.Exceptions.EmployeeNotFound;
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
        for (EmployeeModel emp : employees) {
            if (emp.getId() == request.getId()) {
                EmployeeResponse response = new EmployeeResponse();
                response.setMessage("ID already existed");
                return response;
            }
        }
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
    public List<EmployeeModel>  getEmployees() {
        if(employees.isEmpty()){
            throw new EmployeeNotFound("No Record Found");
        }

        return employees;
    }

    @Override
    public EmployeeResponse updateEmployee(Integer id, EmployeeRequest request) {

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
    public EmployeeResponse deleteEmployee(Integer id) {
        EmployeeResponse response = new EmployeeResponse();
        boolean removed = employees.removeIf(emp -> emp.getId() == id);

        if (removed) {
            response.setMessage("Deleted Successfully");
        } else {
            response.setMessage("ID not Found");
        }
        return response;

    }

    @Override
    public EmployeeResponse patchEmployee(Integer id, EmployeeRequest request) {
        for (EmployeeModel emp : employees) {
            if (emp.getId() == id) {
                if (request.getName() != null) {
                    emp.setName(request.getName());
                }
                if (request.getSalary() != 0) {
                    emp.setSalary(request.getSalary());
                }
                EmployeeResponse response = new EmployeeResponse();
                response.setId(emp.getId());
                response.setName(emp.getName());
                response.setSalary(emp.getSalary());
                response.setMessage("Updated Successfully");
                return response;
            }
        }
        EmployeeResponse response = new EmployeeResponse();
        response.setMessage("ID not Found");
        return response;

    }

    @Override
    public EmployeeResponse getbyId(Integer id) {
        for (EmployeeModel emp : employees) {
            if (emp.getId() == id) {
                EmployeeResponse response = new EmployeeResponse();
                response.setId(emp.getId());
                response.setName(emp.getName());
                response.setSalary(emp.getSalary());
                return response;

            }
        }
        EmployeeResponse response = new EmployeeResponse();
        response.setMessage("ID not Found");
        return response;
    }


}











