package com.example.practise.payload;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {
    @NotNull(message = "Id should not be null")
    @Min(value=1 , message=" Id must be greater than 1")
    @Positive(message = "Id must be greater than zero")
    private Integer id;

    @NotBlank(message = "Name is required")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "No numbers allowed in name")
    private String name;

    @NotNull(message = "Salary cannot be null")
    @Positive(message = "Salary must be greater than 0")
    private Integer salary;


}