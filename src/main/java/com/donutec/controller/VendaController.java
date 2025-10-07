package com.donutec.controller;

import com.donutec.model.Adicional;
import com.donutec.model.Cliente;
import com.donutec.repository.AdicionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("ponto-de-venda")
public class VendaController {

    @Autowired
    AdicionalRepository adicionaisRepo;

    @GetMapping
    public String gerenciar(Cliente cliente, ModelMap model){
        model.addAttribute("adicionais", adicionaisRepo.findAll());
        return "venda/pdv";
    }

    @ModelAttribute("adicionaisLista")
    public List<Adicional> adicionaisCheckbox(){
        return adicionaisRepo.findAll();
    }

}
