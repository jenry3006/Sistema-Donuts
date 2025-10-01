package com.donutec.controller;

import com.donutec.dto.ClienteDTO;
import com.donutec.dto.ProdutoDTO;
import com.donutec.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoRestController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public List<ProdutoDTO> buscarClientes(@RequestParam String nome){
        List<ProdutoDTO> produto = produtoService.buscarPorNome(nome);
        System.out.println(produto.toString());
        return produto;
    }
}
