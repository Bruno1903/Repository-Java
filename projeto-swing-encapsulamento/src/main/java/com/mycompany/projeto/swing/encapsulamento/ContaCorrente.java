package com.mycompany.projeto.swing.encapsulamento;


public class ContaCorrente {

    // o modificador "private" torna um atributo
    // PRIVADO ou seja, NÃO pode ser mais alterado nem obtido
    // por ninguém que não seja a própria ContaCorrente
    private Double saldo = 0.0;
    private Integer operacoes = 0;
    private Integer depositos = 0;
    private Integer saques = 0;
    
    //o modificador PUBLIC torna um método PÚBLICO
    // ou seja, qualquer outra classe pode invoca-lo
    public void depositar15(){
        saldo += 15;
        operacoes++;
        depositos++;
    }
 
    public void sacar5(){
        saldo -= 5;
        operacoes++;
        saques++;
    }
    
    //Método público no padrão get/set
    //ele entrega, ou seja, retorna um valor do tipo double
    //poois está Double antes do nome
    //Internamente ele simplesmente devolve o valor "saldo"
    public Double getSaldo() {
        return saldo;
    }

    public Integer getOperacoes() {
        return operacoes;
    }
    
    public Integer getDepositos(){
        return depositos;
    }
    
    public Integer getSaques(){
        return saques;
    }
    
}
