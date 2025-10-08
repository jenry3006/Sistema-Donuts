package com.donutec.dto;

import com.donutec.model.Adicional;
import com.donutec.model.ItensVenda;
import com.donutec.model.Produto;
import com.donutec.model.Venda;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ItensVendaDTO {

    private Long id;
    private Produto produto;
    private Venda venda;
    private Integer quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;
    private List<Adicional> adicionais = new ArrayList<>();

    public ItensVendaDTO(ItensVenda itensVenda) {
        id = itensVenda.getId();
        produto = itensVenda.getProduto();
        venda = itensVenda.getVenda();
        quantidade = itensVenda.getQuantidade();
        valorUnitario = itensVenda.getValorUnitario();
        valorTotal = itensVenda.getValorTotal();
        adicionais = itensVenda.getAdicionais();
    }

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

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Adicional> getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(List<Adicional> adicionais) {
        this.adicionais = adicionais;
    }

    @Override
    public String toString() {
        return "ItensVendaDTO{" +
                "id=" + id +
                ", produto=" + produto +
                ", venda=" + venda +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                ", valorTotal=" + valorTotal +
                ", adicionais=" + adicionais +
                '}';
    }
}
