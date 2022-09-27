package com.ubuntu.admintic.controller;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ubuntu.admintic.entity.Employee;
import com.ubuntu.admintic.entity.Profile;
import com.ubuntu.admintic.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeService services;

    public EmployeeController(EmployeeService services) {
        this.services = services;
    }

    @GetMapping("/employee")
    @JsonManagedReference
    public List<Employee> EmployeeList() {

        return this.services.getEmployeeList();
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return this.services.createEmployee(employee);
    }


    @GetMapping("/employee/{id}")
    public String findEmployee(@PathVariable int id){
        return "";
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id){
        return "";
    }

    @PatchMapping("/employee/{id}")
    public String updateEmployee(@PathVariable int id){
        return "";
    }
}

