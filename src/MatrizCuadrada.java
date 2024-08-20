import java.util.Scanner;

public class MatrizCuadrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] usuario = entradaUsuario(entrada);
        String verify = verificacion(usuario[0], usuario[1]);
        String mensaje = generarMensaje(verify);
        mostrarMensaje(mensaje);

        entrada.close();

    }

    public static int[] entradaUsuario(Scanner entrada) {
        int[] arreglo = new int[2];
        System.out.println("Por favor introduzca la cantidad de filas que quiere en su matriz: ");
        arreglo[0] = entrada.nextInt();
        System.out.println("Por favor introduzca la cantidad de columnas  que quiere en su matriz: ");
        arreglo[1] = entrada.nextInt();

        return arreglo;
    }

    public static int[][] matriz(int[] arreglo, Scanner entrada) {
        int[][] matrisosa = new int[arreglo[0]][arreglo[1]];
        for (int i = 0; i < arreglo[0]; i++) {
            for (int j = 0; j < arreglo[1]; j++) {
                System.out.println("Por favor poner el elemento que quiere que haga parte de la matriz en la fila " + i
                        + " y columna " + j);
                int valor = entrada.nextInt();
                matrisosa[i][j] = valor;
            }
        }
        return matrisosa;
    }
    

    public static String verificacion(int filas, int columnas) {
        String mensaje;
        if (filas == columnas) {
            mensaje = "la matriz es cuadrada";

        } else {
            mensaje = "la matriz no es cuadrada";
        }
        return mensaje;

    }

    public static String generarMensaje(String mensaje) {
        String mensaje1 = "el resultado es: " + mensaje;
        return mensaje1;

    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
