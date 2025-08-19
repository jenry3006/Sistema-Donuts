package com.donutec.controller;

import com.donutec.model.Produto;
import com.donutec.repository.ProdutoRepository;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    List<Produto> produtos = new ArrayList<>();

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("cadastro")
    private String abrirCadastro(Produto produto, Model model){
        return "produto/cadastro";
    }

    @RequestMapping("lista")
    private String lista(Produto produto, Model model){
        produtos = produtoRepository.findAll();
        model.addAttribute("produtos",produtos);
        return "produto/lista";
    }

    @PostMapping("salvar")
    private String salvar(@Valid Produto produto, BindingResult bindingResult, Model model){
        produtoRepository.save(produto);
        return "redirect:/produto/cadastro";
    }

    @GetMapping("deletar")
    private String deletar(@PathParam(value = "id")Long id, Model model){
        produtoRepository.deleteById(id);
        return "redirect:/produto/lista";
    }

    private String editarProduto(@PathParam(value = "id") Long id, Model model){
        model.addAttribute("produto",produtoRepository.findById(id).get());
        return "redirect:/produto/cadastro";
    }

}
