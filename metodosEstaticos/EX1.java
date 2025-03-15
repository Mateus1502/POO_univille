import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        System.out.println("Informe um número para calcular o dobro dele: ");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int x = 3;
        dobro(y);
    }
    public static void dobro(int x){
        int resultado = x*2;
        System.out.println("O dobro de " +x+" é: "+resultado);
    }
}
