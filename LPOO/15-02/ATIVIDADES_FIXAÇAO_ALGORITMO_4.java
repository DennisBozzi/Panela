/*
 Faça um programa que gere um vetor de 10 posições para números inteiros, preencha o vetor com números diversos, organize o vetor do menor para o maior e mostre:
O vetor digitado originalmente;
O vetor organizado do menor para o maior;

 */
package com.mycompany.modulo_2_atividades;

import java.util.Arrays;
import java.util.Scanner;


public class ATIVIDADES_FIXAÇAO_ALGORITMO_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //vetores
        int[] vetor = new int[10];
        int[] vetorordem = new int[10];

        System.out.println(" digite 10 números: ");

        //leitura dos numeros
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ler.nextInt();

            vetorordem[i] = vetor[i];

        }

        //colocando os números na ordem certa
        Arrays.sort(vetorordem);

        System.out.println(" Vetor desorganizado: " + Arrays.toString(vetor));
        System.out.println(" Vetor organizado: " + Arrays.toString(vetorordem));

    }

}
