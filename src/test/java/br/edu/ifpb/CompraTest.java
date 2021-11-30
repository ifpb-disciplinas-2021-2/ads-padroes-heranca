package br.edu.ifpb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompraTest {

    @Test
    public void testeTaxaComSedex(){
        //given
        Compra compra = new Compra();
        //then
        double taxas = compra.calcularTaxas(10,"sedex");
        double expected = 4.0;
        //verify
        assertEquals(expected,taxas, 0.0001);
    }
    @Test
    public void testeTaxaComPAC(){
        //given
        Compra compra = new Compra();
        //then
        double taxas = compra.calcularTaxas(10,"pac");
        double expected = 3.0;
        //verify
        assertEquals(expected,taxas, 0.0001);
    }
}
