//package com.example.practise.controller;
//import com.example.practise.model.EmployeeModel;
//import com.example.practise.payload.EmployeeRequest;
//import com.example.practise.response.EmployeeResponse;
//import com.example.practise.service.EmployeeService;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/employees")
//public class EmployeeController {
//    @Autowired
//    private EmployeeService employeeService;
//
//    @PostMapping("/add")
//    public ResponseEntity<EmployeeResponse> createEmployeev1(@Valid @RequestBody EmployeeRequest request) {
//        EmployeeResponse response = employeeService.createEmployee(request);
//
//        if ("Employee Id Already Exists ".equals(response.getMessage())) {
//            return ResponseEntity.badRequest().body(response);
//        }
//        return ResponseEntity.status(HttpStatus.CREATED)
//                .body(response);
//    }
//
//    @PostMapping("/v2/add")
//    public ResponseEntity<EmployeeResponse> createEmployeev2(@Valid @RequestBody EmployeeRequest request) {
//        request.setSalary(null);
//        return ResponseEntity.ok(employeeService.createEmployee(request));
//
//    }
//
//    @GetMapping("/get")
//    public List<EmployeeModel> getEmployees() {
//        return employeeService.getEmployees();
//    }
//
//    @GetMapping("/v1/{id}")
//    public EmployeeResponse getbyIdV1(@Valid @PathVariable Integer id) {
//        EmployeeResponse response = employeeService.getbyId(id);
//        response.setSalary(null);
//
//        return response;
//    }
//
//    @GetMapping("/v2/{id}")
//    public EmployeeResponse getbyIdV2(@Valid @PathVariable Integer id) {
//        EmployeeResponse response = employeeService.getbyId(id);
//        response.setSalary(null);
//
//        return response;
//    }
//
//    @PutMapping("/{id}")
//    public EmployeeResponse updateEmployee(@Valid @PathVariable Integer id, @RequestBody EmployeeRequest request) {
//
//        return employeeService.updateEmployee(id, request);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<EmployeeResponse> deleteEmployee(@Valid @PathVariable Integer id) {
//        EmployeeResponse response = employeeService.deleteEmployee(id);
//        if ("ID not Exist".equals(response.getMessage())) {
//            return ResponseEntity.badRequest().body(response);
//        }
//        return ResponseEntity.ok(response);
//
//    }
//
//    @PatchMapping("/{id}")
//    public ResponseEntity<EmployeeResponse> patchEmployee(@PathVariable Integer id, @RequestBody EmployeeRequest request) {
//        EmployeeResponse response = employeeService.patchEmployee(id, request);
//        if ("ID not Exist".equals(response.getMessage())) {
//            return ResponseEntity.badRequest().body(response);
//        }
//        return ResponseEntity.ok(response);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<EmployeeResponse> getbyId(@PathVariable Integer id) {
//        EmployeeResponse response = employeeService.getbyId(id);
//        if ("ID not Found".equals(response.getMessage())) {
//            return ResponseEntity.badRequest().body(response);
//        }
//        return ResponseEntity.ok(response);
//
//
//    }
//}
//
//
//
