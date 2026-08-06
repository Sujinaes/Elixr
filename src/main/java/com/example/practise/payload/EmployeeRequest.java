package com.example.practise.payload;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {

    private Integer id;
    private String name;
    private Integer salary;


}