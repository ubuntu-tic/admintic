package com.ubuntu.admintic.controller;

import com.ubuntu.admintic.entity.User;
import com.ubuntu.admintic.services.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class FrontController {
    UserService userService;


    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal) {
        if(principal !=null) {
            model.addAttribute("user", principal.getClaims());
        }
        return "index";
    }


}
