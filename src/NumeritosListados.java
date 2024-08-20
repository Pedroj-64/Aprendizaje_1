import java.util.Scanner;

public class NumeritosListados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] usuario = entradaUsuario(entrada);
        int result = sumatoriaOne(usuario);
        String mensaje = generarMensaje(result);
        mostrarMensaje(mensaje);
        entrada.close();

    }

    public static int[] entradaUsuario(Scanner entrada) {
        System.out.println("Por favor introduzca la cantidad de espacio que quiera en el arreglo: ");
        int espacio = entrada.nextInt();
        int[] arreglo = new int[espacio];
        for (int i = 0; i < espacio; i++) {
            System.out.println("introduzca el elemento del arreglo numero " + i + " : ");
            arreglo[i] = entrada.nextInt();
        }

        return arreglo;

    }

    public static int sumatoriaOne(int[] arreglo) {
        int resultado = 0;
        for (int i = 0; i < arreglo.length; i++) {
            resultado += arreglo[i];
        }
        return resultado;
    }

    public static String generarMensaje(int resultado) {
        String mensaje = ("La sumatoria de todos los numeros del arreglo es: " + resultado);
        return mensaje;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
