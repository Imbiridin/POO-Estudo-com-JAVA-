package NOTA;
import java.util.Scanner;
public class Estudante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Notas nota = new Notas();
        System.out.println("Digite o nome do Aluno: ");
        nota.nome = sc.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        nota.nota_1 = sc.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        nota.nota_2 = sc.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        nota.nota_3 = sc.nextDouble();

        System.out.println("Media do aluno: " + nota.media());

        if(nota.media() < 60){
            System.out.println("REPROVADO");
            System.out.printf("FALTOU %.2f%n", nota.conselho(), "pontos");
        } else {
            System.out.println("APROVADO");
        }


        sc.close();
    }
}
