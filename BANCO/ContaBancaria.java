package BANCO;

public class ContaBancaria {
    public String titular;
    public double saldo;
    public int numeroConta;

    public double depositar(double valor) {
        return saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
        }

    }

    public String toString(){
        return "Titular: "
        +titular
        +" | "
        +"Conta: "
        +numeroConta
        + String.format(" | Saldo: R$ %.2f", saldo);
        
       }
}
