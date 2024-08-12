package punto3;

import java.util.function.Function;
import java.util.function.Predicate;

public class ParoImpar {
    public static void main(String[] args) {
        Function<Integer, Integer> potencia = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        int numero = 5;

        Integer resultado = potencia.apply(numero);
        System.out.println("El cuadrado de " + numero + " es: " + resultado);


        Predicate<Integer> esPar = x -> x % 2 == 0;
        System.out.println("¿El resultado es par? " + esPar.test(resultado));
    }

}
