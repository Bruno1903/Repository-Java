
package com.mycompany.ifelse;

import java.util.Scanner;

public class ClassesSociais {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual seu salário?");
        Double bruto = leitor.nextDouble();
        
        Double salarios = bruto / 1000.0;
        
        System.out.println(String.format("Você ganha %.1f salários", salarios));
        
        if(salarios>8){
            System.out.println("Classe A");
        }else if(salarios<2){
            System.out.println("Classe D");
        }else if(salarios>2 && salarios<=4){
            System.out.println("Classe C");
        }else{
            System.out.println("Classe B");
        }
    }
    
}
