package SALARIO;

import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Salario salario = new Salario();

        System.out.println("\nDigite o seu nome: ");
        salario.nome = sc.nextLine();

        System.out.println("\nInforme o seu salário bruto: ");
        salario.salarioBruto = sc.nextDouble();

        System.out.println("\nInforme o valor dos impostos: ");
        salario.imposto = sc.nextDouble();

        System.out.println(salario);

        System.out.println("\nInforme a porcentagem para aumentar o salário: ");
        double porcentagem = sc.nextDouble();
        salario.aumentarSalario(porcentagem);

        System.out.println("\nAtualização: "+salario);

        sc.close();
    }
    
}
