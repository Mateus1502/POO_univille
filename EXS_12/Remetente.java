public class Remetente {
    public void envio(Mensagem mensagem){
        System.out.println("Destinatário: "+mensagem.getDestinatario());
        System.out.println("Assunto: "+mensagem.getAssunto());
        System.out.println(mensagem.getTexto());
    }
    }


