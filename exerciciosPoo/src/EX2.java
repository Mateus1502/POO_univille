import java.util.Scanner;

public class EX2 {
    public static void main(String[] args){
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Informe um número:");
        int a = Integer.parseInt(scanner.nextLine());
        if(a % 2 == 0){
            System.out.println("É par");
        }
        else{
            System.out.println("É ímpar");
        }

    }
}
