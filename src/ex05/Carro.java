package ex05;

public class Carro {

    private int quantidadePorta;
    private String modelo;
    private String marca;
    private double potencia;

    public Carro(int quantidadePorta, String modelo, String marca){
        this.quantidadePorta = quantidadePorta;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public void ligarCarro(){
        System.out.println("Carro ligado!");
    }

    public void desligarCarro(){
        System.out.println("Carro desligado!");
    }

    public int getQuantidadePorta() {
        return quantidadePorta;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
