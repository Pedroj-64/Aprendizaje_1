public class EjemploSufijos {
    public static void main(String[] args) {
        // Ejemplo con long
        long numeroLong = 3113376938L; // Usar 'L' para indicar que es un long
        System.out.println("Número long: " + numeroLong);

        // Ejemplo con float
        float numeroFloat = 3.14F; // Usar 'F' para indicar que es un float
        System.out.println("Número float: " + numeroFloat);

        // Ejemplo con double
        double numeroDouble = 3.14; // Los literales decimales son double por defecto
        double numeroDoubleConSufijo = 3.14D; // Usar 'D' es opcional pero claro
        System.out.println("Número double: " + numeroDouble);
        System.out.println("Número double con sufijo: " + numeroDoubleConSufijo);

        // Ejemplo con byte
        byte numeroByte = (byte) 127; // Usar casting explícito para byte
        System.out.println("Número byte: " + numeroByte);

        // Ejemplo con short
        short numeroShort = (short) 32767; // Usar casting explícito para short
        System.out.println("Número short: " + numeroShort);
    }
}
