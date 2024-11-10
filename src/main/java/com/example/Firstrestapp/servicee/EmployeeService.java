package com.example.Firstrestapp.servicee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Firstrestapp.entity.Employee;
import com.example.Firstrestapp.repository.EmplyoeeRepository;

@Service
public class EmployeeService {
	
	@Autowired 
	EmplyoeeRepository emplyoeeRepository;
	
	public Employee insertemp(Employee emp)
	{
		return emplyoeeRepository.save(emp);
	}
	

}
