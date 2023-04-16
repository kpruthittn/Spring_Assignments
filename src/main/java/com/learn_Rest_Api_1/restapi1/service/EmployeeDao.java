package com.learn_Rest_Api_1.restapi1.service;


import com.learn_Rest_Api_1.restapi1.entities.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
//Q2. Create an Employee Bean(id, name, age) and
// service to  perform different operations related to employee.
@Component
public class EmployeeDao {
    private static List<Employee> empList = new ArrayList<>();
    static {
        empList.add(new Employee(1,"Pranshu",21));
        empList.add(new Employee(2,"Jai",26));
        empList.add(new Employee(3,"Madhav",32));
    }
    public List<Employee> getAllEmployees(){
        return empList;
    }
    public Employee getEmployeeById(int id){
        Employee employee = null;
        for (Employee e:empList){
            if (e.getEmpId()==id){
                employee=e;
            }
        }
        return employee;
    }
    public Employee addEmployee(Employee employee){
        empList.add(employee);
        return employee;
    }
    public void deleteById(int id){
        Predicate<? super Employee> predicate = employee -> employee.getEmpId()==id;
        empList.removeIf(predicate);
    }
    public Employee updateCourse(Employee employee) {
        empList.forEach(e -> {
            if(e.getEmpId()==employee.getEmpId()){
                e.setEmpName(employee.getEmpName());
                e.setEmpAge(employee.getEmpAge());
            }
        });
        return employee;
    }
}
