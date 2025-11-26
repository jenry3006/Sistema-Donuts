package com.donutec.dto;

import com.donutec.model.Produto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class ProdutoDTO {

    private Long id;
    private String nome;
    private BigDecimal precoVenda;
    private BigDecimal precoCusto;
    private String observacao;

    public ProdutoDTO(Long id, String nome, BigDecimal precoVenda, BigDecimal precoCusto, String observacao) {
        this.id = id;
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.observacao = observacao;
    }

    public ProdutoDTO(){}

    public ProdutoDTO(Produto produto){
        id = produto.getId();
        nome = produto.getNome();
        precoVenda = produto.getPrecoVenda();
        precoCusto = produto.getPrecoCusto();
        observacao = produto.getObservacao();
    }

    @Override
    public String toString() {
        return "ProdutoDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
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

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
