public class EX1 {
    public static void main(String[] args){
        int a = 0;
        while(a < 2147483647){
                a++;
        }
        int b = a+1;
        System.out.println(b);
    }
}
//Ocorrerá um caso de integer overflow fazendo com que o a volte para o menor valor possivel de um integer;
//Invés de escrever o número podemos usar Integer.MAX_VALUE