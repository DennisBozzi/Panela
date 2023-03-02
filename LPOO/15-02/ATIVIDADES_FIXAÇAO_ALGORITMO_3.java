/*
 Faça um programa que leia o número e o peso de um boi, a leitura encerra quando o número digitado for 0 (zero) e informe:
Quantos bois foram digitados;
Qual o total de peso dos bois;
Qual a média de peso dos bois;
Qual o número e o peso do boi mais pesado; e
Qual o número e o peso do boi mais leve.

 */
package com.mycompany.modulo_2_atividades;

import java.util.Scanner;

public class ATIVIDADES_FIXAÇAO_ALGORITMO_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //variaveis
        int n = 1, contador = 0, Somapeso = 0, Mediapeso = 0, Maisleve=99999,Maispesado = 0;
        int Numeropesado=0;
        int Numeroleve=0;
        for (int i = 0; i < n; i++) {

            //vetores
            int[] Numeroboi = new int[n];
            int[] Pesoboi = new int[n];
            
            //pedido do Número do boi
            System.out.println(" N°");
            Numeroboi[i] = ler.nextInt();

            //conferencia da sentinela "0" para parar o programa
            if (Numeroboi[i] == 0) {
                break;

            } else {
                n++;
                contador++;
            }
            //Pedido dos pesos
            System.out.println(" Qual o Peso do " + (i + 1) + "°" + " Boi ");
            Pesoboi[i] = ler.nextInt();

            //Soma do pesos dos bois
            Somapeso = Somapeso + Pesoboi[i];
            
            //conferencia do boi mais pesado
            if (Pesoboi[i]>Maispesado) {
             Maispesado = Pesoboi[i];   
             Numeropesado = Numeroboi[i];
            
            }
             
              //conferencia do boi mais leve
            if (Pesoboi[i]<Maisleve) {
             Maisleve = Pesoboi[i];   
             Numeroleve = Numeroboi[i];
            
                
            
        }

       

    }
        
        //média dos pesos 
        Mediapeso = Somapeso / contador;

         System.out.println(" Quantidade de Bois digitados: " + contador);
        System.out.println(" O peso total dos bois digitados é: " + Somapeso);
        System.out.println(" A Média dos Pesos dos Bois é: " + Mediapeso);
        System.out.println(" O numero do Boi mais pesado é "+Numeropesado+" pesando: " +Maispesado);
        System.out.println(" O numero do Boi mais leve é "+Numeroleve+" pesando: " +Maisleve);
}
}
