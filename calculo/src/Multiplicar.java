public class Multiplicar extends OperacaoMatematica{
    @Override
    public void calcular(double a, double b){
        total = a*b;
        System.out.println("Sua multiplicação resulta em: "+total);
    }
}