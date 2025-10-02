
package edu.pietro.padaria.model;

import java.util.Objects;

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    
    @Override
    public String toString(){
        return this.codigo +"-"+ this.descricao;
    }
    public Produto(){};
    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

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

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        return this.codigo == ((Produto)obj).codigo;
    }

    
}
