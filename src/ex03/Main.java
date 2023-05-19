package ex03;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Liz", 19, 160.5);

        pessoa.envelhecer();
        pessoa.envelhecer();
        pessoa.setPeso(50);
        pessoa.engordar();
        pessoa.emagrecer();

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura());
    }
}
