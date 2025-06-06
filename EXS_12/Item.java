public class Item {
        private Produto produto;
        private int quantidade;

        public Item(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }

        public double getSubtotal() {
            return produto.getValor() * quantidade;
        }

        public Produto getProduto() {
            return produto;
        }

        public int getQuantidade() {
            return quantidade;
        }
    }

