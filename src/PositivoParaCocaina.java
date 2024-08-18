import java.util.Scanner;

public class PositivoParaCocaina {


    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num1=entradaNum1(entrada);
        String comprobar=comprobar(num1);
        String mensaje=generarMensaje(comprobar, num1);
        mostrarMensaje(mensaje);
        entrada.close();
        
    }

    public static int entradaNum1(Scanner entrada){
        System.out.println("Bienvenido al programa que averigua la positidad de un numero");
        System.out.println("por favor ingrese el numero que quiere saber su positividad");
        int num1=entrada.nextInt();
        return num1;

    }

    public static String comprobar(int num1){
        String mensaje="";
        if (num1>0) {
            mensaje="El numero es positivo";
        }else if (num1<0) {
            mensaje="El numero es negativo";  
        }else if (num1==0) {
            mensaje="El numero es 0";
        }else{
            mensaje="valor invalido";
        }
        return mensaje;
    }
    public static String generarMensaje(String mensaje,int num1){
        String mensaje1="el numero " + num1 +" es: " +  mensaje;
        return mensaje1;

    }

    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
