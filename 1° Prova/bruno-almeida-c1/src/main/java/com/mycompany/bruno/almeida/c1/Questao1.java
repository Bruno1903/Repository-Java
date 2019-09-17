/*1. (Peso: 40% da nota da prova) Luiz Quisito está treinando em alto nível na modalidade de corrida de 100m rasos. Seu sonho é bater o recorde de Usain Bolt um dia. Para isso ele precisa de um programa que registre seu tempo e compare com diversos recordes. Ajude Luiz criando uma classe Java que:

a) Seja executável

b) Pergunte ao usuário em quantos segundos ele fez sua última corrida de 100m. Aceite valores decimais. Caso o usuário insira 0 ou menos, exiba "Muito engraçado! #SQN" e não faça mais nada. Caso contrário, prossiga para c)

c) Compare seu tempo com outros recordes, que são:
    Recorde brasileiro: 10,00s
    Recorde sul americano: 9,80s
    Recorde olímpico: 9,63s
    Recorde mundial: 9,58s

d) A partir das diferenças calculadas, exiba 4 frases como estas (no exemplo ele fez em 9,75s):
    Recorde brasileiro: BATIDO por 0.25s
    Recorde sul americano: BATIDO por 0.05s
    Recorde olímpico: Faltam 0.13s para bater
    Recorde mundial: Faltam 0.18s para bater
Ou seja, você deve calcular de o recorde foi batido ou não e exibir a frase com a diferença de tempo por qual bateu ou que falta para bater. Em caso de valor igual a algum recorde, exiba o mesmo para o caso de faltar, o seja, "Faltam 0.01s para bater"

e) Segundo estimativas, um atleta reduz em 0,01s seu tempo a cada 6 meses de treino. Assim, calcule quanto tempo o Luiz ainda deve treinar para bater o recorde mundial e exiba uma frase como esta (no exemplo ele fez em 9,75s): "Provavelmente, se treinar por mais X meses, vai bater o recorde mundial"
f) Supondo que ele já tenha batido o recorde mundial, apenas exiba "Parabéns! Você é o homem mais rápido do mundo!"*/

package com.mycompany.bruno.almeida.c1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Em quantos segundos você fez a ultima corrida de 100m?");
        Double segundos = leitor.nextDouble();
        
        Double brasileiro = 10.00;
        Double sulAmericano = 9.80;
        Double olimpico = 9.63;
        Double mundial = 9.58;
        
        Double conta = brasileiro - segundos;
        Double conta1 = sulAmericano - segundos;
        Double conta2 = olimpico  - segundos;
        Double conta3 = mundial - segundos;
        Double meses = (conta3 * 100) * 6;
        
        if(segundos <= 0){
            System.out.println("Muito engraçado! #SQN");
        }else{
        
        if(conta <= 0){
            System.out.println(String.format("Recorde Brasileiro: faltam %.2f s para bater", (conta*-1)));
        }else{
            System.out.println(String.format("Recorde Brasileiro: Batido por %.2f s ", conta));
        }
        if(conta1 <= 0){
            System.out.println(String.format("Recorde SulAmericano: faltam %.2f s para bater", (conta1*-1)));
        }else{
            System.out.println(String.format("Recorde SulAmericano: Batido por %.2f s ", conta1));
        }if(conta2 <= 0){
            System.out.println(String.format("Recorde Olimpico: faltam %.2f s para bater", (conta2*-1)));
        }else{
            System.out.println(String.format("Recorde Olimpico: Batido por %.2f s ", conta2));
        }if(conta3 <= 0){
            System.out.println(String.format("Recorde Mundial: faltam %.2f s para bater", (conta3)*-1));
            System.out.println(String.format("Provavelmente, se treinar por mais %.0f meses, vai bater o recorde mundial", (meses*-1)));
        }else  {
            System.out.println(String.format("Recorde Mundial: Batido por %.2f s ", conta3));
            System.out.println("Parabéns! Você é o homem mais rápido do mundo!");
        }
}
    }
}

