public class Carro extends Produto{
    String marca;
    String modelo;
    double potencia;

    public Carro(String descricao, String armazem, int ano,String marca,String modelo,double potencia) {
        super(descricao, armazem, ano);
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Sua descrição é: "+ descricao+" o armazem que está guardado é o: "+ armazem+"versão do ano: "+ ano);
        System.out.println("De modelo: "+modelo+" da marca: "+marca+"com potência :"+potencia);
    }
}
