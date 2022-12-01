package one.digitalinnovation.gof.Facede;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepAPI;

public class Facede {
    public void migrarCliente(String nome, String cep){

        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
