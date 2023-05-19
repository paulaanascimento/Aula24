package ex07;

public class Retangulo {

    private int base;
    private int altura;

    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void mudarLado(int novaBase, int novaAltura){
        base = novaBase;
        altura = novaAltura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int calcularArea() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return 2 * (base + altura);
    }
}
