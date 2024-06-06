package dominio;

import java.util.ArrayList;

public class BaseDePescadores implements RepositorioPescadores{
    private ArrayList<Pescador> listaDePescadores;

    public BaseDePescadores(ArrayList<Pescador> listaDePescadores){
        this.listaDePescadores = listaDePescadores;
    }

    public String exibirPescadores(){
        String pescadoresEmString = "";

        for(Pescador pescador : listaDePescadores){
            String pescadorEmString = "";
            pescadorEmString = pescador.exibirInformacoes();
            pescadoresEmString += pescadorEmString;
            pescadoresEmString += "\n========================================\n";
        }
        return pescadoresEmString;
    }
}
