package com.mycompany.projeto.swing;



public class Cofrinho {

    //Atributos
    Double valorDepositado = 0.0;
    //Double valorDepositado2 = 0.0;
    Integer depositos = 0;
    
    //Métodos
    void depositar50() {
        
        valorDepositado += 0.5;
        
        if(valorDepositado > 5.0){
            valorDepositado = 5.0;
        }else{
        depositos++;//Depositando mais um
        }
    }void depositar2(){
        if(valorDepositado <= 3){
            valorDepositado += 2;
            depositos++;
        }
        
    }

    
    
}
