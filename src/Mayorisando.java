import java.util.Scanner;

public class Mayorisando {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int[] nuwNum=numeracion(entrada);
        String compi=comprobacion(nuwNum);
        String generar=generarMensaje(compi, nuwNum);
        mostrarMensaje(generar);
        

        entrada.close();
    }

    public static int[] numeracion(Scanner entrada){
        int[] numeritos=new int[4];
        System.out.println("Bienvenido aqui calcularemos el mayor de tres numeros");
        System.out.println("Por ingrese el primer valor:");
        numeritos[0]=entrada.nextInt();
        System.out.println("Por ingrese el segundo valor:");
        numeritos[1]=entrada.nextInt();
        System.out.println("Por ingrese el tercero valor:");
        numeritos[2]=entrada.nextInt();
        return numeritos;
    }
    public static String comprobacion(int[] numeritos){
        String mensaje;
        int mayor=numeritos[0];
        for (int i = 0; i < numeritos.length; i++){
            if(mayor<numeritos[i]){
                mayor=numeritos[i];
            }
        }
        mensaje="el numero mayor es: " + mayor;
        return mensaje;
    }
    public static String generarMensaje(String mensaje,int[] numeritos){
        String mensaje1=mensaje;
        return mensaje1;

    }

    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }



}
