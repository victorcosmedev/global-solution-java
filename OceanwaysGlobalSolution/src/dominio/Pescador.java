package dominio;

public class Pescador extends Usuario{
    private String registro;
    private boolean verificado;

    public Pescador(String nome, String login, String senha, String registro, boolean verificado){
        super(nome, login, senha);
        this.registro = registro;
        this.verificado = verificado;
    }

    public String exibirInformacoes() {
        return "Nome do Usuário: " + nome + "\nLogin: " + login + "\nSenha: " + senha + "\nRegistro: " + registro + "\nUsuário é verificado? " + verificado;
    }
}
