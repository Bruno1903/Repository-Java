
package com.mycompany.projeto.swing;

public class Clube {
    
    Integer vitorias = 0;
    Integer empates = 0;
    Integer derrotas = 0;
    Integer pontos = 0;
    
    void registrarVitoria(){
        
        pontos += 3;
        vitorias++;
        
    }
    void registrarEmpate(){
        
        pontos += 1;
        empates++;
        
    }
    void registrarDerrota(){
        
        derrotas++;
        
    }
    
}
