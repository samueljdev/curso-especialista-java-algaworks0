package org.example;

public class AbreviandoOperadoresAritmetico {
    public static void main(String[] args) {
        int quantidadeProdutos = 10;

        // Isso aqui:
        // quantidadeProdutos = quantidadeProdutos + 3;

        // É o mesmo que isso aqui:
        quantidadeProdutos += 3;
        System.out.println(quantidadeProdutos);

        quantidadeProdutos -= 3;
        System.out.println(quantidadeProdutos);

        quantidadeProdutos *= 3;
        System.out.println(quantidadeProdutos);

        quantidadeProdutos /= 2;
        System.out.println(quantidadeProdutos);

        quantidadeProdutos %= 4;
        System.out.println(quantidadeProdutos);
    }
}
