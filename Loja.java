import java.util.ArrayList;
import java.util.List;

/**
 * Implementa uma loja virtual para produtos de qualquer tipo,
 * desde que tenham descrição, preço e dimensões.
 *
 * Essa classe será um singleton, isto é, permitiremos apenas
 * uma instância desde objeto no sistema.
 */
public class Loja {

    private static final Loja instanciaUnica = new Loja();

    static {
        System.out.println("Estou subindo a classe Loja...");
    }

    protected Loja() {
        // escrevo código normalmente para o construtor
    }

    public static Loja getInstanciaUnica() {
        return instanciaUnica;
    }

    public void limparEstado() {
        // recria os atributos, ou os limpa...
    }

    private List<Produto> produtosDaLoja= new ArrayList(); // ArrayList com os produtos da Loja
    /**
     * Inclui no estoque da loja a quantidade informado do produto.
     *
     * @param produto o produto a ser incluído
     * @param quantidadeAIncluir a quantidade que será acrescentada à quantidade existente.
     */
    public void incluirProduto(Produto produto, int quantidadeAIncluir) {
        if(!produtosDaLoja.contains(produto)){
           produto.setQuantidadeEmEstoque(1); //tornar o estoque 0, ou seja, agora a loja vende este produto
            produtosDaLoja.add(produto);  //adiciona o produto
        }
        int indice= produtosDaLoja.indexOf(produto); //procura o indice do produto no ArrayList
        produtosDaLoja.get(indice).setQuantidadeEmEstoque(quantidadeAIncluir);
        /*atualiza a quantidade em estoque se o produto já tiver sido incluído,
         ou inicializa o estoque com a quantidade recebida*/

    }
    List <Usuario> usuariosDaLoja = new ArrayList<>();  //arrayList de usuários da loja
    public void cadastrarUsuario(Usuario usuario) {
        if(!usuariosDaLoja.contains(usuario)){
            usuariosDaLoja.add(usuario);
        }
    }

    /**
     * Efetua a venda do produto desejado na quantidade especificada.
     *
     * @param produto o produto
     * @param quantidadeDesejada a quantidade
     *
     * @return um Recibo indicando a venda feita, se o produto existia (em quantidade suficiente)
     *         no estoque da loja; null, caso o usuário ou o produto sejam desconhecidos,
     *         ou não haja quantidade suficiente do produto desejado
     */
    public Recibo efetuarVenda(Produto produto, int quantidadeDesejada, Usuario usuario) {
        if(!usuariosDaLoja.contains(usuario)){
            return null;
        }
        if(!produtosDaLoja.contains(produto)){
            return null;
        }
        if(produtosDaLoja.get(produtosDaLoja.indexOf(produto)).getQuantidadeEmEstoque()<quantidadeDesejada){
            return null;
        }
        Recibo reciboCompra = new Recibo();
        reciboCompra.usuarioComprador=usuario;
        float valorTotal=(float)quantidadeDesejada*produtosDaLoja.get(produtosDaLoja.indexOf(produto)).getPrecoEmReais();

        reciboCompra.valorTotalDaCompra=valorTotal;
        /*diminuir a quantidade em estoque*/
        produtosDaLoja.get(produtosDaLoja.indexOf(produto)).setQuantidadeEmEstoque(quantidadeDesejada*-1);
        reciboCompra.quant=quantidadeDesejada;
        reciboCompra.produtoVendido=produto;

        return reciboCompra;

    }

    /**
     * @param produto o produto a ser consultado
     *
     * @return a quantidade em estoque;
     *         0 se não houver nenhuma unidade;
     *         -1 se o produto não é sequer vendido pela loja
     */
    public int informarQuantidadeEmEstoque(Produto produto) {
        if(produtosDaLoja.contains(produto)){
            return produtosDaLoja.get(produtosDaLoja.indexOf(produto)).getQuantidadeEmEstoque();
        }
        return -1;
    }
}
