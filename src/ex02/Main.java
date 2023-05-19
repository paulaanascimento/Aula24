package ex02;

public class Main {
    public static void main(String[] args) {

        Bola bolaTenis = new Bola(40, "verde", "Wilson", "borracha", 150);
        Bola bolaFutebol = new Bola(70, "branca", "Nike", "couro sintético", 120);
        Bola bolaBaquete = new Bola(75, "laranja", "Spalding", "borracha", 50);

        System.out.println("-----Bola de Futebol-----");
        bolaFutebol.mostraCor();
        bolaFutebol.trocaCor("branco com preto");
        bolaFutebol.mostraCor();

        System.out.println("\n-----Bola de Tenis-----");
        System.out.println("Circunferencia: " + bolaTenis.getCircunferencia());
        System.out.println("Cor: " + bolaTenis.getCor());
        System.out.println("Material: " + bolaTenis.getMaterial());

        System.out.println("\n-----Bola de Basquete-----");
        System.out.println("Marca: " + bolaBaquete.getMarca());
        System.out.println("Velocidade: " + bolaBaquete.getVelocidade() + "km/h");


    }
}
