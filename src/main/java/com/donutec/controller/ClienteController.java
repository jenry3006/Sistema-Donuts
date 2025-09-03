package com.donutec.controller;

import com.donutec.model.Cliente;
import com.donutec.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping
    public String gerenciar(Cliente cliente, Model model){
        model.addAttribute("clientes",clienteService.listar());
        return "cliente/clientes";
    }


    @PostMapping("salvar")
    private String salvar(@Valid Cliente cliente, Model model){
        clienteService.salvar(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("deletar")
    private String deletar(@RequestParam("id")Long id){
        clienteService.deletar(id);
        return "redirect:/clientes";
    }
}
