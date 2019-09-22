package br.com.bandtec.sorteios;

import java.util.Random;

public class ProgramaSorteios {
    public static void main(String[] args) {
        // Geração de números aletórios
        
        // uma variável do tipo Random é capaz de gerar
        // números e valores aleatórios
        Random sorteador = new Random();
        
        // ex: sorteando um inteiro qualquer (inclusive negativo)
        Integer aleatorioA = sorteador.nextInt();
        System.out.println("Sorteio A: "+aleatorioA);
        
        // ex: sorteando um inteiro positivo até 99
        //     O 100 jamais será sorteado
        Integer aleatorioB = sorteador.nextInt(100);
        System.out.println("Sorteio B: "+aleatorioB);
        
        // Crie um sorteio cujo resultado exibido p/ o usuário
        // seja os valores de um dadinho (1 a 6)
        Integer dadinho = sorteador.nextInt(6) + 1;
        System.out.println("Dadinho: "+dadinho);
        
        /*
         a) Crie uma variável inteira entre 1 e 100
         e atribua qualquer valor
         
         b) Faça quantos sorteios forem necessários 
         até que o sorteador sorteie o mesmo número da variável
         do início deste enunciado, em a)
        
         c) SE a quantidade de vezes necessárias para o "bingo" for:
          * Até 3: exiba "Você é MUITO sortudo"
          * Entre 4 e 10: exiba "Você é sortudo"
          * Mais de 10: exiba "É melhor você ser trabalhador"
        
         d) Ao final, exiba a quantidade de sorteios realizados
        */
        
        Integer meuBingo = 25; // número da "cartela" do usuário
        Integer sorteado = 0; // número sorteado em cada sorteio
        Integer contagem = 0; // quantidade de sorteios
        
        while (sorteado != meuBingo) {
            // novo sorteio
            sorteado = sorteador.nextInt(100)+1;
            // quantidade de sorteios é atualizada
            contagem++;
        }
        
        if (contagem <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (contagem > 10) {
            System.out.println("É melhor você ser trabalhador");
        } else {
            System.out.println("Você é sortudo");
        }
        System.out.println("Sorteios realizados: "+contagem);
        
    }
}
