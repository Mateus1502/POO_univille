import java.util.List;

public class Main {
    public static void main(String[] args) {
        //polimorfismo
        //Rect -> Shape
        Rect r = new Rect(10,10);
        Shape u = new Rect(50,60);
        u.area();
        //Classe anonima
        //Só usada uma vez e dentro da propria criação
        //Serve para criar objetos pontuais descartaveis
        //Programação funcional
        Shape s1 = new Shape("Anonimo") {
            @Override
            public double area(){
                return 0;
            }
        };
        var lista= List.of(1,2,4,5,8);
        //for(int i =-0) o de sempre
        for(var i:lista){
            System.out.println(i);
        }
        lista.forEach(System.out::println);
    }
}
