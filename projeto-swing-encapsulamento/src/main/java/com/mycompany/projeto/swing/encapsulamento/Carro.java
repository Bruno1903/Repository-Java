package com.mycompany.projeto.swing.encapsulamento;

    
public class Carro {
    
    private Boolean ligado = false;
    private Double velocidade = 0.0;
    
    public void ligar(){
        ligado = true;
        
    }
    
    public void desligar(){
        ligado = false;
        velocidade = 0.0;
    }
    
    //ao acelerar o carro aumenta sua velocidade em 25
    public void acelerar(){
        
        if(ligado){
        velocidade += 25;
        }
    }
    
    //ao frear o carro reduz sua velocidade em 35
    public void frear(){
        velocidade -= 35;
        if (velocidade < 0){
            velocidade = 0.0;
        }
    }

    public Double getVelocidade() {
        return velocidade;
    }
    
    public String getStatus(){
        return ligado ? "Ligado" : "Desligado";
    }
}
