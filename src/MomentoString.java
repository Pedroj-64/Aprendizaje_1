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
        char caracter=juju.charAt(6);
        String subcadena=juju.substring(0, 7);
        boolean igualdad=juju.equals(bolsita);
        boolean igualdad2=juju.equalsIgnoreCase(bolsita);
        String frasetwo=juju.substring(2);
        char[] frasechar=juju.toCharArray();  


        System.out.println("hola mundo mi nombre es: " + juju);

        System.out.println("Mi nombre tiene " + escala + " caracteres");

        System.out.println("El nombre " + juju + " tiene como caracter ubicado en la posicion final: " + caracter + " y como letra inicial " + juju.charAt(0) );

        System.out.println("Tambien me llaman " + subcadena);

        System.out.println(frasetwo);

        System.out.println(frasechar);

        System.out.println(juju +" no es igual a " + bolsita + " de hecho es "+ igualdad + " aunque se ignoren mayusculas se puede decir que " + igualdad2);
    }
}
