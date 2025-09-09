package com.donutec.controller;

import com.donutec.model.Produto;
import com.donutec.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    private String gerenciar(Produto produto, Model model){
        model.addAttribute("produtos",produtoService.listar());
        return "produto/produtos";
    }

    @PostMapping("salvar")
    private String salvar(@Valid Produto produto){
        produtoService.salvar(produto);
        return "redirect:/produtos";
    }

    @GetMapping("deletar")
    private String deletar(Produto produto) {
        produtoService.deletar(produto);
        return "redirect:/produtos";
    }

    @GetMapping("editar")
    private String editar(@RequestParam("id") Long id, Model model){
        produtoService.editarPorId(id).ifPresent(p -> model.addAttribute("produto", p));
        return "produto/produtos";
    }

}
