package com.donutec.controller;

import com.donutec.model.Cliente;
import com.donutec.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/gerenciar")
    public String gerenciar(Cliente cliente, Model model){
        model.addAttribute("clientes",clienteService.listar());
        return "cliente/clientes";
    }


    @PostMapping("salvar")
    private String salvar(@Valid Cliente cliente){
        clienteService.salvar(cliente);
        return "cliente/cadastro";
    }

    @GetMapping("/deletar")
    private String deletar(@PathVariable("id")Long id, @Valid Cliente cliente){
        clienteService.deletar(id);
        return "cliente/cadastro";
    }
}
