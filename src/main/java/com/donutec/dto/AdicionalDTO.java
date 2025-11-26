package com.donutec.dto;

import com.donutec.model.Adicional;

import java.math.BigDecimal;

public class AdicionalDTO {

    private Long id;
    private String nome;
    private BigDecimal valor;

    public AdicionalDTO(Long id, String nome, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public AdicionalDTO(){

    }

    public AdicionalDTO(Adicional adicional) {
        id = adicional.getId();
        nome = adicional.getNome();
        valor = adicional.getValor();
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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
