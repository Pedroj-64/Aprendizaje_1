import java.util.Scanner;

public class ArregloInvert {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] usuario = entradaUsuario(entrada);
        int[] invert = inversion(usuario);
        String mensaje = generarMensaje(invert);
        mostrarMensaje(mensaje);

        entrada.close();
    }

    public static int[] entradaUsuario(Scanner entrada) {
        System.out.println("Por favor introduzca la cantidad de espacio que quiera en el arreglo: ");
        int espacio = entrada.nextInt();
        int[] arreglo = new int[espacio];
        for (int i = 0; i < espacio; i++) {
            System.out.println("Introduzca el elemento del arreglo número " + i + " : ");
            arreglo[i] = entrada.nextInt();
        }
        return arreglo;
    }

    public static int[] inversion(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    public static String generarMensaje(int[] invertido) {
        StringBuilder mensaje = new StringBuilder("El arreglo invertido es: [ ");
        for (int i : invertido) {
            mensaje.append(i).append(" ");
        }
        mensaje.append("]");
        return mensaje.toString();
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

