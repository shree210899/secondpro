package com.example.Firstrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Firstrestapp.entity.Employee;


@Repository
public interface EmplyoeeRepository extends JpaRepository<Employee, Integer>
{

}
