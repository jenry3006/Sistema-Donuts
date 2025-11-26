package com.donutec.controller;

import com.donutec.dto.ClienteDTO;
import com.donutec.model.Cliente;
import com.donutec.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String salvar(@Valid @ModelAttribute ClienteDTO clienteDTO, Model model,
                         @RequestParam(value = "redirectURL", required = false, defaultValue = "/clientes") String redirectURL){
        clienteService.salvar(clienteDTO);
        return "redirect:" + redirectURL;
    }

    @GetMapping("deletar")
    public String deletar(@RequestParam("id")Long id){
        clienteService.deletar(id);
        return "redirect:/clientes";
    }

    @GetMapping("/editar")
    public String editar(@RequestParam("id")Long id, Model model){
        clienteService.buscarPorID(id).ifPresent(c -> model.addAttribute("cliente", c));
        return "cliente/clientes";
    }

    @GetMapping("/teste")
    public String teste(Cliente cliente, Model model){
        return "venda/pdv";
    }

}
