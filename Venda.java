
public class Venda {
    
    private int id;
    private String data;
    private LinhaVenda[] linhas = new LinhaVenda[10];
    private int ultimaPosicaoLinhas = 0;
    
    public void addLinha(LinhaVenda linha) {
        linhas[ultimaPosicaoLinhas++] = linha;
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
        return 0.0;
    }
    
}
