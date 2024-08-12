package punto5;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class Division {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("10.0");
        BigDecimal num2 = new BigDecimal("6.0");

        BinaryOperator<BigDecimal> dividir = (a, b) -> a.divide(b, BigDecimal.ROUND_HALF_UP);

        BigDecimal resultado = dividir.apply(num1, num2);

        System.out.println("El resultado de la division es: " + resultado);
    }
}
