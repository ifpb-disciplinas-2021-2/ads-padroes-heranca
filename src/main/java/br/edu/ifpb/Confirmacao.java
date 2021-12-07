package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/12/2021, 10:55:20
 */
public abstract class Confirmacao {

    private Compra compra;
    private Desconto desconto;

    public Confirmacao(Compra compra,Desconto desconto) {
        this.compra = compra;
        this.desconto = desconto;
    }
    
    public void concluir(Entrega entrega){
        //calcular as taxas
        double taxas = compra.taxas(entrega);
        //calcular o valor total
        double valorComDesconto = aplicarDesconto(compra);
        double valorTotal = valorComDesconto + taxas;
        pagar(valorTotal); //hook method
        confirmar(compra);
        
    }
    
    // a vista, boleto, carto, prazo
    protected abstract void pagar(double valorTotal); //comportamento seja definido na subclasse

    protected void confirmar(Compra compra) {
        System.out.println("confimando a compra...");
    }
    private double aplicarDesconto(Compra compra){
        return desconto.aplicarEm(compra.valorTotal());
    }
}
