
package com.mycompany.bruno.almeida.c1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Em quantos segundos você fez a ultima corrida de 100m?");
        Double segundos = leitor.nextDouble();
        
        Double brasileiro = 10.00;
        Double sulAmericano = 9.80;
        Double olimpico = 9.63;
        Double mundial = 9.58;
        
        Double conta = brasileiro - segundos;
        Double conta1 = sulAmericano - segundos;
        Double conta2 = olimpico  - segundos;
        Double conta3 = mundial - segundos;
        Double meses = (conta3 * 100) * 6;
        
        if(segundos <= 0){
            System.out.println("Muito engraçado! #SQN");
        }else{
        
        if(conta <= 0){
            System.out.println(String.format("Recorde Brasileiro: faltam %.2f s para bater", (conta*-1)));
        }else{
            System.out.println(String.format("Recorde Brasileiro: Batido por %.2f s ", conta));
        }
        if(conta1 <= 0){
            System.out.println(String.format("Recorde SulAmericano: faltam %.2f s para bater", (conta1*-1)));
        }else{
            System.out.println(String.format("Recorde SulAmericano: Batido por %.2f s ", conta1));
        }if(conta2 <= 0){
            System.out.println(String.format("Recorde Olimpico: faltam %.2f s para bater", (conta2*-1)));
        }else{
            System.out.println(String.format("Recorde Olimpico: Batido por %.2f s ", conta2));
        }if(conta3 <= 0){
            System.out.println(String.format("Recorde Mundial: faltam %.2f s para bater", (conta3)*-1));
            System.out.println(String.format("Provavelmente, se treinar por mais %.0f meses, vai bater o recorde mundial", (meses*-1)));
        }else  {
            System.out.println(String.format("Recorde Mundial: Batido por %.2f s ", conta3));
            System.out.println("Parabéns! Você é o homem mais rápido do mundo!");
        }
}
    }
}

