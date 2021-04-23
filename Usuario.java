public class Usuario {
    private String nomeUsuario;
    private String endereco;
    private long cpf;
    public Usuario(String nome, long cpf, String endereco) {
        this.nomeUsuario=nome;
        this.endereco=endereco;
        this.cpf=cpf;
    }
    public String getNomeUsuario(){
        return this.nomeUsuario;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public long getCpf(){
        return this.cpf;
    }
}
