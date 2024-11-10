package com.example.Firstrestapp.contro;

import com.example.Firstrestapp.entity.Employee;
import com.example.Firstrestapp.servicee.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService  employeeService;

    @PostMapping("/employees")
    public Employee insertEmployee(@RequestBody Employee emp) {
        System.out.println(emp);
    	return employeeService.insertemp(emp);
        
        
    }
}
