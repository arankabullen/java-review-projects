package com.hr.personnel.client;

import  com.hr.personnel.Employee;
import java.time.LocalDate;

class HRClient {
    public static void main(String[] args) {
        Employee employee = new Employee("Amy", LocalDate.of(2024, 01,01));
        String employeeInfo = employee.getEmployeeInfo();
        String work = employee.work();
        System.out.println(employeeInfo);
        System.out.println(work);

        Employee employee2 = new Employee("Chris", LocalDate.of(2024, 01,01));
        System.out.println(employee2.getEmployeeInfo());
        System.out.println(employee2.work());
    }
}