package com.learn_Rest_Api_1.restapi1.entities;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

//Q2. Create an Employee Bean(id, name, age) and
// service to  perform different operations related to employee.
public class Employee {
    private int empId;
    //Q9. Apply validation while create a new employee using POST http Request.
    @Size(min = 3,message = "Name should have atleast 3 characters.")
    private String empName;
    @Positive(message = "Age should be greater than zero")
    private int empAge;

    public Employee(int empId,String empName,int empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
    }

    public int getEmpId() {
        return empId;
    }

    public int getEmpAge() {
        return empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
