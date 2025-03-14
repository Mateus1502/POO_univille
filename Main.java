public class Main {
    public static void main(String[] args) {
        //int vetor[]=null;//tem qual tamanho?
        //int v[]={1,2,3,4};//tamanho 4
        int vetor[] = new int[10];//vetores são objetos
        //posição que quero acessar
        vetor[0] = 99;
        System.out.println(vetor.length);
        System.out.println(vetor.length - 1);//acessar ultima posição
        System.out.println(vetor[0]);
        System.out.println(vetor[10]);//posição inválida lança uma exceção
        //for clássico
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" vetor [ " + i + "] = " + vetor[i]);
        }

        //for-loop percorre o vetor da primeira a ultima posição
        for (int elemento : vetor) {
            System.out.println(elemento);

        }
    }}

