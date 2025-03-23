import java.util.Scanner;

public class Main2 {
    public static void tabuada(int a){
        for(int i=0;i<11;i++){
            int resultado = a*i;
            System.out.println(a+"X"+i+"="+resultado);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        tabuada(a);
    }
}
