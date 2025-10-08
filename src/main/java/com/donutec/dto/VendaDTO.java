package com.donutec.dto;

import com.donutec.model.Cliente;
import com.donutec.model.ItensVenda;
import com.donutec.model.Venda;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class VendaDTO {

    private Long id;
    private Cliente cliente;
    private List<ItensVenda> itensVenda = new ArrayList<>();
    private String formaPagamento;
    private String enderecoEntrega;
    private String observacao;
    private LocalDateTime dataVenda;
    private BigDecimal valorTotal;

    public VendaDTO(Venda venda) {
        id = venda.getId();
        cliente = venda.getCliente();
        itensVenda = venda.getItensVenda();
        formaPagamento = venda.getFormaPagamento();
        enderecoEntrega = venda.getEnderecoEntrega();
        observacao = venda.getObservacao();
        dataVenda = venda.getDataVenda();
        valorTotal = venda.getValorTotal();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItensVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItensVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "VendaDTO{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", itensVenda=" + itensVenda +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", enderecoEntrega='" + enderecoEntrega + '\'' +
                ", observacao='" + observacao + '\'' +
                ", dataVenda=" + dataVenda +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
