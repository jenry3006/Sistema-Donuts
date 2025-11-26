package com.donutec.controller;

import com.donutec.dto.ProdutoDTO;
import com.donutec.model.Produto;
import com.donutec.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    private String gerenciar(Produto produto, Model model){
        model.addAttribute("produtos",produtoService.listar());
        System.out.println(produtoService.listar().toString());
        return "produto/produtos";
    }

    @PostMapping("salvar")
    private String salvar(@Valid @ModelAttribute ProdutoDTO produtoDTO){
        produtoService.salvar(produtoDTO);
        return "redirect:/produtos";
    }

    @GetMapping("deletar")
    private String deletar(Produto produto) {
        produtoService.deletar(produto);
        return "redirect:/produtos";
    }

    @GetMapping("editar")
    private String editar(@RequestParam("id") Long id, Model model){
        produtoService.buscarPorId(id).ifPresent(p -> model.addAttribute("produto", p));
        return "produto/produtos";
    }

}
