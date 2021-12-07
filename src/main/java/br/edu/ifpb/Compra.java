package br.edu.ifpb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 30/11/2021, 09:22:50
 */
public class Compra {

    private List<ItemDeVenda> itens = new ArrayList<>();
    private LocalDate criadaEm = LocalDate.now();
    private Desconto desconto;

    public Compra() {
//        this(new SemDesconto()); // comportamento default é que não tenhamos descontos
//        this(new Desconto.SmartDesconto()); // comportamento default é que não tenhamos descontos
        this(Desconto.SEMDESCONTO); // comportamento default é que não tenhamos descontos
    
    }
    // ctor principal
    public Compra(Desconto desconto) {
        this.desconto = desconto;
    }

    public void adicionar(int quantidade,Produto produto) {
        ItemDeVenda item = new ItemDeVenda(
            quantidade,produto
        );
        if (!itens.contains(item)) {
            itens.add(item);
        }
    }

    public double valorTotal() {
        return itens.stream()
            .mapToDouble(ItemDeVenda::subTotal)
            .sum();
    }

    public int itens() {
        return 10;
//        return itens.size();
    }

    
    public double aplicarDesconto(){ //quanto de desconto vamos ter nesta compra
//        if(desconto ==null) return valorTotal(); //sem desconto
        return desconto.aplicarEm(valorTotal());
    }
    public double taxas(Entrega tipoDeEntrega) {
        return tipoDeEntrega.calcularTaxas(this);
    }

}
