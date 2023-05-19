package ex06;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(5);

        System.out.println("A area de um quadrado com lado de " + quadrado.retornarValorLado() + "cm é " + quadrado.calcularArea() + "cm²");

        quadrado.mudarValorLado(15);

        System.out.println("A area de um quadrado com lado de " + quadrado.retornarValorLado() + "cm é " + quadrado.calcularArea() + "cm²");
    }
}
