import java.util.ArrayList;

public class Venda {
    
    private static double contador = 0.0;
    
    private int id;
    private String data;
    private ArrayList<LinhaVenda> linhas = new ArrayList<>();
    
    public static void setContador(double contador) {
        Venda.contador = contador;
    }
    
    public static double getContador() {
        return contador;
    }
        
    public void addLinha(LinhaVenda linha) {
        linhas.add(linha);
    }
    
    public ArrayList<LinhaVenda> getLinhas() {
        return linhas;
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
    
    public static double getFaturamentoGeral() {
        return contador;
    }
}
