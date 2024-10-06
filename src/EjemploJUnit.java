import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class EjemploJUnit {

    // Método para demostrar assertTrue
    @Test
    public void testAssertTrue() {
        int a = 5;
        int b = 10;
        assertTrue(a < b, "a debería ser menor que b");
    }

    // Método para demostrar assertFalse
    @Test
    public void testAssertFalse() {
        int a = 5;
        int b = 10;
        assertFalse(a > b, "a no debería ser mayor que b");
    }

    // Método para demostrar assertEquals
    @Test
    public void testAssertEquals() {
        String saludo = "Hola";
        String otroSaludo = "Hola";
        assertEquals(saludo, otroSaludo, "Los saludos deberían ser iguales");
    }

    // Método para demostrar assertThrows
    @Test
    public void testAssertThrows() {
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("abc");
        }, "Debería lanzar una NumberFormatException");
    }

    // Método para demostrar assertIterableEquals
    @Test
    public void testAssertIterableEquals() {
        List<String> lista1 = new ArrayList<>();
        lista1.add("uno");
        lista1.add("dos");
        lista1.add("tres");

        List<String> lista2 = new ArrayList<>();
        lista2.add("uno");
        lista2.add("dos");
        lista2.add("tres");

        assertIterableEquals(lista1, lista2, "Las listas deberían ser iguales");
    }
}
