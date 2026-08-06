package com.example.practise.service.Impl;

import com.example.practise.Exceptions.EmployeeNotFound;
import com.example.practise.model.EmployeeModel;
import com.example.practise.payload.EmployeeRequest;
import com.example.practise.response.EmployeeResponse;
import com.example.practise.response.GenericResponse;
import com.example.practise.response.ResponseStatus;
import com.example.practise.service.EmployeeService;
import com.example.practise.validator.EmployeeValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeValidator validator;
    private List<EmployeeModel> employees= new ArrayList<>();
    public ResponseEntity<GenericResponse<EmployeeResponse>> createEmployee(EmployeeRequest request) {
        validator.validateV1(request);
        for(EmployeeModel emp : employees){
            if(emp.getId().equals(request.getId())){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new GenericResponse<>(
                        ResponseStatus.FAILURE,
                        "Employee ID Already Exist",
                        null)

                );
            }
        }

        EmployeeModel emp = new EmployeeModel(
        request.getId(),
        request.getName(),
        request.getSalary()
        );
        employees.add(emp);

        EmployeeResponse response = new EmployeeResponse(
        emp.getId(),
        emp.getName(),
        emp.getSalary()
        );
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new GenericResponse<>(
                        ResponseStatus.SUCCESS,
                        "Employee Created Successfully",
                        response));
    }
    @Override
    public GenericResponse<List<EmployeeResponse>> getEmployees() {

        List<EmployeeResponse> responseList = employees.stream()
                .map(emp -> {
                    EmployeeResponse response = new EmployeeResponse(
                            emp.getId(),
                            emp.getName(),
                            emp.getSalary()
                    );

                    response.setId(null);
                    return response;
                })
                .toList();
        return new GenericResponse<>(
                ResponseStatus.SUCCESS,
                "Employees fetched successfully",
                responseList
        );
    }



    @Override
    public GenericResponse<EmployeeResponse> deleteEmployee(Integer id) {
        boolean removed = employees.removeIf(emp -> emp.getId().equals(id));
        if (!removed) {
            throw new EmployeeNotFound(
                    "Employee Id " + id + " Not Found"
            );
        }
        return new GenericResponse<>(
                ResponseStatus.SUCCESS,
                "Employee Deleted Successfully",
                null
        );
    }


    @Override
    public GenericResponse <EmployeeResponse>updateEmployee(Integer id,
            EmployeeRequest request) {

        for (EmployeeModel emp : employees) {
            if (emp.getId().equals(id)) {

                if (request.getName() != null) {
                    emp.setName(request.getName());
                }

                if (request.getSalary() != null) {
                    emp.setSalary(request.getSalary());
                }

                EmployeeResponse response = new EmployeeResponse(
                        emp.getId(),
                        emp.getName(),
                        emp.getSalary());

                return new GenericResponse<>(
                        ResponseStatus.SUCCESS,
                        "Updated Successfully",
                        response);
            }
        }
        throw new EmployeeNotFound("Employee Id" + id+ "Not Found");
    }

    @Override
    public GenericResponse <EmployeeResponse>getbyId(Integer id) {
        for (EmployeeModel emp : employees) {
            if (emp.getId().equals(id)) {
                EmployeeResponse response = new EmployeeResponse();
                emp.getId();
                emp.getName();
                emp.getSalary();
                return new GenericResponse<>(
                        ResponseStatus.SUCCESS,
                        "Employee Retrieved Successfully",
                        response
                );

            }
        }
        throw new EmployeeNotFound("Employee Id" + id + "Not found");

    }

}











