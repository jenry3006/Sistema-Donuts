package com.donutec.service;

import com.donutec.dto.ClienteDTO;
import com.donutec.model.Cliente;
import com.donutec.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    public void deletar(Long id){
        clienteRepository.deleteById(id);
    }

    public Optional editarPorId(Long id){
         return clienteRepository.findById(id);
    }

    public List<ClienteDTO> buscarPorNome(String nome){
        /*List<Cliente> clientes = clienteRepository.findAll();
        return clientes.stream().filter(x -> x.getNome().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList()).stream().map(z -> new ClienteDTO(z)).toList();*/
        return clienteRepository.findByNomeContainingIgnoreCase(nome);
    }

}
