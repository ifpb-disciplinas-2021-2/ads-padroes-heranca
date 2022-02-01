package br.edu.ifpb.factory;

import br.edu.ifpb.Pagamento;
import java.util.UUID;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/02/2022, 10:28:14
 */
public class Boleto implements Pagamento{

    /**
    @return código do pagemento
    */
    public String pagar(double valor) { 
        return "Boleto " + UUID.randomUUID().toString();
    }

}
