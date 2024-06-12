public class CalculosConMath {
    public static void main(String[] args) {
        
        //double resultadoRaiz= Math.sqrt(9);

        int base=6;
        int exponente=2;
        String mujer;

        mujer="Es el resultado de la potencia de base: " + base + " y con exponente: " + exponente;
        

        int resultado=(int)Math.pow(base, exponente);

        System.out.println(resultado + " " + mujer );


    }


}
