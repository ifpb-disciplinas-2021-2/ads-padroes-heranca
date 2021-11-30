package br.edu.ifpb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 30/11/2021, 09:22:50
 */
public class Compra {
    private List<ItemDeVenda> itens = new ArrayList<>();
    private LocalDate criadaEm = LocalDate.now();
    
    public void adicionar(int quantidade, Produto produto){
        ItemDeVenda item = new ItemDeVenda( 
            quantidade,produto
        );
        if(!itens.contains(item)) 
            itens.add(item);
    }
    public double valorTotal() {
        return itens.stream()
            .mapToDouble(ItemDeVenda::subTotal)
            .sum();
    }
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
