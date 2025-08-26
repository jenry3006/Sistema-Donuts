package com.donutec.controller;

import com.donutec.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("home")
    public String inicio(){
        return "index";
    }

    @GetMapping("cadastro")
    public String cadastro(Cliente cliente){
        return "cliente/cadastro";
    }
}
