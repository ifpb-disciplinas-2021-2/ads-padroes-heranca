package br.edu.ifpb;

import static br.edu.ifpb.TaxaDeEntrega.TipoEntrega.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompraTest {

    @Test
    public void testeTaxaComSedex() {
        //given
//        Compra compra = new Compra();
        TaxaDeEntrega entrega = new TaxaDeEntrega();
        //then
        double taxas = entrega.calcularTaxas(10,SEDEX);
        double expected = 4.0;
        //verify
        assertEquals(expected,taxas,0.0001);
    }

    @Test
    public void testeTaxaComPAC() {
        //given
//        Compra compra = new Compra();
        TaxaDeEntrega entrega = new TaxaDeEntrega();
        //then
        double taxas = entrega.calcularTaxas(10,PAC);
        double expected = 3.0;
        //verify
        assertEquals(expected,taxas,0.0001);
    }
    @Test
    public void testeTaxaComCorreios() {
        //given
//        Compra compra = new Compra();
        TaxaDeEntrega entrega = new TaxaDeEntrega();
        //then
        double taxas = entrega.calcularTaxas(10,CORREIOS);
        double expected = 2.0;
        //verify
        assertEquals(expected,taxas,0.0001);
    }
}
