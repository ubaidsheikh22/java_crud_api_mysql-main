package com.example.java_crud_api_mysql.controller;

import com.example.java_crud_api_mysql.models.Employee;
import com.example.java_crud_api_mysql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // END POINT TO FETCH ALL EMPLOYEES
    @GetMapping(value = "/allEmployees")
    public List<Employee> findAllEmployees(){
        return employeeService.getAllEmployees();
    }

    // END POINT TO FETCH SINGLE EMPLOYEE
    @GetMapping(value = "/findEmployee/{id}")
    public Optional<Employee> findEmployeeById(@PathVariable(value = "id") Long empId){
        return employeeService.getEmployeeById(empId);
    }

    // END POINT TO ADD NEW EMPLOYEE
    @PostMapping(value = "/addEmployee")
    public void addNewEmployee(@RequestBody Employee empObj){
        employeeService.addNewEmployee(empObj);
    }

    // END POINT TO UPDATE AN EMPLOYEE
    @PutMapping(value = "/updateEmployee")
    public void updateNewEmployee(@RequestBody Employee empObj){
        employeeService.updateEmployeeById(empObj);
    }

    // END POINT TO DELETE AN EMPLOYEE
    @DeleteMapping(value = "/deleteEmployee")
    public void deleteNewEmployee(@RequestBody Employee empObj){
        employeeService.deleteEmployeeById(empObj);
    }
}
