import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe descrição, armazem e ano:");
        String descricao = scanner.nextLine();
        String armazem = scanner.nextLine();
        int ano = scanner.nextInt();
        String marca = scanner.nextLine();
        String modelo = scanner.nextLine();
        double potencia = scanner.nextDouble();
        Carro carro = new Carro(descricao,armazem,ano,marca,modelo,potencia);
        carro.exibirInfo();

    }
}
