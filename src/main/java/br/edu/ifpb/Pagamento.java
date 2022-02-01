package br.edu.ifpb;

import br.edu.ifpb.factory.Boleto;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/02/2022, 10:27:26
 */
public interface Pagamento {

    // Static-Factory Method
    public static Pagamento boleto(){
        return new Boleto();
    }

    public String pagar(double valor);
}
