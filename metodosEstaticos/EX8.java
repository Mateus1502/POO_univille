public class EX8 {
    public static void primo(int x) {
        int raiz = (int) Math.sqrt(x);
        if (x < 2) {
            System.out.println("Não é primo");
        }else{
            for(int i=2;i<raiz+1;i++){
                if(x%i==0){
                    System.out.println("Não é primo");
                    return;
                }else{
                    System.out.println("É primo");
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        int x=55;
        primo(x);
    }
}

