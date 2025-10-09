/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.pietro.padaria.service;

/**
 *
 * @author Guilherme
 */

import edu.pietro.padaria.model.Produto;
import edu.pietro.padaria.model.ProdutoEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProdutoService {
    
    private static Random r = new Random();

    public static List<Produto> inicializarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        for (ProdutoEnum item : ProdutoEnum.values()) {
            Produto produto = new Produto();
            produto.setCodigo(item.getCodigo());
            produto.setDescricao(item.getDescricao());
            produto.setPreco(item.getPreco());
            produto.setSaldoEstoque(r.nextInt(5,20));
            produtos.add(produto);
        }
           return produtos;
    }
}