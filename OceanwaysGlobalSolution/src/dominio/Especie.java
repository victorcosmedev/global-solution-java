package dominio;

public class Especie {
    private String nome;
    private String habitat;
    private String periodoDefeso;

    public Especie(String nome, String habitat, String periodoDefeso){
        this.nome = nome;
        this.habitat = habitat;
        this.periodoDefeso = periodoDefeso;
    }

    // Método para exibir todos os dados da espécie
    public String exibirEspecie(){
        return "Nome: " + nome + "\nHabitat: " + habitat + "\nPeríodo Defeso da espécie: " + periodoDefeso;
    }
}
