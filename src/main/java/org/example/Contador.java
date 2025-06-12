package org.example;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }

    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int indice = 1; indice <= contagem; indice++) {
            System.out.println("Imprimindo o número " + indice);
        }

    }
}