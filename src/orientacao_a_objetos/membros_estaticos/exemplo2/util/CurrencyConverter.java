package orientacao_a_objetos.membros_estaticos.exemplo2.util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double dollarToReal(double amount, double dollarPrice) {
        return amount * dollarPrice * (1.0 + IOF);
    }

}
