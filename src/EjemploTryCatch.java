public class EjemploTryCatch {

    public static void main(String[] args) {
        // Array de números para demostrar el manejo de excepciones
        int[] numeros = {1, 2, 3, 4, 5};

        // Intentar acceder a un índice fuera del rango del array
        try {
            // Este código podría lanzar una excepción
            int numeroInvalido = numeros[10];
            System.out.println("Número: " + numeroInvalido);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Este bloque maneja la excepción específica ArrayIndexOutOfBoundsException
            System.out.println("Se intentó acceder a un índice fuera del rango del array.");
            e.printStackTrace(); // Imprime la traza de la excepción
        }

        // Otra prueba con división por cero
        try {
            // Este código podría lanzar una excepción
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Este bloque maneja la excepción específica ArithmeticException
            System.out.println("Se intentó dividir por cero.");
            e.printStackTrace(); // Imprime la traza de la excepción
        }
    }

    // Método para dividir dos números
    public static int dividir(int a, int b) {
        return a / b; // Podría lanzar ArithmeticException si b es 0
    }
}
