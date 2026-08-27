package SALARIO;

public class Salario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
         salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    public String toString() {
        return "Nome: "
                + nome
                + " | Salário Liquido: R$"
                + String.format("%.2f", salarioLiquido());

    }
}
