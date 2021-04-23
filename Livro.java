public class Livro extends Produto {
    private String nomeLivro;
    private String editora;
    private int numeroDePaginas;
    private String trechoEmDestaque;
    private String autor;
    private int anoDePublicacao;
    public Livro(String nome, String editora) {
        super("","");
        this.nomeLivro=nome;
        this.editora=editora;
    }
    void setNumeroDePaginas(int numeroDePaginas){
        this.anoDePublicacao=numeroDePaginas;
    }
    private int numeroDePaginas() {
        return this.numeroDePaginas;
    }
    void setTrechoEmDestaque(String trechoEmDestaque){
        this.trechoEmDestaque=trechoEmDestaque;
    }
    public String getTrechoEmDestaque() {
        return this.trechoEmDestaque;
    }
    void setAutor( String autor){
        this.autor=autor;
    }
    public String getAutor() {
        return this.autor;
    }
    void setAnoDePublicacao(int anoDePublicacao){
        this.anoDePublicacao=anoDePublicacao;
    }
    public int getAnoDePublicacao() {
        return this.anoDePublicacao;
    }
    public String getNome(){
        return nomeLivro;
    }

}