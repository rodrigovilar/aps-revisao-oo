public class Produto {
    private int codigoBarras;
    private String nome;
    private double precoReferencia;
    private boolean isentoICMS = false;
    private double taxaIPI = 0.0;
    public void setTaxaIPI(double taxaIPI) {
        this.taxaIPI = taxaIPI;
    }
    public double getTaxaIPI() {
        return taxaIPI;
    }
    public void setIsentoICMS(boolean isentoICMS) {
        this.isentoICMS = isentoICMS;
    }
    public boolean isIsentoICMS() {
        return isentoICMS;
    }
    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    public int getCodigoBarras() {
        return codigoBarras;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setPrecoReferencia(double precoReferencia) {
        this.precoReferencia = precoReferencia;
    }
    public double getPrecoReferencia() {
        return this.precoReferencia;
    }
}
