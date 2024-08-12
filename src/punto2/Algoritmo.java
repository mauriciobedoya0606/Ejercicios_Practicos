package punto2;

import java.util.function.Function;
import java.util.function.Predicate;

public class Algoritmo {
    public static void main(String[] args) {
        Function<Integer, Integer> potencia = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        // Aqui se ingresa el numero al cual se quiera hacer su potencia
        int numero = 5;

        //función potencia al número
        Integer resultado = potencia.apply(numero);
        System.out.println("El cuadrado de " + numero + " es: " + resultado);

    }

}
