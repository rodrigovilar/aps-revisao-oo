public class LinhaVenda {
    private int sequencia;
    private double quantidade;
    private Produto produto;
    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }
    public int getSequencia() {
        return sequencia;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    public double getQuantidade() {
        return quantidade;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Produto getProduto() {
        return produto;
    }
    
    public double getSubTotal() {
        return getQuantidade() * getProduto().getPrecoReferencia();
    }
}
