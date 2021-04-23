
public class Brinquedo extends Produto {
    private String marca;
    private int idadeMinimaRecomendada;
    public Brinquedo(String descricao) {
        super(descricao,"");
    }
    void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca() {
        return this.marca;
    }
    void setIdadeMinimaRecomendada(int idadeMinimaRecomendada){
        this.idadeMinimaRecomendada=idadeMinimaRecomendada;
    }
    public int getIdadeMinimaRecomendada() {
        return this.idadeMinimaRecomendada;
    }
}
