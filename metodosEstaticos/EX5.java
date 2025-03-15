public class EX5 {
    public static void raioCirculo(int raio){
        double resultado = Math.PI*(Math.pow(raio,2));
        System.out.println("A área do círculo é de :"+resultado);
    }
    public static void main(String[] args) {
        int raio = 4;
        raioCirculo(raio);
    }
}
