public class Rect extends Shape{
    double altura;
    double largura;

    public Rect(double altura,double largura){
        //Necessário chamar o construtor da classe pai
        super("Rect");
        this.altura=altura;
        this.largura=largura;
    }


    @Override
    public double area() {
        return altura * largura;
    }
}
