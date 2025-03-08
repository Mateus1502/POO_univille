public class EX2 {
    public static void main(String[] args) {
        System.out.println("Informe um número:");
        var scanner = new java.util.Scanner(System.in);
        int x =(scanner.nextInt());
        int soma=0;
        for(int a =1;a<x;a++){
            soma+=a;
        }
        System.out.println(soma);
    }
}
