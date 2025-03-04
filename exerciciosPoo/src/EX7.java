public class EX7 {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        System.out.println ("x em binario = "+ Integer .
                toBinaryString ( x ) ) ;
         x = x << y ;
         System.out.println ("x = " + x ) ;
         System.out.println ("x em binario = "+ Integer .
                toBinaryString ( x ) ) ;
    }
}
// Ao alterar o operado vamos de 40 para 2
//<< + multiplicamos os bits por uma potência 2 ou seja 10 * 4
//>> dividimos por uma potência 2 ou seja 10 / 4
