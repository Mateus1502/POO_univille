import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Dado dado = new Dado();
        System.out.println("Lets play a game, shall we?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here are the rules young blood");
        System.out.println("1-You´re in");
        System.out.println("0-You´re out");
        int decisao;
        do{
            decisao = scanner.nextInt();
            switch (decisao){
                case 1:
                    dado.rolarDado();
                    break;
                case 0:
                    System.out.println("Humans used to be bravier");
                    break;
                }
            }while(decisao!=0);
        }
    }
