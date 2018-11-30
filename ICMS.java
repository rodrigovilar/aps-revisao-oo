public class ICMS extends Imposto {
    
    public static final double ALIQUOTA_ICMS_GERAL = 0.17;
    
    public ICMS() {
        super("Imposto sobre Circulação de Produtos e Serviços");
    }
    
    public double calcular(double valor, Produto produto) {
        return ( produto.isIsentoICMS() ) ? 
            0.0 :
            valor * ALIQUOTA_ICMS_GERAL; 
    }
    
}
