package com.donutec.dto;

import com.donutec.model.Produto;

public class ProdutoDTO {

    private Long id;
    private String nome;

    public ProdutoDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ProdutoDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public ProdutoDTO(Produto produto){
        id = produto.getId();
        nome = produto.getNome();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
