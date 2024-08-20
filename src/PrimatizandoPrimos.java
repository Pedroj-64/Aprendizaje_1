import java.util.Scanner;

public class PrimatizandoPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = num(entrada);
        String calc = calculo(numero);
        String mensaje = generarMensaje(numero, calc);
        mostrarMensaje(mensaje);
        entrada.close();

    }

    public static int num(Scanner entrada) {
        System.out.println("Introduzca por favor el numero que quiere saber su primicidad: ");
        int primo = entrada.nextInt();
        return primo;
    }

    public static String calculo(int primo) {
        String mensaje;
        if (primo / 1 == primo && primo % primo == 0) {
            mensaje = "El numero es primo";
        } else {
            mensaje = "El numero no es primo";
        }
        return mensaje;

    }

    public static String generarMensaje(int primo, String mensaje) {
        String mensaje1 = "El numero " + primo + " es: " + mensaje;
        return mensaje1;

    }

    public static void mostrarMensaje(String mensaje1) {
        System.out.println(mensaje1);
    }

}