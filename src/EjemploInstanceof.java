public class EjemploInstanceof {

    public static void main(String[] args) {
        Persona persona = new Persona();
        Empleado empleado = new Empleado();
        EmpleadoFullTime empleadoFullTime = new EmpleadoFullTime();
        EmpleadoFreelancer empleadoFreelancer = new EmpleadoFreelancer();

        // Ejemplo 1: Verificar si un objeto es una instancia de una clase específica
        verificarTipo(persona); // Debería mostrar: "Es una instancia de Persona"
        verificarTipo(empleado); // Debería mostrar: "Es una instancia de Empleado" y "Es una instancia de Persona"
        verificarTipo(empleadoFullTime); // Debería mostrar: "Es una instancia de EmpleadoFullTime", "Es una instancia de Empleado" y "Es una instancia de Persona"
        verificarTipo(empleadoFreelancer); // Debería mostrar: "Es una instancia de EmpleadoFreelancer", "Es una instancia de Empleado" y "Es una instancia de Persona"
    }

    /**
     * Método que verifica el tipo del objeto usando instanceof
     */
    public static void verificarTipo(Object obj) {
        if (obj instanceof EmpleadoFreelancer) {
            System.out.println("Es una instancia de EmpleadoFreelancer");
        }
        if (obj instanceof EmpleadoFullTime) {
            System.out.println("Es una instancia de EmpleadoFullTime");
        }
        if (obj instanceof Empleado) {
            System.out.println("Es una instancia de Empleado");
        }
        if (obj instanceof Persona) {
            System.out.println("Es una instancia de Persona");
        }
    }

}

// Clases de ejemplo para demostrar instanceof
class Persona {
}

class Empleado extends Persona {
}

class EmpleadoFullTime extends Empleado {
}

class EmpleadoFreelancer extends Empleado {
}

