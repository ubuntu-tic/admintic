package com.ubuntu.admintic.controller;

import com.ubuntu.admintic.entity.Enterprise;
import com.ubuntu.admintic.services.EnterpriseService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontController {

//    EnterpriseService service;

//    public FrontController(EnterpriseService service) {this.service = service;}

//    @GetMapping("/")
//    public String index(){
//        return "index";
//    }

    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal) {
        return "index";
    }

    @GetMapping("/ingresosEgresos")
    public String ingresosEgresos(){
        return "ingresosEgresos";
    }

    @GetMapping("/nuevoIngreso")
    public String nuevoIngreso(){
        return "nuevoIngreso";
    }

    @GetMapping("/usuarios")
    public String usuarios(){
        return "usuarios";
    }

    @GetMapping("/nuevoUsuario")
    public String nuevoUsuario(){
        return "nuevoUsuario";
    }
//
//    @GetMapping("/empresas")
//    public String empresas(Model model){
//        List<Enterprise> empresas = this.service.getEnterpriseList();
//        model.addAttribute("empresas", empresas);
//        return "empresas";
//    }
//
//    @GetMapping("/nuevaEmpresa")
//    public String nuevaEmpresa(Model model){
//        model.addAttribute("enterprise", new Enterprise());
//        return "nuevaEmpresa";
//    }

}
