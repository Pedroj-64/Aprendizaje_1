/**
 * Clase que ejemplifica el uso del operador ternario y la estructura if-else en Java.
 */
public class OperadorTernarioEjemplo {

    /**
     * Método que ejemplifica el uso del operador ternario.
     * @param esNuevo Indica si el objeto es nuevo.
     * @return Valor de depreciación basado en si el objeto es nuevo o usado.
     */
    public double calcularDepreciacionConTernario(boolean esNuevo) {
        // Uso del operador ternario
        double depreciacion = esNuevo ? 1.0 : 0.7;
        return depreciacion;
    }

    /**
     * Método que ejemplifica el uso de la estructura if-else.
     * @param esNuevo Indica si el objeto es nuevo.
     * @return Valor de depreciación basado en si el objeto es nuevo o usado.
     */
    public double calcularDepreciacionConIfElse(boolean esNuevo) {
        // Uso de if-else
        double depreciacion;
        if (esNuevo) {
            depreciacion = 1.0;
        } else {
            depreciacion = 0.7;
        }
        return depreciacion;
    }

    public static void main(String[] args) {
        OperadorTernarioEjemplo ejemplo = new OperadorTernarioEjemplo();
        
        // Pruebas de los métodos
        boolean esNuevo = true;
        System.out.println("Depreciación con operador ternario: " + ejemplo.calcularDepreciacionConTernario(esNuevo));
        System.out.println("Depreciación con if-else: " + ejemplo.calcularDepreciacionConIfElse(esNuevo));

        esNuevo = false;
        System.out.println("Depreciación con operador ternario: " + ejemplo.calcularDepreciacionConTernario(esNuevo));
        System.out.println("Depreciación con if-else: " + ejemplo.calcularDepreciacionConIfElse(esNuevo));
    }
}
