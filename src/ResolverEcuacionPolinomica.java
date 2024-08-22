import java.util.Scanner;

public class ResolverEcuacionPolinomica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el grado del polinomio: ");
        int grado = scanner.nextInt();

        double[] coeficientes = new double[grado + 1];
        for (int i = 0; i <= grado; i++) {
            System.out.print("Ingrese el coeficiente de x^" + i + ": ");
            coeficientes[i] = scanner.nextDouble();
        }

        System.out.print("Ingrese una aproximación inicial: ");
        double x0 = scanner.nextDouble();

        double raiz = newtonRaphson(coeficientes, x0);
        System.out.println("Una raíz aproximada de la ecuación es x = " + raiz);
    }

    public static double newtonRaphson(double[] coeficientes, double x0) {
        double tol = 1e-7;
        int maxIter = 1000;
        double x = x0;

        for (int i = 0; i < maxIter; i++) {
            double fx = evaluarPolinomio(coeficientes, x);
            double fpx = evaluarDerivada(coeficientes, x);

            if (Math.abs(fpx) < tol) {
                System.out.println("La derivada es muy pequeña, el método puede no converger.");
                break;
            }

            double x1 = x - fx / fpx;

            if (Math.abs(x1 - x) < tol) {
                return x1;
            }

            x = x1;
        }

        System.out.println("El método no convergió después de " + maxIter + " iteraciones.");
        return x;
    }

    public static double evaluarPolinomio(double[] coeficientes, double x) {
        double resultado = 0;
        for (int i = 0; i < coeficientes.length; i++) {
            resultado += coeficientes[i] * Math.pow(x, i);
        }
        return resultado;
    }

    public static double evaluarDerivada(double[] coeficientes, double x) {
        double resultado = 0;
        for (int i = 1; i < coeficientes.length; i++) {
            resultado += i * coeficientes[i] * Math.pow(x, i - 1);
        }
        return resultado;
    }
}
