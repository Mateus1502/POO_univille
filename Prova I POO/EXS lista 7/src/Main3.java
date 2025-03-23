public class Main3 {
    public static int soma(){
        int soma=0;
        for(int i =0;i<11;i++){
            soma+=i;
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println("A soma é:"+soma());
    }
}
