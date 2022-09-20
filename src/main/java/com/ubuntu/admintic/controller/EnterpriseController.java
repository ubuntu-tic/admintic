package com.ubuntu.admintic.controller;

import com.ubuntu.admintic.entity.Enterprise;
import com.ubuntu.admintic.services.EnterpriseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EnterpriseController {

    EnterpriseService services;

    public EnterpriseController(EnterpriseService services){
        this.services=services;
    }

    @GetMapping("/enterprise")
    public List<Enterprise> EnterpriseList(){
        return this.services.getEnterpriseList();
    }

    @PostMapping("/enterprise")
    public Enterprise createEnterprise(@RequestBody Enterprise enterprise){
        return this.services.createEnterprise(enterprise);
    }

    @GetMapping(value="/enterprise/{id}")
    public Optional<Enterprise> findBy (@PathVariable long id){
        return this.services.findEnterprise(id);
    }

    @DeleteMapping("/enterprise/{id}")
    public String deleteEnterprise(@PathVariable int id){
        return "";
    }

    @PatchMapping("/enterprise/{id}")
    public String updateEnterprise(@PathVariable int id){
        return "";
    }
}



