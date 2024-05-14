package com.dev.proyecto_clase.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/auth")
public class IndexController {
    @GetMapping("/hello")
    public String hello() {
        return "index";
    }
    
    @GetMapping("/hello-secured")
    public String helloSecured(Model model) {
        Authentication autentication = SecurityContextHolder.getContext().getAuthentication();
        String username = autentication.getName();
        System.out.println(autentication.getDetails().toString());
        model.addAttribute("username", username);
        return "index";
    }
    
}
