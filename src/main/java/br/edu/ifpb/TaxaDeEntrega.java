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
            return new EntregaComSEDEX().taxasComSEDEX(quantidadeItens); 
        }
        if(TipoEntrega.PAC == tipoDeEntrega){
            return new EntregaComPAC().taxasComPAC(quantidadeItens); 
        }
        if(TipoEntrega.CORREIOS == tipoDeEntrega){
            return new EntregaComCorreios().taxasComCorreios(quantidadeItens); 
        }
        return 0.0;
    }

//    private double taxasComCorreios(int quantidadeItens) {
//        return quantidadeItens * 0.2; // 20%
//    }

//    private double taxasComPAC(int quantidadeItens) {
//        return quantidadeItens * 0.3; // 30%
//    }

//    private double taxasComSEDEX(int quantidadeItens) {
//        return quantidadeItens * 0.4; // 40%
//    }
}
