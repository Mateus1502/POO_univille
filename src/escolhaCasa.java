public class escolhaCasa {
    public static void main(String[] args) {
        //switch - case
        int x =2;
        switch (x){
            case 5:
            case 4:
                System.out.println("ABABA");
            case 0:
                System.out.println("Zero");
                break;
            case 2:{
                System.out.println("Dois");
                break;

            }
            default:
                System.out.println("Dont know bitch");

        }
    }
}
