import java.util.Scanner;

public class Main4 {
    public static int ehpar(int a){
        if(a%2==0){
            System.out.println("O número informado é par");
        }else{
            System.out.println("O número informado é ímpar");
        }return a;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        ehpar(a);
    }
}
