package com.example.java_crud_api_mysql.service;

import com.example.java_crud_api_mysql.models.Employee;
import com.example.java_crud_api_mysql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

     @Autowired
    private EmployeeRepository employeeRepository;


    // FETCHING ALL EMPLOYEE DATA
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    // FETCHING EMPLOYEE BY ID
    public Optional<Employee> getEmployeeById(Long empId){
        return employeeRepository.findById(empId);
    }

    // ADD NEW EMPLOYEE
    public void addNewEmployee(Employee empObj){
        employeeRepository.save(empObj);
    }

    // DELETING EMPLOYEE BY ID
    public void deleteEmployeeById(Employee employeeObj){
        employeeRepository.deleteById(employeeObj.getId());
    }

    // UPDATING EMPLOYEE BY ID
    public void updateEmployeeById(Employee employeeObj){
        employeeRepository.save(employeeObj);
    }
}
