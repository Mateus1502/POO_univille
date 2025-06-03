public class Livro extends Produto{
    String nome;
    String autor;
    String editora;

    public Livro(String descricao, String armazem, int ano, String nome,String autor,String editora) {
        super(descricao, armazem, ano);
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
    }
    @Override
    public void exibirInfo(){
        System.out.println("Sua descrição é: "+ descricao+" o armazem que está guardado é o: "+ armazem+"versão do ano: "+ ano);
        System.out.println("O nome do livro é: "+nome+" do autor/a: "+autor+"da editora :"+editora);
    }
}
