package com.donutec.controller;

import com.donutec.dto.AdicionalDTO;
import com.donutec.model.Adicional;
import com.donutec.service.AdicionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String salvar(@ModelAttribute AdicionalDTO adicionalDTO){
        adicionalService.salvar(adicionalDTO);
        return "redirect:/adicionais";
    }

   /* @GetMapping("deletar")
    public String deletar(AdicionalDTO adicional){
        adicionalService.deletar(adicional);
        return "redirect:/adicionais";
    }*/

    @GetMapping("deletar")
    public String deletar(@RequestParam("id") Long id){ // Recebe o ID diretamente
        adicionalService.deletar(id);
        return "redirect:/adicionais";
    }

    @GetMapping("editar")
    public String editar(@RequestParam ("id") Long id, Model model){
        adicionalService.buscarPorId(id).ifPresent(a -> model.addAttribute("adicional", a));
        return "adicional/adicionais";
    }



}
