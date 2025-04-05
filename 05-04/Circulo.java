public class Circulo {
    double raio;
    double area;

    public double calcularArea() {
        area = Math.PI *(Math.pow(raio,2));
        System.out.println("A área do circulo é:"+area);
        return area;
    }
}
