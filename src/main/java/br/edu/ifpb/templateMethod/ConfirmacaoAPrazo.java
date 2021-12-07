package br.edu.ifpb.templateMethod;

import br.edu.ifpb.Compra;
import br.edu.ifpb.Confirmacao;
import br.edu.ifpb.Desconto;

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
    protected void pagar(double valorTotal) {
        System.out.println("Confirmação a prazo. Aguardando o pagamento "+valorTotal);
    }

}
