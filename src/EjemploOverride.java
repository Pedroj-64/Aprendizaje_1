// Clase base o superclase
class Vehiculo {
    // Método de la superclase
    public void arrancar() {
        System.out.println("El vehículo está arrancando");
    }
}

// Clase Coche que hereda de Vehiculo
class Coche extends Vehiculo {
    // Método específico de los coches que sobrescribe el método en la clase Vehiculo
    @Override
    public void arrancar() {
        System.out.println("El coche está arrancando");
    }
}

// Clase Motocicleta que hereda de Vehiculo
class Motocicleta extends Vehiculo {
    // Método específico de las motocicletas que sobrescribe el método en la clase Vehiculo
    @Override
    public void arrancar() {
        System.out.println("La motocicleta está arrancando");
    }
}

// Clase principal para probar la anotación @Override
public class EjemploOverride {
    public static void main(String[] args) {
        // Crear objetos de las clases Coche y Motocicleta
        Vehiculo miCoche = new Coche();
        Vehiculo miMotocicleta = new Motocicleta();

        // Llamar a métodos de los objetos creados
        miCoche.arrancar(); // Debería imprimir "El coche está arrancando"
        miMotocicleta.arrancar(); // Debería imprimir "La motocicleta está arrancando"
    }
}

