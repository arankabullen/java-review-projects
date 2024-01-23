package com.hr.personnel;

import java.time.LocalDate;

public class Employee {
    private  String name;
    private LocalDate hireDate;


    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public  String getEmployeeInfo() {
       return String.format("Name= %s, hireDate= %s", name, hireDate);
    }

    public String work() {
        return String.format("%s worked", name);
    }
}