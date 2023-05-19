package ex05;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(4, "Range Rover Evoque", "Land Rover");

        carro.setPotencia(249);

        carro.ligarCarro();
        carro.desligarCarro();

        System.out.println("-----Informações do Veículo-----");
        System.out.println("Portas: " + carro.getQuantidadePorta());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Potencia: " + carro.getPotencia());
    }
}
