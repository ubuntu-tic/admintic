package com.ubuntu.admintic.services;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ubuntu.admintic.entity.Employee;

import com.ubuntu.admintic.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private EmployeeRepository repository;
    public EmployeeService(EmployeeRepository repository){
        this.repository=repository;
    }

    @JsonManagedReference
    public List<Employee> getEmployeeList(){
        return this.repository.findAll();
    }

    public Employee createEmployee(Employee newEmployee){
        return this.repository.save(newEmployee);
    }
    

}


