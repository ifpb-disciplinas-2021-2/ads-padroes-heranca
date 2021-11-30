package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 30/11/2021, 10:50:22
 */
public class EntregaComFEDEX implements Entrega {

@Override
    public double calcularTaxas(Compra compra) {
        return compra.itens()* 0.8; // 80%
    }
}
