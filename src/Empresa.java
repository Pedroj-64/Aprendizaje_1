import java.util.ArrayList;
import java.util.List;

// Definición de la interfaz Empleado
interface Empleado {
    // Método abstracto que todas las clases que implementan Empleado deben sobrescribir
    double calcularSalario();
}

// Clase EmpleadoFullTime que implementa la interfaz Empleado
class EmpleadoFullTime implements Empleado {
    private double salarioBase;

    // Constructor para inicializar el salario base del empleado a tiempo completo
    public EmpleadoFullTime(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}

// Clase EmpleadoFreelancer que implementa la interfaz Empleado
class EmpleadoFreelancer implements Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    // Constructor para inicializar la tarifa por hora y las horas trabajadas del freelancer
    public EmpleadoFreelancer(double tarifaPorHora, int horasTrabajadas) {
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }
}

// Clase Empresa que gestiona una lista de empleados
public class Empresa {
    // Lista que contiene objetos de tipo Empleado
    private List<Empleado> empleados = new ArrayList<>();

    // Método para agregar un empleado a la lista
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para calcular y mostrar los salarios de todos los empleados
    public void calcularSalarios() {
        // Itera sobre la lista de empleados
        for (Empleado empleado : empleados) {
            // Llama al método calcularSalario para cada empleado y muestra el resultado
            System.out.println("Salario: " + empleado.calcularSalario());
        }
    }

    // Método principal para probar la funcionalidad
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        // Agregar empleados de diferentes tipos a la lista
        empresa.agregarEmpleado(new EmpleadoFullTime(3000)); // Empleado a tiempo completo
        empresa.agregarEmpleado(new EmpleadoFreelancer(50, 80)); // Empleado freelancer

        // Calcular y mostrar los salarios de todos los empleados
        empresa.calcularSalarios();
    }
}
