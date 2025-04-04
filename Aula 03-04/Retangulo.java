public class Retangulo {
    //todos os atributos são inicializados automaticamente
    //0,false ou null
    double altura;
    double largura;
    public double area(){
        return altura*largura;
    }
    public double perimetro(){
        return altura *2 + largura*2;
    }
    public void imprimir(){
        System.out.println("-------------------");
        System.out.println("Altura: "+altura);
        System.out.println("Altura: "+largura);
        System.out.println("Area:"+area());
        System.out.println("Perimetro: "+perimetro());
    }
}
