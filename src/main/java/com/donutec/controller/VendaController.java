package com.donutec.controller;

import com.donutec.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ponto-de-venda")
public class VendaController {

    @GetMapping
    public String gerenciar(Cliente cliente){
        return "venda/pdv";
    }
}
