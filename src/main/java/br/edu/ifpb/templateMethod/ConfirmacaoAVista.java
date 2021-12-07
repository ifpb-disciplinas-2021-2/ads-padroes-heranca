package br.edu.ifpb.templateMethod;

import br.edu.ifpb.Compra;
import br.edu.ifpb.Confirmacao;
import br.edu.ifpb.Desconto;

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
    protected void pagar(double valorTotal) { //definindo o comportamento 
        System.out.println("Pagamento com Confirmação à vista: "+valorTotal);
    }

    @Override
    protected void confirmar(Compra compra) {
        System.out.println("Confirmando a compra realizada à vista!!");
    }
    

}
