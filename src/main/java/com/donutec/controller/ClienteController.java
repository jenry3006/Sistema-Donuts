package com.donutec.controller;

import com.donutec.model.Cliente;
import com.donutec.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping("salvar")
    private String salvar(Cliente cliente){
        clienteService.salvar(cliente);
        return "redirect:/cliente/cadastro";
    }
}
