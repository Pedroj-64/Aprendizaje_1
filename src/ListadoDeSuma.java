import java.util.Scanner;

public class ListadoDeSuma {
    //Main
    public static void main(String[] args) {
        Scanner entrada1 = entrada();
        int usuario = entradaUsuario(entrada1);
        int[] arreglo = entradaArreglos(entrada1, usuario);
        int result = sumatoriaOne(arreglo);
        String mensaje = generarMensaje(result);
        mostrarMensaje(mensaje);
    }
    /**
     * Metodo tipo Scanner para utilizarlo por todos los metodos 
     * @return
     */
    public static Scanner entrada() {
        Scanner entrada = new Scanner(System.in);
        return entrada;
    }
    /**
     * Aqui se pide al usuario el numero de grandor del arreglo que quiere
     * @param entrada
     * @return
     */
    public static int entradaUsuario(Scanner entrada) {
        System.out.println("Por favor introduzca la cantidad de espacio que quiera en el arreglo: ");
        int espacio = entrada.nextInt();

        return espacio;
    }
    /**
     * Aqui se crea el arreglo a su vez se le pide al usurio un input de cada numero
     * @param entrada
     * @param espacio
     * @return
     */
    public static int[] entradaArreglos(Scanner entrada, int espacio) {
        int[] arreglo = new int[espacio];
        for (int i = 0; i < espacio; i++) {
            System.out.println("introduzca el elemento del arreglo numero " + i + " : ");
            arreglo[i] = entrada.nextInt();
        }
        return arreglo;

    }
    /**
     * Aqui se suma todo el arreglo
     * @param arreglo
     * @return
     */
    public static int sumatoriaOne(int[] arreglo) {
        int resultado = 0;
        for (int i = 0; i < arreglo.length; i++) {
            resultado += arreglo[i];
        }
        return resultado;
    }
    /**
     * Aqui se genera un mensaje para poderlo imprimir despues
     * @param resultado
     * @return
     */
    public static String generarMensaje(int resultado) {
        String mensaje = ("La sumatoria de todos los numeros del arreglo es: " + resultado);
        return mensaje;
    }
    /**
     * Se muestra el mensaje sin retorno al ser el final del progama 
     * @param mensaje
     */
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
