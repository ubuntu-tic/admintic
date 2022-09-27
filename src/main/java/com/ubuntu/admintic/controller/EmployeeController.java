package com.ubuntu.admintic.controller;


import com.ubuntu.admintic.entity.Employee;
import com.ubuntu.admintic.entity.Enterprise;
import com.ubuntu.admintic.repositories.EmployeeRepository;
import com.ubuntu.admintic.repositories.EnterpriseRepository;
import com.ubuntu.admintic.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService services;



    @GetMapping ("usuarios")
    private String verUsuario(Model model){
        model.addAttribute("employees", services.verUsuario());
        return "usuarios";
    }


    @GetMapping("nuevoUsuario")
    private String verFormNuevoUsuario(Employee employee){
        return "nuevoUsuario";
    }


    @PostMapping("usuarios")
    private String crearUsuario(Employee employee){
        services.crearYActualizarUsuario(employee);
        return "redirect:/usuarios";
    }

    @GetMapping("usuarios/borrar/{id}")
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



