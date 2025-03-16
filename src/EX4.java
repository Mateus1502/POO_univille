import java.util.Locale;
import java.util.Scanner;

public class EX4 {
    public static boolean ehpalindromo(char[] vetor) {
        int inicio = 0;
        int fim = vetor.length - 1;
        while (inicio < fim) {
            if (vetor[inicio] != vetor[fim]) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
    public static void main(String[] args) {
        //String palavra ="Arara";
        System.out.println("Informe uma palavra para analisarmos ");
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        palavra=palavra.toLowerCase();
        char[] vetor=palavra.toCharArray();
        if(ehpalindromo(vetor)){
            System.out.println("A palavra "+palavra+" é um palindromo!!!");
        }else{
            System.out.println(palavra+" não é um palindromo");
        }
    }
}
