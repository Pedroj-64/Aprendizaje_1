import java.util.Scanner;

public class ArregloInvert {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int[] usuario=entradaUsuario(entrada);
        int[] invert=inversion(usuario);
        int leer=recorrer(invert);
        String mensaje=generarMensaje(leer);
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
    public static int[] inversion(int[] arreglo){
        int[] invertido=new int[arreglo.length];
        for(int i=0;i<arreglo.length;i++){
            invertido[i]=arreglo.length-1-i;

        }

        return invertido;
    }
    public static int recorrer(int[] invertido){
        int numeracion=0;
        for(int i=0;i<invertido.length;i++){
            numeracion=invertido[i];
            System.out.println(invertido[i]);
        }
        return numeracion;
    }

    public static String generarMensaje(int recorrer) {
        String mensaje = ("El arreglo invertido es: " +"[ " + recorrer + " ]");
        return mensaje;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }


}
