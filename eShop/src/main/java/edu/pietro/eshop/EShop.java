package edu.pietro.eshop;

import Produto.Produto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EShop {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        // Leitura da quantidade
        System.out.print("Digite a quantidade para a venda do celular: ");
        int qtd = Integer.parseInt(reader.readLine());

        // Produto: celular
        Produto celular = new Produto();
        celular.setSku("123456");
        celular.setNome("celular");
        celular.setPreco(1000.00f);
        celular.setSaldo(5);
        System.out.println(
            "Venda: " + celular.getSku() + " - " + celular.getNome()
            + " | Preço: " + celular.getPreco() + " x " + qtd + " = "
            + (qtd * celular.getPreco())
        );

        // Produt: pc
        Produto pc = new Produto();
        pc.setSku("654321");
        pc.setNome("pc");
        pc.setPreco(3000.00f);
        pc.setSaldo(4500);
        System.out.println(
            "Venda: " + pc.getSku() + " - " + pc.getNome()
            + " | Preço: " + pc.getPreco() + " x 2 = "
            + (2 * pc.getPreco())
        );

        // Produto: teclado
        Produto teclado = new Produto();
        teclado.setSku("789012");
        teclado.setNome("teclado");
        teclado.setPreco(300.00f);
        teclado.setSaldo(150);
        System.out.println(
            "Venda: " + teclado.getSku() + " - " + teclado.getNome()
            + " | Preço: " + teclado.getPreco() + " x 2 = "
            + (2 * teclado.getPreco())
        );

        // === Novo Produto criado pelo usuário ===
        System.out.println("\n--- Cadastro de novo produto ---");
        System.out.print("Digite o SKU do produto: ");
        String sku = reader.readLine();

        System.out.print("Digite o nome do produto: ");
        String nome = reader.readLine();

        System.out.print("Digite o preço do produto: ");
        float preco = Float.parseFloat(reader.readLine());

        System.out.print("Digite o saldo do produto: ");
        float saldo = Float.parseFloat(reader.readLine());

        // Criar novo objeto Produto
        Produto novoProduto = new Produto();
        novoProduto.setSku(sku);
        novoProduto.setNome(nome);
        novoProduto.setPreco(preco);
        novoProduto.setSaldo(saldo);

        System.out.println(
            "\nNovo produto cadastrado: " +
            novoProduto.getSku() + " - " +
            novoProduto.getNome() + " | Preço: R$" +
            novoProduto.getPreco() + " | Saldo: " +
            novoProduto.getSaldo()
        );
    }
}
