/*2. (Peso: 60% da nota da prova) Camila Mada realizou seu sonho e fez um curso de pilotagem de aviões. Como todo piloto, precisa constantemente registrar seus tempos de vôo afim de ter seu total de horas de vôo atualizado. Isso é de extrema importância na aviação. Ajude a Camila criando uma classe Java que:
a) Seja executável

b) Pergunte para a Camila, indefinidas vezes, "De quantas horas foi seu último vôo?".
 Só pare de perguntar quando ela informar um valor negativo, pois será o dia de sua "aposentadoria"

c) Cada vez que receber a quantidade de horas de um vôo, ignore o valor caso seja 0 (zero) ou maior que 6,
 pois um piloto não pode passar de 6h ininterruptas de vôo. Nesses casos, exiba a frase "Quantidade inválida! Não será registrada!".
  Porém, continue perguntando

d) Cada vez que receber a quantidade de horas VÁLIDO, atualize o total de horas que Camila tem de vôo e exiba uma frase como esta:
 "Camila agora tem um total de H horas de vôo"

e) Após "se aposentar", ou seja, depois que informar um valor negativo, exiba a seguinte frase para Camila:
 "Camila se aposentou após fazer X vôos acumulando H horas!", onde X só deve considerar os registros de hora VÁLIDOS (item d)),
  não os inválidos (item c)) nem o que provocou sua aposentadoria*/
package com.mycompany.bruno.almeida.c1;

import java.util.Random;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         Random voos = new Random();
         Integer contador = 0;
         Integer total = 0;
         while (true){
             contador++;
             System.out.println("De quantas horas foi o seu último voo?");
             Integer horas = leitor.nextInt();
             
             if(horas < 0){
                 contador--;
                 System.out.println("Camila se aposentou após fazer "+contador+" vôos acumulando "+total+" horas!");
                 break;
             }else if(horas == 0 || horas > 6){
                 contador--;
                 System.out.println("Quantidade inválida! Não será registrada!");
             }else{
                 total = horas + total;
                 System.out.println("Camila agora tem um total de "+total+" de vôo");
             }
         }
    }
    
}
