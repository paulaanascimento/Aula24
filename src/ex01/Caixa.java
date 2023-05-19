package ex01;

public class Caixa {

    private double saldo;

    public Caixa(){
        this.saldo = 1000;
    }

    public void credito(double valor){
        saldo = saldo + valor;
    }

    public void debito(double valor){
        saldo = saldo - valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
