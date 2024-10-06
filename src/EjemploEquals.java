public class EjemploEquals {

    public static void main(String[] args) {
        // Crear dos objetos Persona
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Juan", 25);
        Persona persona3 = new Persona("María", 30);

        // Comparar objetos usando el método equals
        System.out.println("persona1.equals(persona2): " + persona1.equals(persona2)); // Debería ser true
        System.out.println("persona1.equals(persona3): " + persona1.equals(persona3)); // Debería ser false
    }
}

// Clase Persona con implementación del método equals
class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método equals para comparar objetos Persona
    @Override
    public boolean equals(Object obj) {
        // Verificar si es el mismo objeto
        if (this == obj) return true;

        // Verificar si el objeto es una instancia de Persona
        if (obj == null || getClass() != obj.getClass()) return false;

        // Convertir obj a Persona para comparar
        Persona persona = (Persona) obj;

        // Comparar atributos relevantes
        return edad == persona.edad && (nombre != null ? nombre.equals(persona.nombre) : persona.nombre == null);
    }

    // Sobrescribir el método hashCode cuando sobrescribimos equals (buena práctica)
    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + edad;
        return result;
    }
}
