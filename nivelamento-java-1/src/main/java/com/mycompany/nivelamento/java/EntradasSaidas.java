package com.mycompany.nivelamento.java;

import java.util.Scanner;

public class EntradasSaidas {

    public static void main(String[] args) {
        String cidade = "São Paulo";
        Integer populacao = 15000000; // poderia ser 15_000_000
        Double temperaturaMedia = 23.1234;
        
        // Unindo via concatenação
        String frase1 = "Você mora em "+cidade
                        +" onde moram "+populacao+" pessoas";
        
        System.out.println(frase1);
        
        
        // Unindo via Interpolação
        /*
        %s -> Texto
        %d -> número inteiro
        %.?f -> número real, onde ? é o número de casas decimais
        // ex: %.2f -> mostraria com 2 cadas decimais        
        */
        String frase2 = String.format(
                "Você mora em %s onde moram %d pessoas", 
                cidade, populacao);
        
        System.out.println(frase2);
        
        String frase3 = String.format(
                "Em %s faz %.2f celsius em média",
                cidade, temperaturaMedia);
        
        System.out.println(frase3);
        
        
        String frase4 = String.format(
           "Aqui moram %d e a temp. média é %.1f. Essa é %s",
                populacao, temperaturaMedia, cidade);
        
        System.out.println(frase4);
        
        
        // Solicitando valores ao usuário
        // devemos criar um "Scanner"
        Scanner leitor = new Scanner(System.in);
        
        // ex: lendo um texto (String) digitado pelo usuário
        System.out.println("Informe sua fruta favorita");
        // solicitando a leitura no "output"
        String fruta = leitor.next();
        // para um um texto, usamos ".next()" ou ".nextLine()"
        // ."next()" só pega a 1ª palavra. "nextLine()" pega todas

        System.out.println("Sua fruta é "+fruta);

        // ex: lendo um número inteiro (Integer)
        System.out.println("Informe seu semestre");
        Integer semestre = leitor.nextInt();
        
        // ex: lendo um número real (Double)
        System.out.println("Informe sua altura");
        Double altura = leitor.nextDouble();

        System.out.println(
            "Você mede "+altura+" e está no "+semestre+"º sem.");


    }
}




