package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 30/11/2021, 10:35:29
 */
public class TaxaDeEntrega {
    
 public double calcularTaxas(int quantidadeItens, String tipoDeEntrega){
        //sedex
        //pac
        if("sedex".equals(tipoDeEntrega)){
            return quantidadeItens * 0.4; // 40%
        }
        if("pac".equals(tipoDeEntrega)){
            return quantidadeItens * 0.3; // 30%
        }
        return 0.0;
    }
}
