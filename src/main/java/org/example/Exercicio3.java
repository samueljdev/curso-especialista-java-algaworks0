package org.example;

import java.util.Scanner;
/* Escreva um programa que solicita números inteiros ao usuário de forma contínua e soma
todos os números informados. O programa deve parar de solicitar mais números e imprimir a soma
deles na saída apenas quando o valor total somado for igual ou superior a 100. */

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaNumeros = 0;

        while (somaNumeros < 100) {
            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            somaNumeros += numero;
        }

        System.out.printf("Soma dos números: %d%n", somaNumeros);
    }
}
