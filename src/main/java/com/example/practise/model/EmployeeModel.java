package com.example.practise.model;

import lombok.Data;



public class EmployeeModel {
    private int id;
    private String name;
    private int salary;
    public EmployeeModel(){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
