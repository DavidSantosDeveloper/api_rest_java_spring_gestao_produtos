package com.produtos.api.entities;



public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private String categoria;
    private Long quantidade;
    private double precoUnitario;

    // Construtores
    public Produto(Long id, String nome, String descricao, String categoria, Long quantidade, double precoUnitario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
}