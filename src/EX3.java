import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int x;

        do {
            System.out.println("Informe um número:");
            x = scanner.nextInt();
        } while (x != -1);

        System.out.println("Programa encerrado.");
    }
}
//Inicie a variavel no do;
