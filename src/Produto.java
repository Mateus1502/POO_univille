public class Produto {
    protected String descricao;
    protected String armazem;
    protected int ano;

    public Produto(String descricao, String armazem, int ano){
        this.descricao = descricao;
        this.armazem = armazem;
        this.ano = ano;
    }
public void exibirInfo(){
    System.out.println("Sua descrição é: "+ descricao+" o armazem que está guardado é o: "+ armazem+"versão do ano: "+ ano);
}

}
