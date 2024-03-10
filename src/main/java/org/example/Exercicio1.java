package org.example;

import java.util.Scanner;
/* Escreva um programa que solicita 10 números para o usuário e imprime na saída a soma dos números digitados.
Permita que o usuário digite apenas números pares. Caso um número ímpar seja informado, ignore e solicite um
novo número ao usuário.*/

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaNumeros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número par: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                somaNumeros += numero;
            } else {
                i--;
            }
        }

        System.out.printf("Soma dos números pares: %d%n", somaNumeros);
    }
}
