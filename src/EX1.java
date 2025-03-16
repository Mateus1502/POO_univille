import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        int tamanho =10;
        int[] vetor =new int [tamanho];
        Random random = new Random();
        //Usa-se vetor.legth inves de uma variavel como tamanho por exemplo
        //Pois oferece uma maior eficiencia
        for(int i=0;i<vetor.length;i++){
            vetor[i] = random.nextInt(100);
        }
        for(int i=0;i< vetor.length;i++){
            System.out.println("Vetor: "+i+" Valor:"+vetor[i]);//Mostra os elementos e a posição
        }
        System.out.println(Arrays.toString(vetor));//Organiza o vetor dentro de[]
        System.out.println("Qual número quer pesquisar?");
        Scanner scanner = new Scanner(System.in);
        int numeroPesquisado = scanner.nextInt();
        boolean achei=false;
        for(int i=0;i< vetor.length;i++){
            if(numeroPesquisado==vetor[i]){
                System.out.println("O número está presente no vetor!!!!");
                break;
            }else{
                System.out.println("Não foi dessa vez");
                break;
            }
        }
    }
}
