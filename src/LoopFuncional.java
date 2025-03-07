import java.lang.reflect.Array;
import java.util.ArrayList;

public class LoopFuncional {
    public static void main(String[] args) {
        ArrayList<Integer>lista = new ArrayList<>();
        for(int i =0;i<11;i++){
            lista.add(i);
        }
        for(var i:lista){
            System.out.println(i+"");
        }
        lista.forEach(System.out::println);
    }
}
