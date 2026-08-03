package com.example.practise.controller;

import com.example.practise.model.EmployeeModel;
import com.example.practise.payload.EmployeeRequest;
import com.example.practise.response.EmployeeResponse;
import com.example.practise.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }
    @PostMapping("/add")
    public EmployeeResponse createEmployee(@RequestBody EmployeeRequest request){
        return employeeService.createEmployee(request);
    }
    @GetMapping("/get")
    public List<EmployeeModel> getEmployees(){
        return employeeService.getEmployees();
    }
    @PutMapping("/{id}")
    public EmployeeResponse updateEmployee(@PathVariable int id,@RequestBody EmployeeRequest request){
        return employeeService.updateEmployee(id,request);
    }
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
        return "Employee Deleted Successfully";
    }


}
