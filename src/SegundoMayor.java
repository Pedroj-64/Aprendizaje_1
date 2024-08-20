import java.util.Scanner;

public class SegundoMayor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca la cantidad de elementos en el arreglo: ");
        int n = entrada.nextInt();
        int[] arreglo = new int[n];

        System.out.println("Introduzca los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = entrada.nextInt();
        }

        int segundoMayor = encontrarSegundoMayor(arreglo);
        System.out.println("El segundo número mayor en el arreglo es: " + segundoMayor);

        entrada.close();
    }

    public static int encontrarSegundoMayor(int[] arreglo) {
        if (arreglo.length < 2) {
            throw new IllegalArgumentException("El arreglo debe tener al menos dos elementos.");
        }

        int mayor=0;
        int segundoMayor=0;

        for (int num : arreglo) {
            if (num > mayor) {
                segundoMayor = mayor;
                mayor = num;
            } else if (num > segundoMayor && num != mayor) {
                segundoMayor = num;
            }
        }
        
        return segundoMayor;
    }
}
