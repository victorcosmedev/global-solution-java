package pacote;

import dominio.BaseDeEspecies;
import dominio.BaseDePescadores;
import dominio.Especie;
import dominio.Pescador;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Criando uma base de dados de peixes fictícia que será adicionada à baseDeEspecies
        Especie pacu = new Especie("Pacu", "Rio Amazonas", "Janeiro a Fevereiro");
        Especie pirarucu = new Especie("Pirarucu", "Rio Negro", "Março a Abril");
        Especie tambaqui = new Especie("Tambaqui", "Rio Solimões", "Maio a Junho");

        ArrayList<Especie> listaDeEspecies = new ArrayList<>();
        listaDeEspecies.add(pacu);
        listaDeEspecies.add(pirarucu);
        listaDeEspecies.add(tambaqui);

        BaseDeEspecies baseDeEspecies = new BaseDeEspecies(listaDeEspecies);

        Pescador joao = new Pescador("João", "joão_user", "12345", "554466", false);
        Pescador maria = new Pescador("Maria", "maria_user", "67890", "557788", true);
        Pescador carlos = new Pescador("Carlos", "carlos_user", "11223", "559900", false);

        // Criando o ArrayList de pescadores
        ArrayList<Pescador> listaDePescadores = new ArrayList<>();

        // Adicionando os pescadores ao ArrayList
        listaDePescadores.add(joao);
        listaDePescadores.add(maria);
        listaDePescadores.add(carlos);

        BaseDePescadores baseDePescadores = new BaseDePescadores(listaDePescadores);
        System.out.println(baseDePescadores.exibirPescadores());
    }
}
