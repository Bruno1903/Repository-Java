package br.com.bandtec.projeto.swing.encapsulamento;

public class Carro {

    private Boolean ligado = false;
    private Double velocidade = 0.0;
    
    
    public void ligar() {
        ligado = true;
    }
    
    // ao acelerar, a velocidade aumenta em 5%
    public void acelerar() {
        if (ligado) {
            if (velocidade == 0) {
                velocidade = 5.0;
            }
            velocidade *= 1.20;
            
            if (velocidade > 120) {
                velocidade = 120.0;
            }
        }
    }
    
    // ao frear, a velocidade reduz em 10
    public void frear() {
        velocidade -= 10;
        
        if (velocidade < 0) {
            velocidade = 0.0;
        }
    }
    
    public void desligar() {
        ligado = false;
        velocidade = 0.0;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public String getStatus() {
        return ligado ? "Ligado" : "Desligado";
    }
    
    public String getVelocidadeFormatada() {
        return String.format("%.2f km/h", velocidade);
    }
    
    
}
