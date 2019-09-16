
package com.mycompany.ifelse;

import java.util.Scanner;

public class OperadorTernário {
    
    Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Integer idade = 120;
        
        String sit = idade>= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println("Situação: "+sit);
    }
    
}
