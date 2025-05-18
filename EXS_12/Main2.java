import java.sql.SQLOutput;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /*Produto p1 = new Produto("Camisa", 40.00);
        Produto p2 = new Produto("Calça jeans", 110.90);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.AdicionarItem(p1,40);
        carrinho.AdicionarItem(p2,2);
        System.out.println("Total do carrinho é R$ "+carrinho.soma());*/
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        String comprar;
        do{
            System.out.println("Informe o item a ser comprado: ");
            String nome =scanner.nextLine();
            System.out.println("---------------------------------------");
            System.out.println("Digite o valor do produto: ");
            double valor = scanner.nextDouble();
            System.out.println("---------------------------------------");
            System.out.println("Informe a quantiadade: ");
            int quantidade = scanner.nextInt();
            System.out.println("----------------------------------------");
            Produto produto = new Produto(nome,valor);
            carrinho.AdicionarItem(produto,quantidade);
            System.out.println("----------------------------------------");
            carrinho.soma();
            System.out.println("Quer comprar? ");
            comprar = scanner.nextLine();
        }while(comprar.equals("sim"));
        System.out.println("O total do seu carrinho é :"+carrinho.soma());
        }

    }
