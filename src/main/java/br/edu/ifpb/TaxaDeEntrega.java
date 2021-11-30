package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 30/11/2021, 10:35:29
 */
public class TaxaDeEntrega {

    enum TipoEntrega {
        SEDEX,//0
        PAC, //1
        CORREIOS
    }

    public double calcularTaxas(int quantidadeItens,TipoEntrega tipoDeEntrega) {
        //sedex
        //pac
        if(TipoEntrega.SEDEX == tipoDeEntrega){
            return quantidadeItens * 0.4; // 40%
        }
        if(TipoEntrega.PAC == tipoDeEntrega){
            return quantidadeItens * 0.3; // 30%
        }
        if(TipoEntrega.CORREIOS == tipoDeEntrega){
            return quantidadeItens * 0.2; // 20%
        }
        return 0.0;
    }
}
