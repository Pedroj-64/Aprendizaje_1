import java.util.*;

import javax.swing.*;
/*
 * el %1.2f hace referencia a los decimales el "2" es la cantidad de decimales y todo esto se guia gracias a printf el cual 
 * formate lo que va printear
 */
public class FormateandoNumeros {

    public static void main(String[] args)  {
         
        /*double i=560.89;

        System.out.printf("%1.2f",i/3);
        */

        /*
        
        String num1=JOptionPane.showInputDialog("introduce el numero");

        double numerofot=Double.parseDouble(num1);

        var  resultado=Math.sqrt(numerofot);

        String formateando=String.format("%1.2f", resultado);

        System.out.print("La raiz cuadrada de " + num1 + " Es " + formateando);
        */

        Scanner number=new Scanner(System.in);
        
        System.out.println("introduce por favor un numero: ");

        double numero=number.nextDouble();

        var raiz=Math.sqrt(numero);

        number.close();

        System.out.print("la raiz de " + numero + " es ");
        System.out.printf("%1.2f", raiz);

        
    }
}
