import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        System.out.println("Informe um texto:");
        var scanner = new java.util.Scanner(System.in);
        String texto = scanner.nextLine();
        System.out.println("Informe um texto:");
        var scanner2 = new java.util.Scanner(System.in);
        String texto2 = scanner2.nextLine();
        if(texto.equals(texto2)){
            System.out.println("Os textos são iguais");
        }
        else{
            System.out.println("Os textos são diferentes");
        }
    }
}
//Tentei usar == na condição do if mas deu errado fiz uma pesquisa e encontrei o método .equals
