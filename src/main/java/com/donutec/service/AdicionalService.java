package com.donutec.service;

import com.donutec.dto.AdicionalDTO;
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

    public List<AdicionalDTO> listar(){
        List<Adicional> result = repository.findAll();
        return result.stream().map(x -> new AdicionalDTO(x)).toList();
    }

    public AdicionalDTO salvar(AdicionalDTO adicionalDTO){
        Adicional adicional = new Adicional(adicionalDTO);
        Adicional save = repository.save(adicional);
        return new AdicionalDTO(save);
    }

    /*public void deletar(AdicionalDTO adicionalDTO){
        Adicional adicional = new Adicional(adicionalDTO);
        repository.delete(adicional);
    }*/

    public void deletar(Long id){
        repository.deleteById(id);
    }

    public Optional<AdicionalDTO> buscarPorId(Long id){
        Optional<Adicional> adicionalOptional = repository.findById(id);
        return adicionalOptional.map(AdicionalDTO::new);
    }

}
