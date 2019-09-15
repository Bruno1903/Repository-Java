
package com.mycompany.nivelamento.java;

import java.util.Scanner;

public class ExercicioJava8 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Valor unitário de um produto:");
        Double valorProd = leitor.nextDouble();

        System.out.println("Quantidade vendida:");
        Integer qtdProd = leitor.nextInt();
        
        System.out.println("Valor pago pelo cliente:");
        Double valorCliente = leitor.nextDouble();
        
        Double calculo1 = valorProd * qtdProd;
        Double calculo2 = valorCliente - calculo1;
        
        if(valorCliente > calculo1){
            System.out.println(String.format("Seu troco será de R$%.2f", calculo2));
        }if(calculo2==0){
            System.out.println("Sem troco");
        }if(valorCliente<valorProd){
            System.out.println("Precisa de mais dinheiro");
        }
                
    }
    
}
