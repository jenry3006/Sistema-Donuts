package com.donutec.model;

import com.donutec.dto.ProdutoDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome do produto não pode estar vazio.")
    private String nome;
    @NotNull(message = "Defina um preço para o produto")
    private BigDecimal precoVenda;
    @NotNull(message = "Defina um preço para o produto")
    private BigDecimal precoCusto;
    private String observacao;

    public Produto(Long id, String nome, BigDecimal precoVenda, BigDecimal precoCusto, String observacao) {
        this.id = id;
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.observacao = observacao;
    }

    public Produto(){}

    public Produto (ProdutoDTO produtoDTO){
        this.id = produtoDTO.getId();
        this.nome = produtoDTO.getNome();
        this.precoVenda = produtoDTO.getPrecoVenda();
        this.precoCusto = produtoDTO.getPrecoCusto();
        this.observacao = produtoDTO.getObservacao();
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

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", precoVenda=" + precoVenda +
                ", precoCusto=" + precoCusto +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}
