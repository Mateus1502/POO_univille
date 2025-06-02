public class Subtrair extends OperacaoMatematica {
    @Override
    public void calcular(double a, double b){
        total = a-b;
        System.out.println("Sua subtração resulta em: "+total);
    }
}

