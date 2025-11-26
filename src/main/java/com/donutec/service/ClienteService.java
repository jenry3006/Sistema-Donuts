package com.donutec.service;

import com.donutec.dto.AdicionalDTO;
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

    public ClienteDTO salvar(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente(clienteDTO);
        Cliente save = clienteRepository.save(cliente);
        return new ClienteDTO(save);
    }

    public List<ClienteDTO> listar(){
        List<Cliente> result = clienteRepository.findAll();
        return result.stream().map(x -> new ClienteDTO(x)).toList();
    }

    public void deletar(Long id){
        clienteRepository.deleteById(id);
    }

    /*public Optional editarPorId(Long id){
         return clienteRepository.findById(id);
    }*/

    public Optional<ClienteDTO> buscarPorID(Long id){
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        return clienteOptional.map(ClienteDTO::new);
    }

    public List<ClienteDTO> buscarPorNome(String nome){
        return clienteRepository.findByNomeContainingIgnoreCase(nome);
    }

}
