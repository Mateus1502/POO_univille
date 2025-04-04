import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //objeto do tipo retangulo
        //operador new -> reserva na memória espaço para o objeto
        //Devolve o endereço de memória(referencia)
        //Retangulo()-> metodo especial/construtor
        Retangulo r = new Retangulo();
        r.altura=3.5;
        r.largura=3.5;
        r.imprimir();

        r.altura=65.2;
        r.largura=3.5;
        r.imprimir();

        r.imprimir();
        r.altura=7.9;
        r.largura=88;




    }
}
