package br.edu.ifpb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescontoTest {

    @Test
    public void testeTaxaComSedex() {
        Compra compra = new Compra();
        compra.adicionar(1,new Produto("TV",1000));
        double taxas = compra.aplicarDesconto();
        double expected = 1000.0;
        assertEquals(expected,taxas,0.0001);
    }
 
}
