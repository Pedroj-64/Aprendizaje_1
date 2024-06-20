/*
 Algo importante de ver es que en las clase de tipo static no es necesario inicializarla desde antes para utilizarla, es semejeante a la clase
 math la cual se pone su nombre.el metodo que se desea ej: "Math.sqrt()" 
 cosa que no sucede con las que no tienen ese sufijo de "static" el ejemplo mas claro es la clase Scanner utilizada algunas veces para imputear desde consola
 esta necesita ser instanciada primero antes de ser utilizada de la siguiente manera
         Scanner entrada=new Scanner(System.in); o  MiClase objeto = new MiClase(); 
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
