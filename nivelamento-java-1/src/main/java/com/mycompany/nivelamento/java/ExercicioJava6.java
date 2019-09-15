
package com.mycompany.nivelamento.java;

import java.util.Scanner;

public class ExercicioJava6 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe o salário bruto:");
        Double SalBruto = leitor.nextDouble();
        
        Double Inss = SalBruto - 0.10;
        Double Ir = SalBruto - 0.20;
        
        System.out.println("quanto custa a condução diária só de ida da casa para o trabalho?");
        Double Vt = leitor.nextDouble();
        
        
    }
    
}
