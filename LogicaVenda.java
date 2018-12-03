import java.util.*;

public class LogicaVenda {
    
    private ArrayList<ImpostoIF> impostos = new ArrayList<>();
    
    public void addImposto(ImpostoIF imposto){
        this.impostos.add(imposto);
    }
    
    public double getValorTotal(Venda venda) {
        double resultado = 0.0;
        
        for (LinhaVenda linha : venda.getLinhas()) {
            resultado += getSubTotal(linha);
        }
        
        return resultado;
    }
    
    public void finalizar(Venda venda) {
        double contador = Venda.getContador();
        contador += getValorTotal(venda);
        Venda.setContador(contador);
        
    }
    
    public double getSubTotal(LinhaVenda linhaVenda) {
        double valorOriginal = getValorOriginal(linhaVenda); 
        
        
        return valorOriginal + calcularImpostos(linhaVenda);
    }
    
    
        public double calcularImpostos(LinhaVenda linhaVenda){
            
            double totalImpostos = 0.0;
        
            for (ImpostoIF imposto : this.impostos) {
            totalImpostos += imposto.calcular(getValorOriginal(linhaVenda), 
                                linhaVenda.getProduto());
                                
        }
        return totalImpostos;
    }
    public double getValorOriginal(LinhaVenda linhaVenda) {
        return linhaVenda.getQuantidade() * linhaVenda.getProduto().getPrecoReferencia();
    }

    
    
    

}
