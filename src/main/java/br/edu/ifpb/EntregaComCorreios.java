package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 30/11/2021, 10:48:41
 */
public class EntregaComCorreios implements Entrega {

    public double calcularTaxas(int quantidadeItens) {
        return quantidadeItens * 0.2; // 20%
    }
}
