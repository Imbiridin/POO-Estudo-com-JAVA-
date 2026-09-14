package RETANGULO;
import java.util.Scanner;

public class Retangulo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Perimetro perimetro = new Perimetro();
        System.out.println("Digite o valor da altura: ");
        perimetro.altura = sc.nextDouble();

        System.out.println("Digite o valor da largura: ");
        perimetro.largura = sc.nextDouble();


        System.out.println("AREA: " + perimetro.area());
        System.out.println("PERIMETRO: " + perimetro.perimetro());
        System.out.println("DIAGONAL: " + perimetro.diagonal());
    }
}
