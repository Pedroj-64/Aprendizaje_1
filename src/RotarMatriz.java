public class RotarMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizRotada = rotarMatriz90Grados(matriz);

        System.out.println("Matriz rotada 90 grados en sentido horario:");
        for (int i = 0; i < matrizRotada.length; i++) {
            for (int j = 0; j < matrizRotada[i].length; j++) {
                System.out.print(matrizRotada[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotarMatriz90Grados(int[][] matriz) {
        int n = matriz.length;
        int[][] matrizRotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotada[j][n - 1 - i] = matriz[i][j];
            }
        }

        return matrizRotada;
    }
}
