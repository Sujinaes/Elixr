package com.example.practise.payload;

import lombok.Getter;
import lombok.Setter;

public class EmployeeRequest {

    private int id;
    private String name;
    private int salary;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
