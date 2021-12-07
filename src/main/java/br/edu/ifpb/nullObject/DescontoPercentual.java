package br.edu.ifpb.nullObject;

import br.edu.ifpb.Desconto;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/12/2021, 10:24:10
 */
public class DescontoPercentual implements Desconto{

    private final double valor;

    public DescontoPercentual(double valor) { // 20%
        this.valor = valor;
    }
    
    @Override
    public double aplicarEm(double desconto) { // 10 - d
        return (100 - valor) * desconto/100;
        
    }

}
