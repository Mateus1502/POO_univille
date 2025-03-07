public class OperadorTernario {
    public static void main(String[] args) {
        int x = 0;
        String texto ="";
        if(x % 2 == 0){
            texto="par";
        }
        else{
            texto="ímpar";
        }
        System.out.println(x +"é"+texto);
        System.out.println(x % 2 ==0 ? "par": "ímpar");
    }
}
