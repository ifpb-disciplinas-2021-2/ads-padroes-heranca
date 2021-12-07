package br.edu.ifpb;

import br.edu.ifpb.nullObject.DescontoPercentual;
import br.edu.ifpb.nullObject.DescontoAbsoluto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescontoTest {

    @Test
    public void testeCompraSemDesconto() {
        Compra compra = new Compra();
        compra.adicionar(1,new Produto("TV",1000));
        double taxas = compra.aplicarDesconto();
        double expected = 1000.0;
        assertEquals(expected,taxas,0.0001);
    }
    @Test
    public void testeCompracomDescontoAbsoluto() {
        Desconto desconto = new DescontoAbsoluto(100);
        double valorComDesconto = desconto.aplicarEm(1000);
        double expected = 900.0;
        assertEquals(expected,valorComDesconto,0.0001);
    }
    @Test
    public void testeCompracomDescontoPercentual() {
        Desconto desconto = new DescontoPercentual(20); //20%
        double valorComDesconto = desconto.aplicarEm(1000);
        double expected = 800.0;
        assertEquals(expected,valorComDesconto,0.0001);
    }
 
}
