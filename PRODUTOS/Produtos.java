package PRODUTOS;
public class Produtos{

    public String nome;
    public double preco;
    public int unidades;

    public double valorTotalEmEstoque(){
        return preco * unidades;
    }

    public void adicionarProdutos(int unidades){
        this.unidades += unidades;
    }

    public void removerProdutos(int unidades){
        this.unidades -= unidades;
    }

    public String toString(){
        return nome
        + ", R$"
        +  String.format("%.2f" , preco)
        + ", "
        + unidades
        + " unidades, Total: R$"
        + String.format("%.2f" , valorTotalEmEstoque()); 
    }
}