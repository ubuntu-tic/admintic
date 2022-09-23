package com.ubuntu.admintic.controller;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ubuntu.admintic.entity.Employee;
import com.ubuntu.admintic.entity.Enterprise;
import com.ubuntu.admintic.entity.Profile;
import com.ubuntu.admintic.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Employee")

public class EmployeeController {

    @Autowired
    EmployeeService services;

/*
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
    }*/

    @GetMapping ("/usuarios")
    private String verUsuario(Model model){
        model.addAttribute("employees", services.verUsuario());
        return "usuarios";
    }

    @GetMapping("/nuevoUsuario")
    private String verFormNuevoUsuario(Employee employee){
        return "nuevoUsuario";
    }

    @PostMapping("usuarios")
    private String crearUsuario(Employee employee){
        services.crearYActualizarUsuario(employee);
        return "redirect:/usuarios";
    }

    @GetMapping("/usuarios/borrar/{id}")
    private String eliminarUsuario(@PathVariable("id") Long id){
        services.eliminarUsuario(id);
        return "redirect:/usuarios";
    }

    @GetMapping("usuarios/editar/{id}")
    private String verUsuarioPorId(@PathVariable("id") Long id, Model model){
        Employee employee = services.verUsuarioPorId(id);
        model.addAttribute("employee", employee);
        return "ActualizarUsuario";
    }

    @PostMapping("usuarios/actualizar/{id}")
    private String editarUsuario(@PathVariable("id") Long id, Employee employee){
        services.crearYActualizarUsuario(employee);
        return "redirect:/usuarios";
    }

}

