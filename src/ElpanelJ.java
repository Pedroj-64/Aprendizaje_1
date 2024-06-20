import javax.swing.*;

public class ElpanelJ {
    public static void main(String[] args)  {
      
        String nombreUsuario=JOptionPane.showInputDialog("introduce el nombre rey");

        String edad=JOptionPane.showInputDialog("dame la edad");
        
        int edad2=Integer.parseInt(edad);

        edad2++;

        System.out.println("Hola "+ nombreUsuario + " tienes " + edad + " años ");
        System.out.println("como dato el años que viene tendras " + (edad2++));
    }
}
