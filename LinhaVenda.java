public class LinhaVenda {
    private int sequencia;
    private double quantidade;
    private Produto produto;
    private IPI ipi = new IPI();
    private ICMS icms = new ICMS();
    
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
    
    private double getValorOriginal() {
        return getQuantidade() * getProduto().getPrecoReferencia();
    }
    
    public double getSubTotal() {
        return getValorOriginal() + getIcms() + getIpi();
    }
    
    public double getIpi() {
        return ipi.calcular(getValorOriginal(), getProduto());
    }
    
    public double getIcms() {
        return icms.calcular(getValorOriginal(), getProduto()); 
    }
}









