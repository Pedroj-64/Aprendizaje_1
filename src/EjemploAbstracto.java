// Clase abstracta Animal
abstract class Animal {
    // Atributo común a todos los animales
    String nombre;

    // Constructor de la clase abstracta
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void hacerSonido();

    // Método concreto que pueden usar todas las subclases
    public void dormir() {
        System.out.println(nombre + " está durmiendo");
    }
}

// Clase Perro que extiende de la clase abstracta Animal
class Perro extends Animal {
    // Constructor de la clase Perro
    public Perro(String nombre) {
        super(nombre); // Llamada al constructor de la superclase Animal
    }

    // Implementación del método abstracto hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra");
    }
}

// Clase Gato que extiende de la clase abstracta Animal
class Gato extends Animal {
    // Constructor de la clase Gato
    public Gato(String nombre) {
        super(nombre); // Llamada al constructor de la superclase Animal
    }

    // Implementación del método abstracto hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " maúlla");
    }
}

// Clase principal para probar las clases y métodos abstractos
public class EjemploAbstracto {
    public static void main(String[] args) {
        // Crear objetos de las clases Perro y Gato
        Animal miPerro = new Perro("Bobby");
        Animal miGato = new Gato("Whiskers");

        // Llamar a los métodos implementados en las subclases
        miPerro.hacerSonido(); // Debería imprimir "Bobby ladra"
        miPerro.dormir(); // Debería imprimir "Bobby está durmiendo"

        miGato.hacerSonido(); // Debería imprimir "Whiskers maúlla"
        miGato.dormir(); // Debería imprimir "Whiskers está durmiendo"
    }
}
