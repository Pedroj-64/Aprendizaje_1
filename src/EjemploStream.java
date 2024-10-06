import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploStream {

    public static void main(String[] args) {
        // Crear una lista de enteros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar stream para filtrar números pares
        List<Integer> numerosPares = numeros.stream() // Convertir la lista a un stream
                                            .filter(n -> n % 2 == 0) // Filtrar números pares
                                            .collect(Collectors.toList()); // Coleccionar el resultado en una lista

        // Imprimir los números pares
        System.out.println("Números pares: " + numerosPares);

        // Usar stream para mapear y obtener el cuadrado de cada número
        List<Integer> cuadrados = numeros.stream() // Convertir la lista a un stream
                                         .map(n -> n * n) // Mapear cada número a su cuadrado
                                         .collect(Collectors.toList()); // Coleccionar el resultado en una lista

        // Imprimir los cuadrados
        System.out.println("Cuadrados: " + cuadrados);
    }
}
