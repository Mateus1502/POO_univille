public class Mensagem {
    private String destinatario;
    private String assunto;
    private String texto;

    public Mensagem(String destinatario,String assunto, String texto) {
        this.destinatario = destinatario;
        this.assunto=assunto;
        this.texto = texto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getTexto() {
        return texto;
    }
}
