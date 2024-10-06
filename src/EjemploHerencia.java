// Clase base o superclase
class Animal {
    // Atributos comunes a todos los animales
    String nombre;
    int edad;

    // Constructor de la clase Animal
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método común a todos los animales
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

// Clase Perro que hereda de Animal
class Perro extends Animal {
    // Atributo específico de los perros
    String raza;

    // Constructor de la clase Perro
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad); // Llamada al constructor de la clase Animal
        this.raza = raza; // Inicializar el atributo específico
    }

    // Método específico de los perros
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

// Clase Gato que hereda de Animal
class Gato extends Animal {
    // Atributo específico de los gatos
    boolean tienePeloLargo;

    // Constructor de la clase Gato
    public Gato(String nombre, int edad, boolean tienePeloLargo) {
        super(nombre, edad); // Llamada al constructor de la clase Animal
        this.tienePeloLargo = tienePeloLargo; // Inicializar el atributo específico
    }

    // Método específico de los gatos
    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}

// Clase principal para probar la herencia
public class EjemploHerencia {
    public static void main(String[] args) {
        // Crear objetos de las clases Perro y Gato
        Perro perro = new Perro("Bobby", 5, "Labrador");
        Gato gato = new Gato("Whiskers", 3, true);

        // Llamar a métodos de los objetos creados
        System.out.println("Perro: " + perro.nombre + ", Edad: " + perro.edad + ", Raza: " + perro.raza);
        perro.hacerSonido(); // Debería imprimir "El perro ladra"

        System.out.println("Gato: " + gato.nombre + ", Edad: " + gato.edad + ", Tiene pelo largo: " + gato.tienePeloLargo);
        gato.hacerSonido(); // Debería imprimir "El gato maúlla"
    }
}

