public class EX3 {
    public static int potencia(int x, int y){
        int resultado =1;
        for(int i =0;i<y;i++){
            resultado*=x;
            System.out.println(resultado);
        }
        return resultado;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int resultado =potencia(x,y);

    }
}
