import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        int somaPrimeiraLinha=0;
        int somaTodos =0;
        int produtoPrimeiraLinha=1;
        int produtoDiagonal=1;
        int somaPrimeiraColuna=0;

        System.out.println("Informe um tamanho: ");
        Scanner scanner = new Scanner(System.in);
        int tamanho = scanner.nextInt();
        int[][] vetor = new int[tamanho][tamanho];
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length; j++) {
                vetor[i][j] = random.nextInt(50); //
                somaTodos+=vetor[i][j];
                if(i==j){
                    produtoDiagonal*=vetor[i][j];
                }
                if(j==0){
                    somaPrimeiraLinha+=vetor[i][j];
                }
                if(j==0){
                    somaPrimeiraColuna+=vetor[i][j];
                }
                if(j==0){
                    produtoPrimeiraLinha*=vetor[i][j];
                }
            }
        }

        System.out.println("Matriz gerada:");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length; j++) {
                System.out.print(vetor[i][j] + " "); // Imprime o valor de cada célula
            }
            System.out.println();

        }
        System.out.println("-----------------------------------------");
        System.out.println("A soma total é: "+somaTodos);
        System.out.println("A soma da primeira linha é:"+somaPrimeiraLinha);
        System.out.println("O produto da primeira linha é: "+produtoPrimeiraLinha);
        System.out.println("A soma da primeira coluna  é: "+somaPrimeiraColuna);
        System.out.println("O produto da diagonal é: "+produtoDiagonal);

    }
}