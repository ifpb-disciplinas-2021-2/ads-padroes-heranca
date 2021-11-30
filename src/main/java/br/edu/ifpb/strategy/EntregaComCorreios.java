package br.edu.ifpb.strategy;

import br.edu.ifpb.Compra;
import br.edu.ifpb.Entrega;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 30/11/2021, 10:48:41
 */
public class EntregaComCorreios implements Entrega {

    @Override
    public double calcularTaxas(Compra compra) {
        return compra.itens() * 0.2; // 20%
    }
}
