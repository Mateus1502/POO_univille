public class Somar extends OperacaoMatematica {
    @Override
    public void calcular(double a, double b){
        total = a+b;
        System.out.println("Sua soma resulta em: "+total);

    }
}
