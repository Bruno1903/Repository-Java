
package com.mycompany.ifelse;

import java.util.Scanner;

public class ComparacaoTextos {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Você é a favor do fim do FGTS?"+ 
                "S (sim), N (não) ou NDA (não saber responder)");
        
        String resposta = leitor.next();
        
        if(resposta.equals("S")){
            System.out.println("Você é a favor");
        }else if(resposta.equals("N")){
            System.out.println("Você é contra");
        }else {
            System.out.println("Sem opinião formada");
        }
        
        System.out.println("Digite o nome da capital do Brasil");
        String capital = leitor.next();
        
        if(!capital.equals("brasília")){
            System.out.println("Errrrrooooooouuuu");
        }else{
            System.out.println("Acertou, miseravi!");
        }
        
        //Comparação independente de maiúscula ou minúsculas
        
        System.out.println("Digite a primeira letra de sua zona");
        String zona = leitor.next();
        
        if (zona.equalsIgnoreCase("N")){
            System.out.println("Zona Norte");
        }else if(zona.equalsIgnoreCase("S")){
            System.out.println("Zona Sul");
        }else if(zona.equalsIgnoreCase("O")){
            System.out.println("Zona Oeste");
        }else{
            System.out.println("Zona Leste");
        }
    }
    
    
}
