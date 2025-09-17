package com.donutec.controller;

import com.donutec.dto.ClienteDTO;
import com.donutec.repository.ClienteRepository;
import com.donutec.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {

    @Autowired
    ClienteService clienteService;

    @GetMapping
    public List<ClienteDTO> buscarClientes(@RequestParam String nome){
    List<ClienteDTO> cliente = clienteService.buscarPorNome(nome);
    System.out.println(cliente.toString());
    return cliente;
    }
}
