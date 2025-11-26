package com.donutec.service;

import com.donutec.dto.ClienteDTO;
import com.donutec.dto.ProdutoDTO;
import com.donutec.model.Adicional;
import com.donutec.model.Produto;
import com.donutec.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoDTO> listar (){
        List<Produto> result = produtoRepository.findAll();
        return result.stream().map(x -> new ProdutoDTO(x)).toList();
    }

    public ProdutoDTO salvar(ProdutoDTO produtoDTO){
        Produto produto = new Produto(produtoDTO);
        Produto save = produtoRepository.save(produto);
        return new ProdutoDTO(save);
    }

    public void deletar(Produto produto){
        produtoRepository.delete(produto);
    }

    public Optional<ProdutoDTO> buscarPorId(Long id){
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        return produtoOptional.map(ProdutoDTO::new);

    }

    public List<ProdutoDTO> buscarPorNome(String nome){
        return produtoRepository.findByNomeContainingIgnoreCase(nome);
    }
}
