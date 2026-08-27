package NOTA;

public class Notas {
    
    public String nome;
    public double nota_1;
    public double nota_2;
    public double nota_3;

    public double media(){
        return (nota_1 + nota_2 + nota_3);
    }

    public double conselho(){
        if(media() < 60.0){
            return 60.0 - media();
        }else{
            return 0.0;
        }
    }
}
