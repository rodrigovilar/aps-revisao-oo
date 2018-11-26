import java.util.ArrayList;

public class Venda {
    
    private static double contador = 0.0;
    
    private int id;
    private String data;
    private ArrayList<LinhaVenda> linhas = new ArrayList<>();
    
    public void addLinha(LinhaVenda linha) {
        linhas.add(linha);
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getData() {
        return data;
    }
    
    public double getValorTotal() {
        double resultado = 0.0;
        
        for (LinhaVenda linha : this.linhas) {
            resultado += linha.getSubTotal();
        }
        
        return resultado;
    }
    
    public void finalizar() {
        contador += getValorTotal();
    }
    
    public static double getFaturamentoGeral() {
        return contador;
    }
}
