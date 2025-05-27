//Para não permitir herança, palavra chave final
public class Animal {
    //String nome;
    //private String nome;erro
    //Ou usamos public ou protected
    protected String nome;
    public Animal(String nome){
        this.nome=nome;
    }
    public void emitirsom(){
        System.out.println("Som do animal");
    }
}
