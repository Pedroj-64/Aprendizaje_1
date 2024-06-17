import java.util.*;

public class InputeandoConScanner {

    public static void main(String[] args)  {
        
        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor: ");

        String nombre=entrada.nextLine();

        System.out.println("Introduce edad por favor: ");

        int edad=entrada.nextInt();

        entrada.nextLine(); 

        System.out.println("Introduce promedio: ");

        var promedio= (double)entrada.nextDouble();
        
        entrada.close();

        System.out.println("El nombre del usario es: " + nombre + " ,su edad es: " + edad + " y su promedio es de: " + promedio);

        System.out.println("Hola " + nombre +  " el año que viene tendras " + (edad+1) + " años");
    }
}

