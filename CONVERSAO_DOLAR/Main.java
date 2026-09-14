
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String valorDolarStr = JOptionPane.showInputDialog("Quantos dolares você quer comprar?: ");
        double valorDolar = Double.parseDouble(valorDolarStr);
        
        double dolar = Conversor.DOLAR;
        double valorReal = Conversor.valorReal(valorDolar);

        String mensagem = String.format("Cotação do dolar: R$%.2f\nDolares comprados: R$%.2f\nValor a pagar em reais: R$%.2f",dolar, valorDolar, valorReal);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
