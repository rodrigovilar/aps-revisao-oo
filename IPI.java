public class IPI extends Imposto {
    
    public IPI() {
        super("Imposto sobre Produção Industrial");
    }
    
    public double calcular(double valor, Produto produto) {
        return valor * produto.getTaxaIPI();
    }
}
