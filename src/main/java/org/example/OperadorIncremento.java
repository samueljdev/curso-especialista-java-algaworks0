package org.example;

public class OperadorIncremento {
    public static void main(String[] args) {
        int totalDownloads = 10;

        // totalDownloads = totalDownloads + 1;
        // totalDownloads += 1;

        // totalDownloads++;

        // int novoTotalDownloads = totalDownloads++; ñ funciona porque atribui primeiro o valor e incremente depois
        int novoTotalDownloads = ++totalDownloads; // incrementa primeiro pra depois atribuir

        System.out.println("Total de downloads: " + totalDownloads);
        System.out.println("Novo total de downloads: " + novoTotalDownloads);
    }
}
