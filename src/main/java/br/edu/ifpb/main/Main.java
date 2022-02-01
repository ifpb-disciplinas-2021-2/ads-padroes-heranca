package br.edu.ifpb.main;

import br.edu.ifpb.Compra;
import br.edu.ifpb.Confirmacao;
import br.edu.ifpb.Desconto;
import br.edu.ifpb.Entrega;
import br.edu.ifpb.Pagamento;
import br.edu.ifpb.strategy.EntregaComCorreios;
import br.edu.ifpb.templateMethod.ConfirmacaoAVista;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/12/2021, 11:07:38
 */
public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra();
        Entrega entrega = new EntregaComCorreios();
//        Pagamento pagamento = new Boleto();
        Confirmacao confirmacao = new ConfirmacaoAVista(compra,Desconto.SEMDESCONTO);
        confirmacao.concluir(entrega);
        
        // ConfirmacaoAPrazo -> CartaoDeCredito
        // ConfirmacaoAVista -> Boleto
        
        Pagamento pagamento = Pagamento.boleto();
    }
}
