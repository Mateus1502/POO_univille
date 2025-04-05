import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lampada lampada = new Lampada();
        System.out.println("Controles para a lampada");
        System.out.println("1-Ligada");
        System.out.println("2-Desligada");
        System.out.println("3-Status");
        int instrucao;
        do{
            System.out.println("Quer ligar a lampada?");
            instrucao = scanner.nextInt();
            switch (instrucao){
                case 1:
                    lampada.ligar();
                    break;

                case 2:
                lampada.desligar();
                break;

                case 3:
                lampada.mostrarEstado();
                break;
                case 0:
                    System.out.println("Bye bye...");
        }

    }while(instrucao!=0);
        scanner.close();
}
}