import java.util.ArrayList;
import java.util.List;

public class EjemploForEachNormal {

    public static void main(String[] args) {
        // Crear una lista de nombres
        List<String> nombres = new ArrayList<>(); // Se instancia un nuevo ArrayList para almacenar nombres
        nombres.add("Juan"); // Se agrega "Juan" a la lista
        nombres.add("María"); // Se agrega "María" a la lista
        nombres.add("Carlos"); // Se agrega "Carlos" a la lista
        nombres.add("Ana"); // Se agrega "Ana" a la lista

        // Usar for-each para iterar sobre la lista e imprimir cada nombre
        System.out.println("Iterando con for-each normal:");
        for (String nombre : nombres) { // Se inicia un bucle for-each que recorre cada elemento de la lista 'nombres'
            System.out.println(nombre); // Se imprime cada nombre en la lista
        }
    }
}
