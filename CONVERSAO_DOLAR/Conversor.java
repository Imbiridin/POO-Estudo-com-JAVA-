
public class Conversor{

    public static final double DOLAR = 5.25;

    public static double valorReal(double valorReal){
        double valorDolar = valorReal * DOLAR;
        return valorDolar - (valorDolar * 0.06);
    }
    
}