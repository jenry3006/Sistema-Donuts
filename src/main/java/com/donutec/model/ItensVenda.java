package com.donutec.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ItensVenda {

    @Id
    private Long id;
    @ManyToOne
    private Produto produto;
    @ManyToOne
    private Venda venda;
    private Integer quantidade;
    private BigDecimal valorUnitario;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "itensvenda_adicionais",
            joinColumns = @JoinColumn(name = "itens_venda_id"),
            inverseJoinColumns = @JoinColumn(name = "adicional_id"))
    private List<Adicional> adicionais = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public List<Adicional> getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(List<Adicional> adicionais) {
        this.adicionais = adicionais;
    }
}
