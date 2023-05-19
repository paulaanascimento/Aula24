package ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Caixa caixa = new Caixa();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos lançamentos deseja fazer?");
        int quantidade = entrada.nextInt();

        for(int i = 0; i < quantidade; i++){
            int opcao = 0;

            while(opcao!=1 && opcao!=2){
               System.out.println("1 - Crédito");
               System.out.println("2 - Débito");

               opcao = entrada.nextInt();

               switch(opcao){
                   case 1:
                       System.out.println("Digite o valor do crédito: ");
                       caixa.credito(entrada.nextDouble());
                       break;
                   case 2:
                       System.out.println("Digite o valor do débito: ");
                       caixa.debito(entrada.nextDouble());
                       break;
                   default:
                       System.out.println("Opcao Invalida");
               }
           }
        }

        System.out.println("Saldo Final: " + caixa.getSaldo());
    }
}
