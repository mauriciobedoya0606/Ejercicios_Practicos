package punto7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Fecha {


        public static void fechas(LocalDate fecha) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'd' MMMM 'del' yyyy");
            String formatoFecha = fecha.format(formatter);
            System.out.println("La fecha es " + formatoFecha);
        }

        public static void main(String[] args) {
            List<LocalDate> fechas = Arrays.asList(
                    LocalDate.of(2024, 8, 12),
                    LocalDate.of(2023, 12, 25),
                    LocalDate.of(2022, 5, 1)
            );

            fechas.forEach(Fecha::fechas);

    }
}
