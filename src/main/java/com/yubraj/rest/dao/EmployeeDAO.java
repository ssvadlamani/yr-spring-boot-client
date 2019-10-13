package com.yubraj.rest.dao;

import org.springframework.stereotype.Repository;

import com.yubraj.rest.model.Employee;
import com.yubraj.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Siva", "Vadlam", "siva@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Naresh", "Vadlam", "Naresh@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Sudeeksh", "Vadlam", "Sudeeksh@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
