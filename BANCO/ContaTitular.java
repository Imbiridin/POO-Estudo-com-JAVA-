package BANCO;

import java.util.Scanner;

public class ContaTitular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria banco = new ContaBancaria();

        System.out.println("Digite o seu nome: ");
        banco.titular = sc.nextLine();
        System.out.println("Digite o número da sua conta: ");
        banco.numeroConta = sc.nextInt();
        System.out.println("Digite o saldo inicial: ");
        banco.saldo = sc.nextDouble();

        System.out.println("=".repeat(30));
        System.out.println("SUA CONTA");
        System.out.println("=".repeat(30));
        System.out.println(banco);

        boolean continuar = true;
        while (continuar) {
            System.out.println("-".repeat(30));
            System.out.println("Digite [1] para SACAR | [2] para DEPOSITAR | [3] para SAIR ");
            System.out.println("-".repeat(30));
            int opcao = sc.nextInt();

            

            switch (opcao) {
                case 1:
                    System.out.println("Digite o quanto gostaria de sacar: ");
                    double valorSaque = sc.nextDouble();
                    banco.sacar(valorSaque);
                    break;
                case 2:
                    System.out.println("Digite o quanto gostaria de depositar: ");
                   double valorDeposito = sc.nextDouble();
                   banco.depositar(valorDeposito);
                   break;
                case 3: 
                    System.out.println("Obrigado pela preferência");
                    System.out.println(banco);
                    continuar = false;
                    break;
                default:
                    System.out.println("Operação inválida!");
            }

            
        }
sc.close();
        

    }

}
