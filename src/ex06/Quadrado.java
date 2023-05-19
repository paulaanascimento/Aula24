package ex06;

public class Quadrado {

    private int tamanhoLado;

    public Quadrado(int tamanhoLado){
        this.tamanhoLado = tamanhoLado;
    }

    public void mudarValorLado(int tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public int retornarValorLado() {
        return tamanhoLado;
    }

    public int calcularArea(){
        return tamanhoLado*tamanhoLado;
    }
}
