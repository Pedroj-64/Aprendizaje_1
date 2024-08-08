import java.util.Locale;
import java.util.Scanner;

public class ArticuloVenta {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
   
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el nombre del producto a continuacion: ");

        String nombre=entrada.nextLine();

        System.out.println("Ingrese el precio del producto a continuacion: ");

        var precio=entrada.nextInt();

        System.out.println("Ingrese cantidad del producto a  comprar a continuacion: ");

        var cantidad= entrada.nextInt();

        var solucion= precio *cantidad;

        System.out.println("EL precio total del producto " + nombre + " es: " + solucion);

        entrada.close();



        

    }

}


