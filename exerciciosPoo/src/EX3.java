public class EX3 {
    public static void main(String[] args) {
        System.out.println("Informe um número inteiro: ");
        var scanner = new java.util.Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Informe um número inteiro: ");
        var scanner2 = new java.util.Scanner(System.in);
        int num2= Integer.parseInt(scanner.nextLine());
        int divisao = num1 / num2;
        System.out.println("O resultado é "+divisao);

    }
}
// Ao dividir por 0 recebemos: Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at EX3.main(EX3.java:9)