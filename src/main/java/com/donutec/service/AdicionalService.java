package com.donutec.service;

import com.donutec.model.Adicional;
import com.donutec.model.Cliente;
import com.donutec.repository.AdicionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdicionalService {

    @Autowired
    AdicionalRepository repository;

    public List<Adicional> listar(){
        return repository.findAll();
    }

    public Adicional salvar(Adicional adicional){
        return repository.save(adicional);
    }

    public void deletar(Adicional adicional){
        repository.delete(adicional);
    }

    public Optional editar(Long id){
        return repository.findById(id);
    }

}
