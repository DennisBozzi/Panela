/*
 Faça um programa que leia 10 números e informe:
A soma destes números;
A média destes números;
O maior número; e
O menor número.

 */
package com.mycompany.modulo_2_atividades;

import java.util.Scanner;

public class ATIVIDADES_FIXAÇAO_ALGORITMO_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int soma = 0, n, maior = 0, menor = 999999;
        float media = 0;
        System.out.println("digite um número:"); //leitura dos números
        for (int i = 0; i < 10; i++) {
            n = ler.nextInt();
            soma = n + soma;//soma dos numeros digitados
            for (int j = 0; j < 10; j++) {

                if (n > maior) {

                    maior = n;

                } else if (n < menor) {
                    menor = n;
                }
            }
        }

        media = soma / 10; //média dos números

        System.out.println(" a soma dos numeros é :" + soma);
        System.out.println(" a média dos números é :" + media);
        System.out.println("O maior número é :" + maior);
        System.out.println("O menor número é :" + menor);
    }
}

