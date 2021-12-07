package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/12/2021, 10:24:10
 */
public class DescontoAbsoluto implements Desconto{

    private final double valor;

    public DescontoAbsoluto(double valor) {
        this.valor = valor;
    }
    
    @Override
    public double aplicarEm(double desconto) { // 10 - desconto
        return desconto - this.valor;
    }

}
