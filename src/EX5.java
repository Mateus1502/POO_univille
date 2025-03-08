import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        System.out.println("Informe a tabuada desejada: ");
        Scanner scanner = new Scanner(System.in);
        int tabuada =(scanner.nextInt());
        for(int x =1;x<=10;x++){
            System.out.println(tabuada+"X"+x+"="+tabuada*x);
        }
    }
}
