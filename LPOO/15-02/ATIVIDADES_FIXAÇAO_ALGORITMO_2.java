/*
Faça um programa que leia o nome, idade e sexo de várias pessoas até que o nome digitado seja “FIM” e informe:
O nome e a idade da pessoa mais velha;
O nome e a idade da pessoa mais nova;
Quantas pessoas eram do sexo masculino;
Quantas pessoas eram do sexo feminino; e
A quantidade de pessoas digitadas e a média de idade.

 */
package com.mycompany.modulo_2_atividades;

import java.util.Scanner;

public class ATIVIDADES_FIXAÇAO_ALGORITMO_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //variaveis
        int n = 1, contador = 0, soma = 0, feminino = 0, masculino = 0;
    
        int maisnovo = 999999;
        String nomeMaisVelho = "s";
        int maisVelho = 0;

        int maisNovo = 999999999;
        String nomeMaisNovo = "s";
        for (int i = 0; i < n; i++) {
            //vetores
            String[] nome = new String[n];
            int[] idade = new int[n];
            String[] sexo = new String[n];
            //pedido dos nomes das pessoas
            System.out.println(" Qual o nome da " + (i + 1) + " pessoa ? ");
            nome[i] = ler.next();
            //sentinela "fim" para parar o programa
            if (nome[i].equalsIgnoreCase("fim")) {
                break;
            } else {
                n++;
                contador++;
            }
            //pedido das idades
            System.out.println(" Qual a idade da " + (i + 1) + " pessoa ? ");
            idade[i] = ler.nextInt();
               //Soma das idades
            soma = soma + idade[i];

            //Conferencia da pessoa mais velha
            if (maisVelho < idade[i]) {
                maisVelho = idade[i];
                nomeMaisVelho = nome[i];
            }
            //Conferencia pessoa mais nova
            if (idade[i] < maisNovo) {
                maisNovo = idade[i];
                nomeMaisNovo = nome[i];
            }
            //pedido dos sexos
            System.out.println(" Qual o sexo da " + (i + 1) + " pessoa ?(F/M)");
            sexo[i] = ler.next();
            //comparando a quantidades dos sexos masculinos e femininos
            if (sexo[i].equalsIgnoreCase("f")) {

                feminino++;
            } else {
                masculino++;
            }
        }
        //media das idades
        int media = soma/contador;
        //prints na tela
        System.out.println(" Quantidade de pessoas do sexo feminino: " + feminino);
        System.out.println(" Quantidade de pessoas do sexo masculino: " + masculino);
        System.out.println(" Quantidade de pessoas digitadas: " + contador);
        System.out.println(" A média da idade das pessoas digitadas: " + media);
        System.out.println("A pessoa mais velha é " + nomeMaisVelho + " com :" + maisVelho);
        System.out.println("A pessoa mais nova é " + nomeMaisNovo + " com :" + maisNovo);
    }
}
