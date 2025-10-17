package edu.pietro.padaria.model;

import java.util.Objects;

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    private int saldoEstoque; // Campo adicionado

    // Construtores
    public Produto() {}

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getSaldoEstoque() {
        return saldoEstoque;
    }

    public void setSaldoEstoque(int saldoEstoque) {
        this.saldoEstoque = saldoEstoque;
    }

    // toString
    @Override
    public String toString() {
        return this.codigo + "-" + this.descricao;
    }

    // equals e hashCode corrigidos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produto produto = (Produto) obj;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}