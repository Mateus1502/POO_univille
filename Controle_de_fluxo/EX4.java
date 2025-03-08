import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        System.out.println("Quantas atividades foram realizadas no bimestre? ");
        Scanner scanner=new Scanner(System.in);
        int atividades =(scanner.nextInt());
        int soma;
        double somaNotas = 0;
        for(int i =1;i<=atividades;i++){
            System.out.println("Informe a nota da atividade: ");
            somaNotas+=(scanner.nextDouble());
        }
        double media;
        media=somaNotas/atividades;
        System.out.println("A média é:"+media);
    }
}
