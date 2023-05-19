package ex02;

public class Bola {

    private double circunferencia;
    private String cor;
    private String marca;
    private String material;
    private double velocidade;

    public Bola(double circunferencia, String cor, String marca, String material, double velocidade){
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade = velocidade;
    }

    public void trocaCor(String novaCor){
        this.cor = novaCor;
    }

    public void mostraCor(){
        System.out.println("A cor da bola é: " + cor);
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
