package ex07;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(8, 4);

        System.out.println("\nA area de um retangulo com base " + retangulo.getBase() + " e altura " + retangulo.getAltura() + " é " + retangulo.calcularArea());
        System.out.println("\nO perimetro de um retangulo com base " + retangulo.getBase() + " e altura " + retangulo.getAltura() + " é " + retangulo.calcularPerimetro());

        retangulo.mudarLado(5,10);
        System.out.println("\nA area de um retangulo com base " + retangulo.getBase() + " e altura " + retangulo.getAltura() + " é " + retangulo.calcularArea());
        System.out.println("\nO perimetro de um retangulo com base " + retangulo.getBase() + " e altura " + retangulo.getAltura() + " é " + retangulo.calcularPerimetro());
    }

}
