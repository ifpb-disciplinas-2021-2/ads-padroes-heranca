package br.edu.ifpb.factory;

import br.edu.ifpb.Pagamento;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/02/2022, 10:39:16
 */
public class CartaoDeCredito implements Pagamento{

    @Override
    public String pagar(double valor) {
        return "Cartão de crédito: " + String.valueOf(
            System.nanoTime()
        );
    }

}
