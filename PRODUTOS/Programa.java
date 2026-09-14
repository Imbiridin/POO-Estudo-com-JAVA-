package PRODUTOS;
import java.util.Scanner;

public class Programa {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    
        Produtos produto = new Produtos();

        System.out.println("Entre com as informações do produto: ");
        System.out.println("Digite o nome do Produto: ");
        produto.nome = sc.nextLine();
        System.out.println("Digite o preço do produto: ");
        produto.preco = sc.nextDouble();
        System.out.println("Digite as unidades dos produtos: ");
        produto.unidades = sc.nextInt();


        System.out.println("\nInformações do produto: " + produto);
        
        System.out.println("Digite a quantidade de produtos adicicionais: ");
        int quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);
        System.out.println("\nInformações do produto: " + produto);

        System.out.println("Digite a quantidade de produtos que sairam: ");
        int remocao = sc.nextInt();
        produto.removerProdutos(remocao);
        System.out.println("\nInformações do produto: " + produto);

        sc.close();
    }
}
