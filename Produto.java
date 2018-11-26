public class Produto {
    private int codigoBarras;
    private String nome;
    private double precoReferencia;
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
