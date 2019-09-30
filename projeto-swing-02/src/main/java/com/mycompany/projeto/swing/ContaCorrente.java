package com.mycompany.projeto.swing;

public class ContaCorrente {
    
    Double saldo = 0.0;
    String cor;
    
    void depositar50(){
        saldo += 50;
        
    }
    
        void depositar25(){
        saldo -= 25;
        
        }
        void atualizarCor(){
            
            if(saldo > 0){
            cor = "#009900";//Verde em RGB
        }else{
            cor = "#990000";//Vermelho em RGB
        }
            
        }
    }
        
