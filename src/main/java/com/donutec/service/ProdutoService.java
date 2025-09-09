package com.donutec.service;

import com.donutec.model.Produto;
import com.donutec.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    public List<Produto> listar (){
        return repository.findAll();
    }

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    public void deletar(Produto produto){
        repository.delete(produto);
    }

    public Optional editarPorId(Long id){
        return repository.findById(id);

    }
}
