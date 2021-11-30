package br.edu.ifpb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompraTest {

    @Test
    public void testeTaxaComSedex() {
        Compra compra = new Compra();
        double taxas = compra.taxas(10,new EntregaComSEDEX());
        double expected = 4.0;
        assertEquals(expected,taxas,0.0001);
    }

    @Test
    public void testeTaxaComPAC() {
        Compra compra = new Compra();
        double taxas = compra.taxas(10,new EntregaComPAC());
        double expected = 3.0;
        assertEquals(expected,taxas,0.0001);
    }
    @Test
    public void testeTaxaComCorreios() {
        Compra compra = new Compra();
        double taxas = compra.taxas(10,new EntregaComCorreios());
        double expected = 2.0;
        assertEquals(expected,taxas,0.0001);
    }
    @Test
    public void testeTaxaComFEDEX() {
        Compra compra = new Compra();
        double taxas = compra.taxas(10,new EntregaComFEDEX());
        double expected = 8.0;
        assertEquals(expected,taxas,0.0001);
    }
}
