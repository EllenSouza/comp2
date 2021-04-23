public class Produto {

    private int quantidadeEmEstoque = -1;

    private String descricao;
    private String urlDaImagem;
    private int pesoEmGramas;
    private float precoEmReais;
    private Dimensoes dimensoesProduto = new Dimensoes();

    /*CONSTRUTOR*/
    public Produto(String descricao, String urlDaImagem) {
        this.descricao=descricao;
        this.urlDaImagem=urlDaImagem;

    }
    public void setQuantidadeEmEstoque(int quant){
        this.quantidadeEmEstoque+=quant;
    }
    public int getQuantidadeEmEstoque(){
        return this.quantidadeEmEstoque;
    }

    /**
     * @return uma descrição textual do produto
     */
    public String getDescricao() {
        return this.descricao;
    }
    public void setPesoEmGramas(int pesoEmGramas){
        this.pesoEmGramas=pesoEmGramas;
    }
    public int getPesoEmGramas() {
        return this.pesoEmGramas;
    }

    public Dimensoes getDimensoes() {
        return dimensoesProduto;
    }

    public float getPrecoEmReais() {
        return this.precoEmReais;
    }

    public void setPrecoEmReais(float preco) {
        this.precoEmReais=preco;
    }

    public String getUrlDaImagem() {
        return this.urlDaImagem;
    }
}