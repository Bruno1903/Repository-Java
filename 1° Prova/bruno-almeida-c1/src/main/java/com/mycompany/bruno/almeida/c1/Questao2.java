
package com.mycompany.bruno.almeida.c1;

import java.util.Random;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         Random voos = new Random();
         Integer contador = 0;
         Integer total = 0;
         while (true){
             contador++;
             System.out.println("De quantas horas foi o seu último voo?");
             Integer horas = leitor.nextInt();
             
             if(horas < 0){
                 contador--;
                 System.out.println("Camila se aposentou após fazer "+contador+" vôos acumulando "+total+" horas!");
                 break;
             }else if(horas == 0 || horas > 6){
                 contador--;
                 System.out.println("Quantidade inválida! Não será registrada!");
             }else{
                 total = horas + total;
                 System.out.println("Camila agora tem um total de "+total+" de vôo");
             }
         }
    }
    
}
