package org.example;

public class OperadorDecremento {
    public static void main(String[] args) {
        int limiteTentativasLogin = 10;

        // limiteTentativasLogin--;

        // int novoLimiteTentativasLogin = limiteTentativasLogin--;
        int novoLimiteTentativasLogin = --limiteTentativasLogin; // decrementa primeiro pra depois atribuir

        System.out.println("Limite de tentativas de login: " + limiteTentativasLogin);
        System.out.println("Novo limite de tentativas de login: " + novoLimiteTentativasLogin);
    }
}
