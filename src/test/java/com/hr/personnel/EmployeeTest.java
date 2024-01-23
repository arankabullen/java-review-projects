package com.hr.personnel;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee employee;

    @BeforeEach
    void setUp() {
       employee = new Employee("Bullen",
                LocalDate.of(2024, 02, 01));
    }

    @Test
    void getEmployeeInfo_should_return_valid_employee_info_given_valid_employeeIfo() {

        // call test target method
        String employeedinfo = employee.getEmployeeInfo();

        //verify if the result is what is expected (assert)

        assertEquals("Name= Bullen, hireDate= 2024-02-01", employeedinfo);
    }



    @Test
    void work() {
        // call test target method
        String work = employee.work();

        //verify if the result is what is expected (assert)

        assertEquals("Bullen worked", work);
        Assertions.assertThat(work).isEqualTo("Bullen worked");
    }
}