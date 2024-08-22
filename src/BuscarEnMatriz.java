public class BuscarEnMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int numeroABuscar = 5;
        String resultado = buscarNumero(matriz, numeroABuscar);
        System.out.println(resultado);
    }

    public static String buscarNumero(int[][] matriz, int numero) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == numero) {
                    return "Encontrado en la posición: (" + fila + ", " + columna + ")";
                }
            }
        }
        return "No encontrado";
    }
}
