import java.util.Scanner;

public class ResolverEcuacionLineal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        resolverEcuacion(a, b);
    }

    public static void resolverEcuacion(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        } else {
            double x = -b / a;
            System.out.println("La solución de la ecuación es x = " + x);
        }
    }
}
