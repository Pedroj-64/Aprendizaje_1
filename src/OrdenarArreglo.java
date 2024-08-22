public class OrdenarArreglo {
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 9, 1, 5, 6};
        ordenarArreglo(arreglo);
        System.out.println("Arreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }

    public static void ordenarArreglo(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar arreglo[j] y arreglo[j + 1]
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true;
                }
            }
            // Si no hubo intercambios en la pasada, el arreglo ya está ordenado
            if (!intercambio) break;
        }
    }
}
