import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        System.out.println("Informe o raio do circulo: ");
        Scanner scanner = new Scanner(System.in);
        Circulo circulo = new Circulo();
        circulo.raio= scanner.nextDouble();
        circulo.calcularArea();

    }
}
