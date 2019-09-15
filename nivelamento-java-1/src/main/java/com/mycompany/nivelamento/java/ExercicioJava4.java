/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nivelamento.java;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExercicioJava4 {
    
    public static void main(String[] args) {
        
        //Importando Scanner para ler comandos digitados
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe seu login");
        String login = leitor.nextLine();
        
        System.out.println("Informe sua senha");
        String senha = leitor.nextLine();
        
        System.out.println("Quantas vezes voce aceitar errar a senha?");
        Integer erros = leitor.nextInt();
        
        System.out.println("Seu login é "+login+" e sua senha é "+senha+". Você "
                + "tem "+erros+" tentativas antes de ser bloqueado "); 
    }
    
}
