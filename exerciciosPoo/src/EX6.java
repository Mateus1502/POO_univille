public class EX6 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        System.out.println (x++) ;
        System.out.println (++y ) ;
        System.out.println ("x="+ x ) ;
        System.out.println ("y="+ y ) ;
    }
}
//x++ não altera, pois é um pós-incremento
//++y aumenta em um--pré-incremento
//11--impresso pós o incremento
//11--imprimos o valor de y que já sofreu o incremento lá no inicio