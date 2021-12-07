package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/12/2021, 10:38:35
 */
public class SemDesconto implements Desconto{

    @Override
    public double aplicarEm(double desconto) {
        return desconto; // valor sem desconto
    }

}
