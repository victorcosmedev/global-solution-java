package dominio;

import java.util.ArrayList;

public class BaseDeEspecies implements RepositorioEspecies{
    private ArrayList<Especie> listaDeEspecies;

    public BaseDeEspecies(ArrayList<Especie> listaDeEspecies){
        this.listaDeEspecies = listaDeEspecies;
    }

    public String exibirEspecies(){
        // A abordagem é declarar uma string vazia (especies em String) e adicionar
        // cada uma das strings retornadas pelo método exibirEspecie() da classe Especie
        String especiesEmString = "";

        for(Especie especie: listaDeEspecies){
            // Recuperando os dados da espécie e salvando em 'especieEmString'
            String especieEmString = "";
            especieEmString = especie.exibirEspecie();
            especiesEmString += especieEmString;
            especiesEmString += "\n========================================\n";
        }
        especiesEmString += "\n";
        return especiesEmString;
    }
}
