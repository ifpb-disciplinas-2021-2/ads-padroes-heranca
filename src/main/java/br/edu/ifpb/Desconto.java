package br.edu.ifpb;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/12/2021, 10:14:14
 */
public interface Desconto {

    public double aplicarEm(double desconto);
    
//    public static final Desconto SEMDESCONTO = new SemDesconto();
    public static final Desconto SEMDESCONTO = (double d) -> d;

//    class SmartDesconto implements Desconto { //classes Smarts
//
//        @Override
//        public double aplicarEm(double desconto) {
//            return desconto;
//        }
//
//    }
}
