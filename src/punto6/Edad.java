package punto6;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;

@FunctionalInterface
interface ValidarEdad {
    String validar(String nombre, int edad, LocalDate fechaNacimiento);
}

public class Edad {
    public static void main(String[] args) {

        LocalDate fechaNacimiento;
        BiFunction<LocalDate, Integer, Boolean> validadorEdad = (fecha, edadIngresada) -> {
            LocalDate hoy = LocalDate.now();
            int edadCalculada = Period.between(fecha, hoy).getYears();
            return edadCalculada == edadIngresada;
        };

        ValidarEdad validarEdad = (nombre, edad, fechaNac) -> {

            boolean coincide = validadorEdad.apply(fechaNac, edad);
            if (coincide) {
                return "La fecha de nacimiento de " + nombre + " corresponde a la edad";
            } else {
                return "La fecha de nacimiento de " + nombre + " no corresponde a la edad";
            }
        };

        String nombre = "Mao";
        int edad = 21;
        fechaNacimiento = LocalDate.of(2003, 6, 6);

        String resultado = validarEdad.validar(nombre, edad, fechaNacimiento);

        System.out.println(resultado);

    }
}
