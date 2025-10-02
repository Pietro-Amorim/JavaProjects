/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.pietro.padaria.model;

/**
 *
 * @author Guilherme
 */

public enum ProdutoEnum {
    PAO_FRANCES(1, "Pão Francês", 0.75),
    PAO_DE_QUEIJO(2, "Pão de Queijo", 2.50),
    BROA_DE_MILHO(3, "Broa de Milho", 1.80),
    BOLO_DE_FUBA(4, "Bolo de Fubá", 15.00),
    SONHO_DE_CREME(5, "Sonho de Creme", 4.50),
    CROISSANT(6, "Croissant", 5.00),
    TORTA_DE_MORANGO(7, "Torta de Morango", 45.00),
    BRIGADEIRO(8, "Brigadeiro", 3.00),
    COXINHA(9, "Coxinha", 6.00),
    ENROLADINHO_DE_SALSICHA(10, "Enroladinho de Salsicha", 5.50),
    SUCO_DE_LARANJA(11, "Suco de Laranja", 8.00),
    CAFE_COM_LEITE(12, "Café com Leite", 7.00),
    CAPPUCCINO(13, "Cappuccino", 9.00),
    SALGADO_ASSADO(14, "Salgado Assado", 4.00),
    BOLO_DE_CHOCOLATE(15, "Bolo de Chocolate", 18.00),
    ROSQUINHA_DE_COCO(16, "Rosquinha de Coco", 3.50),
    QUINDIM(17, "Quindim", 4.00),
    EMPADINHA_DE_FRANGO(18, "Empadinha de Frango", 6.50),
    MINI_PIZZA(19, "Mini Pizza", 7.00),
    DOCE_DE_LEITE(20, "Doce de Leite", 12.00);

    private final int codigo;
    private final String descricao;
    private final double preco;

    ProdutoEnum(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public double getPreco() {
        return preco;
    }

}