package ex04;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente("85583-9", "Carla Lopes");

        conta.depositoConta(5000);
        conta.saqueConta(100);

        System.out.println("-----Informações da Conta-----");
        System.out.println("Numero da Conta: " + conta.getNumeroConta());
        System.out.println("Nome do Correntista: " + conta.getNomeCorrentista());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
