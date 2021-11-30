package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 30/11/2021, 10:35:29
 */
public class TaxaDeEntrega { //utilitária
    public double calcularTaxas(int quantidadeItens, Entrega tipoDeEntrega) {
        return tipoDeEntrega.calcularTaxas(quantidadeItens);
    }
}
