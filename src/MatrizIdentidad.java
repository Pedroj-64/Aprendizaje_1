import java.util.Scanner;

public class MatrizIdentidad {
    public static void main(String[] args) {
        Scanner Usuario=entrada();
        int[] valorMatriz=entradaUsuario(Usuario);
        int [][] creacionMatriz=matriz(Usuario, valorMatriz);
        imprimir(creacionMatriz);
    }

    public static Scanner entrada() {
        Scanner entrada = new Scanner(System.in);

        return entrada;
    }

    public static int[] entradaUsuario(Scanner entrada) {
        int[] arreglo = new int[2];
        System.out.println("Por favor introduzca la cantidad de filas que quiere en su matriz: ");
        arreglo[0] = entrada.nextInt();
        System.out.println("Por favor introduzca la cantidad de columnas  que quiere en su matriz: ");
        arreglo[1] = entrada.nextInt();

        return arreglo;
    }

    public static int[][] matriz(Scanner entrada, int[] arreglo) {
        int[][] matrisosa = new int[arreglo[0]][arreglo[1]];
        for (int i = 0; i < arreglo[0]; i++) {
            for (int j = 0; j < arreglo[0]; j++) {
                if (i == j) {
                    matrisosa[i][j] = 1;
                }
                

            }
        }
        return matrisosa;
    }
    public static int[][] leerMatrix(int [][] matrisosa,int [][] arreglo){
        for (int i = 0; i < arreglo[0] ; i++) {
            for (int j = 0; j < arreglo[1]; j++) {
                
            }
        }
    }

    public static void imprimir(int[][] matrisosa) {
        System.out.println(matrisosa);
    }
}
