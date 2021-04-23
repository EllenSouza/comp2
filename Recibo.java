public class Recibo {
    Usuario usuarioComprador;
    float valorTotalDaCompra;
    int quant;
    Produto produtoVendido;

    public float getValorTotalDaCompra() {
        return valorTotalDaCompra;
    }
    public Recibo (){

    }

    public Usuario getUsuario() {
        return this.usuarioComprador;
    }

    @Override
    public String toString(){
        int valorTotal = (int) valorTotalDaCompra;
        String tipo;
        if(produtoVendido instanceof Livro){
            tipo="Livro: "+((Livro) produtoVendido).getNome();
        }
        else if(produtoVendido instanceof Brinquedo){
            tipo="Brinquedo";
        }
        else{
            tipo="Produto";
        }
        return "Recibo no valor de R$"+valorTotal+",00"+" para "+usuarioComprador.getNomeUsuario()+
                " referente à compra de "+quant+" unidades de "+tipo;
    }

}