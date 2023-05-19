package ex03;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = 0;
        this.altura = altura;
    }

    public void envelhecer(){
        this.idade++;
        if(idade < 21){
            crescer(0.5);
        }
    }

    public void engordar(){
        this.peso++;
    }

    public void emagrecer(){
        this.peso--;
    }

    public void crescer(double altura){
        this.altura = this.altura + altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double novoPeso){
        this.peso = novoPeso;
    }

    public double getAltura() {
        return altura;
    }

}
