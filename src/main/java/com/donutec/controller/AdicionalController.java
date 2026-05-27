package com.donutec.controller;

import com.donutec.dto.AdicionalDTO;
import com.donutec.dto.ClienteDTO;
import com.donutec.model.Adicional;
import com.donutec.model.Cliente;
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

    @GetMapping ("/cadastro")
    public String abrirCadastro(Adicional adicional, Model model){
        model.addAttribute("adicional",adicional);
        return "adicional/cadastro";
    }

    @PostMapping("salvar")
    public String salvar(@ModelAttribute AdicionalDTO adicionalDTO){
        adicionalService.salvar(adicionalDTO);
        return "redirect:/adicionais";
    }

    @GetMapping("deletar")
    public String deletar(@RequestParam("id") Long id){ // Recebe o ID diretamente
        adicionalService.deletar(id);
        return "redirect:/adicionais";
    }

    @GetMapping("/editar")
    public String abrirEdicao(@RequestParam("id") Long id, Model model) {

        AdicionalDTO adicionalDTO = adicionalService.buscarPorID(id)
                .orElseThrow(() -> new IllegalArgumentException("Adicional inválido: " + id));

        model.addAttribute("adicional", adicionalDTO);

        return "adicional/cadastro";
    }

}
