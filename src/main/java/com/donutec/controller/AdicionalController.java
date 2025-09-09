package com.donutec.controller;

import com.donutec.model.Adicional;
import com.donutec.service.AdicionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/adicionais")
public class AdicionalController {

    @Autowired
    AdicionalService adicionalService;

    @GetMapping
    public String gerenciar(Adicional adicional, Model model){
        model.addAttribute("adicionais",adicionalService.listar());
        return "adicional/adicionais";
    }

    @PostMapping("salvar")
    public String salvar(Adicional adicional){
        adicionalService.salvar(adicional);
        return "redirect:/adicionais";
    }

    @GetMapping("deletar")
    public String deletar(Adicional adicional){
        adicionalService.deletar(adicional);
        return "redirect:/adicionais";
    }

    @GetMapping("editar")
    public String editar(@RequestParam ("id") Long id, Model model){
        adicionalService.editar(id).ifPresent(a -> model.addAttribute("adicional", a));
        return "adicional/adicionais";
    }



}
