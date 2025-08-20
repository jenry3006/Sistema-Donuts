package com.donutec.service;

import com.donutec.model.Produto;
import com.donutec.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    public  List<Produto> lista (){
        return repository.findAll();

    }
}
