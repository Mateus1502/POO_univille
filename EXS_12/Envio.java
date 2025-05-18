import java.util.Scanner;

public class Envio {
    Scanner scanner = new Scanner(System.in);
    String destinatario;
    String assunto;
    String texto;
    public void enviomensagem() {
        System.out.println("Informe o destinatário: ");
        destinatario = scanner.nextLine();
        System.out.println("Destinatário: "+destinatario);
        System.out.println("-----------------------------------------");
        System.out.println("Informe o assunto: ");
        assunto = scanner.nextLine();
        System.out.println("Assunto: " + assunto);
        System.out.println("----------------------------------------");
        System.out.println("Informe o texto: ");
        texto = scanner.nextLine();
        System.out.println(texto);
        Mensagem mensagem = new Mensagem(destinatario,assunto,texto);
    }
}
