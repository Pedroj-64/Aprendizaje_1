// Definición de la interfaz Animal
interface Animal {
    // Método abstracto
    void hacerSonido();

    // Método por defecto
    default void dormir() {
        System.out.println("El animal está durmiendo");
    }
}

// Clase Perro que implementa la interfaz Animal
class Perro implements Animal {
    private String nombre;

    // Constructor
    public Perro(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método abstracto hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra");
    }

    // Sobrescribir el método por defecto dormir (opcional)
    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo plácidamente");
    }
}

// Clase Gato que implementa la interfaz Animal
class Gato implements Animal {
    private String nombre;

    // Constructor
    public Gato(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método abstracto hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " maúlla");
    }

    // Sobrescribir el método por defecto dormir (opcional)
    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo cómodamente");
    }
}

// Clase principal para probar las interfaces
public class EjemploInterface {
    public static void main(String[] args) {
        // Crear objetos de las clases Perro y Gato
        Animal miPerro = new Perro("Bobby");
        Animal miGato = new Gato("Whiskers");

        // Llamar a los métodos implementados en las clases Perro y Gato
        miPerro.hacerSonido(); // Debería imprimir "Bobby ladra"
        miPerro.dormir(); // Debería imprimir "Bobby está durmiendo plácidamente"

        miGato.hacerSonido(); // Debería imprimir "Whiskers maúlla"
        miGato.dormir(); // Debería imprimir "Whiskers está durmiendo cómodamente"
    }
}
