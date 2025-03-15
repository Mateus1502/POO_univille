public class EX2 {
    public static final String VERMELHO = "\u001B[31m"; // Código ANSI para vermelho
    public static final String RESET = "\u001B[0m"; // Reseta a cor
    public static void vermelho(String x){
        String textoVermelho=x;
        System.out.println(VERMELHO+x+RESET);
    }

    public static void main(String[] args) {
        String x = "Esse texto está em vermelho";
        vermelho(x);
    }
}
