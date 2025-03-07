public class repeticao {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.println(x + "");
            x++;
        }
        System.out.println();
        do {
            System.out.println(x + "");
            x++;
        } while(x < 10);{
            System.out.println();
        }
        //inicialização,decisão,incremento
        for(int j=0;j<10;j++){
            System.out.println(j+"");
        }
        System.out.println();
        //for(;;){}loop infinito
    }
}
