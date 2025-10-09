/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.pietro.padaria.model;

/**
 *
 * @author PietroJava
 */
public class ProdutoVenda {
    private Produto produto;
    private int quantidade;
    private double total;
    private int SaldoEstoque;
    
    @Override
    public String toString() {
        return quantidade + " x " + produto.getDescricao() + " = R$ " + total;
    }


// getters & setters 
// toString contendo "quantidade x descricao = 

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    



}