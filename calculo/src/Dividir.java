public class Dividir extends OperacaoMatematica{
    @Override
    public void calcular(double a, double b){
        total = a/b;
        System.out.println("Sua divisão resulta em: "+total);
    }
}
