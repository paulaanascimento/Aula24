package ex04;

public class ContaCorrente {

    private String numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(String numeroConta, String nomeCorrentista){
        this.saldo = 0;
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
    }

    public void depositoConta(double valor){
        this.saldo = saldo + valor;
    }

    public void saqueConta(double valor){
        this.saldo = saldo - valor;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }
}
