import java.util.*;
public class CarrinhoDeCompras {
    private int quantidade;
    private Produto item;
    private List <Item> itens;
    Scanner scanner = new Scanner(System.in);
    public CarrinhoDeCompras(){
       this.itens = new ArrayList<>();
    }
    public void AdicionarItem(Produto produto, int quantidade){
        itens.add(new Item(produto,quantidade));
    }
    public List<Item> getItens() {
        return itens;
    }
   public double soma(){
        double total = 0;
        for(Item item : itens){
        total+= item.getSubtotal();}
       return total;
   }
}
