
package com.mycompany.ifelse;

import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor de sua idade");
        Integer idadeMinha = leitor.nextInt();
        
        //Para copiar uma linha mais rápido usa o CRTL + SHIFT + seta pra baixo
        
        System.out.println("Digite a idade do seu irmão");
        Integer idadeIrmao = leitor.nextInt();
        
        //Como saber se você é o mais velho?
        if(idadeMinha > idadeIrmao){
            System.out.println("Você é o mais velho");
        }
        
        if(idadeMinha<idadeIrmao){
            System.out.println("Seu irmão é o mais velho");
        }
        
        if(idadeMinha==idadeIrmao){
            System.out.println("Vocês provavelmente são gêmeos");
        }
    }
    
}
