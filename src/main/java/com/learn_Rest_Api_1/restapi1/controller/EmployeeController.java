package com.learn_Rest_Api_1.restapi1.controller;


import com.learn_Rest_Api_1.restapi1.entities.Employee;
import com.learn_Rest_Api_1.restapi1.exception.EmployeeNotFoundException;
import com.learn_Rest_Api_1.restapi1.service.EmployeeDao;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    //Q1. Create a simple REST ful service in Spring Boot
    // which returns the Response "Welcome to spring boot".
    @GetMapping("/welcome")
    public String greetings(){
        return "Welcome to spring boot";
    }
    //Q3. Implement GET http request for Employee to get list of employees.
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }
    //Q4. Implement GET http request using path variable top get one employee.
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        Employee employee = employeeDao.getEmployeeById(id);
        //Q6. Implement Exception Handling for resource not found
        if (employee==null){
            throw new EmployeeNotFoundException("ID: "+id );
        }
        return employee;
    }
    //Q5. Implement POST http request for Employee to create a new employee.
    @PostMapping("/employees")
    public Employee addEmployee(@Valid @RequestBody Employee employee){
        employeeDao.addEmployee(employee);
        return employee;
    }
    //Q7. Implement DELETE http request for Employee to delete employee.
    @DeleteMapping("/employees/{id}")
    public void deleteUser(@PathVariable int id){
        employeeDao.deleteById(id);
    }
    //Q8. Implement PUT http request for Employee to update employee.
    @PutMapping("/employees/{id}")
    public Employee updateUser(@RequestBody Employee employee){
        employeeDao.updateCourse(employee);
        return employee;
    }
}
