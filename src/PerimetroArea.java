import java.util.Locale;
import java.util.Scanner;

public class PerimetroArea {
  
    public static void main(String[] args) {
        

        Scanner entrada=new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("introduzca el lado del cuadrado para calcular perimetro: ");

        var lado=(double) entrada.nextDouble();

        var perimetro= (double) 4*lado;

        System.out.println("El perimetro del cuadrado dado es: " + perimetro);

        entrada.close();





    }
}
