public class MomentoString {
   /*
     nombreDeLaClase.length() devuelve la longitud de la cadena de string
    
     charAT(n) "n" siendo una posicion de 0 a la larges de la cadena, este metodo devuelve el caracter de la posicion deseada

     substring(x,y) extrae una subcadena de texto de la cadena de texto dada siendo X desde que parte inicia y la Y el final contando 
     los caracteres desde 0
    
     equals(cadena) verifica si dos cadenas de texto son iguales,devolviendo true o false
     equalsIgnoreCase es la variacion sin destingir mayuscula y minuscula

     todas tienen la contruccion de objeto.metodo 
    */
    public static void main(String[] args) {

        final String juju="Pedrito";
        final String bolsita="pepito";

        int escala=juju.length();
        char caracter=juju.charAt(3);
        String subcadena=juju.substring(0, 5);
        boolean igualdad=juju.equals(bolsita);
        boolean igualdad2=juju.equalsIgnoreCase(bolsita);



        System.out.println("hola mundo mi nombre es: " + juju);

        System.out.println("Mi nombre tiene " + escala + " caracteres");

        System.out.println("El caracter ubicado en la posicion 3 en mi nombre es: " + caracter);

        System.out.println("Tambien me llaman " + subcadena);


    }
}
