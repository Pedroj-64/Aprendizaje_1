import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.function.Function;

public class EjemploLambda {

    public static void main(String[] args) {
        // Crear una lista de enteros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Ejemplo 1: Usar lambda con Consumer para imprimir cada número
        // Consumer es una interfaz funcional que acepta un argumento y no devuelve nada
        Consumer<Integer> imprimirNumero = (Integer n) -> System.out.println("Número: " + n);
        numeros.forEach(imprimirNumero); // Aplicar la expresión lambda a cada elemento de la lista

        // Ejemplo 2: Usar lambda con Predicate para filtrar números pares
        // Predicate es una interfaz funcional que acepta un argumento y devuelve un booleano
        Predicate<Integer> esPar = (Integer n) -> n % 2 == 0;
        List<Integer> pares = numeros.stream().filter(esPar).collect(Collectors.toList());
        System.out.println("Números pares: " + pares);

        // Ejemplo 3: Usar lambda con Function para obtener el cuadrado de cada número
        // Function es una interfaz funcional que acepta un argumento y devuelve un resultado
        Function<Integer, Integer> cuadrado = (Integer n) -> n * n;
        List<Integer> cuadrados = numeros.stream().map(cuadrado).collect(Collectors.toList());
        System.out.println("Cuadrados: " + cuadrados);
    }
}
