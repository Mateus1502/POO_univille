import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sout
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x =leitor.nextInt();
        if(x > 0){
            System.out.println("Positivo");
        }
        else if (x<0){
            System.out.println("Negativo");
        }
        else{
            System.out.println("Zero");
        }
       // if(x==2) System.out.println("Igual a 2");
       // System.out.println("Pós if"); não faça sem as chaves
    }
}
