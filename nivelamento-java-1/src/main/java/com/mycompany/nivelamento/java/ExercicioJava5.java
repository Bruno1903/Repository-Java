
package com.mycompany.nivelamento.java;

import java.util.Scanner;

public class ExercicioJava5 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos filho de 0 a 3 anos voce tem?");
        Integer bebes = leitor.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos voce tem?");
        Integer adolescentes = leitor.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos voce tem?");
        Integer adultos = leitor.nextInt();
        
        Integer TotalFilhos = bebes + adolescentes + adultos;
        
        Double Calculo = (bebes * 25.12)+(adolescentes * 15.88)
                         +(adultos * 12.44);
        
        System.out.println(String.format("Você tem um total de %d filhos e"
                + " vai receber R$%.2f de bolsa ", TotalFilhos, Calculo));
        
        
    }
}
