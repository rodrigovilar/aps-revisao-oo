public abstract class Imposto implements ImpostoIF {
    
    private String descricao;

    public Imposto(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }

}
