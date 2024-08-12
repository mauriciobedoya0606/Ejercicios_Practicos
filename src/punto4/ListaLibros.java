package punto4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class ListaLibros {
   public static void main(String[] args) {
      // Supplier para crear una lista de libros
      Supplier<List<Libros>> librosSupplier = () -> Arrays.asList(
              new Libros("Millo Joven", "Márquez", 10),
              new Libros("El patron", "Pablo Antonio", 9),
              new Libros("El Principito", "Antoine Griezmann", 8),
              new Libros("Las palabras que se llevo el viento", "Miguel Orozco", 6)
      );


      List<Libros> listaLibros = librosSupplier.get();

      Predicate<Libros> esRecomendado = libro -> libro.getPuntaje() >= 7;

      UnaryOperator<Libros> mostrarMensaje = libro -> {
         if (esRecomendado.test(libro)) {
            System.out.println("El libro " + libro.getNombre() + " es recomendado 😊");
         }
         return libro;
      };

      Consumer<List<Libros>> procesarLibros = lista -> {
          for (Libros libros : lista) {
              mostrarMensaje.apply(libros);
          }
      };

      procesarLibros.accept(listaLibros);
   }
}
