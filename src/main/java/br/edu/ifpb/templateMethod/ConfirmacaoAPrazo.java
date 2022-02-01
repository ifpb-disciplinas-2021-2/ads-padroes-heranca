package br.edu.ifpb.templateMethod;

import br.edu.ifpb.factory.CartaoDeCredito;
import br.edu.ifpb.Compra;
import br.edu.ifpb.Confirmacao;
import br.edu.ifpb.Desconto;
import br.edu.ifpb.Pagamento;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/12/2021, 11:05:28
 */
public class ConfirmacaoAPrazo extends Confirmacao{

    public ConfirmacaoAPrazo(Compra compra,Desconto desconto) {
        super(compra,desconto);
    }

    @Override
    protected Pagamento pagamento() {
        return new CartaoDeCredito();
    }

    @Override
    protected void confirmar(String codigoPagamento,Compra compra) {
        System.out.println("A compra para o código: "+codigoPagamento+" foi confimada");
    }


}
