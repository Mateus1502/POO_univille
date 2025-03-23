import java.util.Scanner;

public class Main {
    public static int soma(int a, int b){
        return a+b;

    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe dois número:");
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int resultado = soma(a,b);
        System.out.println("A soma resulta em : "+resultado);
    }
}
