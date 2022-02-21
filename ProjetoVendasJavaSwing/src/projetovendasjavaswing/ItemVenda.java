package projetovendasjavaswing;

public class ItemVenda {
    private float quantidade;
    private float preco;
    
    private Produto produto;
    
    public ItemVenda(){
        this.produto = new Produto();
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
