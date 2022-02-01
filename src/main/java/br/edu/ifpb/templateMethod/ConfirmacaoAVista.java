package br.edu.ifpb.templateMethod;

import br.edu.ifpb.factory.Boleto;
import br.edu.ifpb.Compra;
import br.edu.ifpb.Confirmacao;
import br.edu.ifpb.Desconto;
import br.edu.ifpb.Pagamento;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/12/2021, 11:03:28
 */
public class ConfirmacaoAVista extends Confirmacao{

    public ConfirmacaoAVista(Compra compra,Desconto desconto) {
        super(compra,desconto);
    }
    
        @Override
    protected Pagamento pagamento() { //não estático
        return new Boleto();
    }

    @Override
    protected void confirmar(String codigoPagamento,Compra compra) {
        System.out.println("Confirmando a compra realizada à vista!!");
        System.out.println("A compra para o código: "+codigoPagamento+" foi confimada");
    }

    

}
