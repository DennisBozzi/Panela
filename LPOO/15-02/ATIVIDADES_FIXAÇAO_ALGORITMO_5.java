/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modulo_2_atividades;

import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
public class ATIVIDADES_FIXAÇAO_ALGORITMO_5 {
    
    public static void main(String[] args) {
        
        //matriz
        Random random = new Random();
      Integer[][] vetor = new Integer [3][3]; 
      int maiorNum=0,mediaVetor=0,somaVetor=0;

     
      System.out.println("Vetor Original ");

      //Geração dos valores aleatórios do vetor
      for(int i = 0;i<vetor.length;i++){
        
        for(int j=0;j<vetor.length;j++){
          vetor[i][j] = random.nextInt(99)+1;;

          if(vetor[i][j]>maiorNum){
            maiorNum=vetor[i][j];
          }
          somaVetor=vetor[i][j]+somaVetor;
          mediaVetor=somaVetor/vetor.length;

          System.out.print(vetor[i][j]+" ");
        }
        System.out.println("\n");
      }
     //organizando a matriz
      
      System.out.println("Matriz Organizado do maior para o menor ");
      
      for (Integer[] linha : vetor) {
          Arrays.sort(linha, Collections.reverseOrder());
        }
       

        
        
        for (Integer[] linha : vetor) {
          for (Integer elemento : linha) {
              System.out.print(elemento + " ");
            }
          System.out.println("\n");
        }
        //Esse for apenas Imprime os valores do maior pro menor


        
      System.out.println("Matriz organizada do menor para o Maior");
      for (Integer[] linha : vetor) {
          Arrays.sort(linha);
          }
          for (Integer[] linha : vetor) {
              for (Integer elemento : linha) {
                  System.out.print(elemento + " ");
              }
      System.out.println("\n");
        }

      
        //prints
        System.out.println("Soma dos valores do vetor: "+somaVetor); 
        System.out.println("A média dos valores do vetor"+mediaVetor);
    
    }
}
    
    
