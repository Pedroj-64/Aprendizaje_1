public class Nada {
    public static void main(String[] args) {
        int num=15;
        int resultado=180;
        String mensaje=imprimir(num, resultado);
        mostrarMensaje(mensaje);
        
    }
    public static String imprimir(int num,int resultado){
        String mensaje=("El resultado del " + num + " y su factorial es: " + resultado );
        return mensaje;

    }
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

}
