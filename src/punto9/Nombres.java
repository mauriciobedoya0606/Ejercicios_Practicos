package punto9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Nombres {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList(
                "Ana", "Luis", "Carlos", "Ana", "Maria", "Carlos", "Ana"
        );

        List<String> nombresFiltrados = filtrarNombres(nombres, "Ana");

        imprimirNombres(Optional.of(nombresFiltrados));
    }

    public static List<String> filtrarNombres(List<String> nombres, String parametro) {
        return nombres.stream()
                .filter(nombre -> nombre.equals(parametro))
                .collect(Collectors.toList());
    }

    public static void imprimirNombres(Optional<List<String>> nombresOpt) {
        nombresOpt.ifPresent(nombres -> {
            if (nombres.isEmpty()) {
                System.out.println("No se encontraron nombres coincidentes.");
            } else {
                nombres.forEach(System.out::println);
            }
        });
    }
}
