import java.util.Locale;
import java.util.Scanner;

public class SumaNum {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("introduzca el primer numero:  ");

        var num1=(int) entrada.nextInt();

        System.out.println("introduzca el segundo numero:  ");
        
        var num2=(int) entrada.nextInt();

        System.out.println("introduzca el tercer numero:  ");

        var num3=(int) entrada.nextInt();

        System.out.println("introduzca el cuarto numero:  ");

        var num4=(int) entrada.nextInt();

        var suma1= (int) num1+num2;

        var suma2= (int) num3+num4;

        var promedio= (double) num1+num2+num3+num4/4;

        System.out.println("El resultado de los dos primero numeros es: " + suma1 + " y la suma de sus dos ultimos numeros es: " + suma2);
        System.out.print("El promedio de los numeros introducidos es: " + promedio);

        entrada.close();

    }
}

