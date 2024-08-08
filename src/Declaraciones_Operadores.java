/*
 * recordemos los operadores basicos:
 * 

1. **Operadores Aritméticos:**
   - `+`: Suma dos valores.
   - `-`: Resta el segundo valor del primero.
   - `*`: Multiplica dos valores.
   - `/`: Divide el primer valor por el segundo.
   - `%`: Calcula el residuo de la división (módulo).

2. **Operadores de Asignación:**
   - `=`: Asigna un valor a una variable.
   - `+=`: Incrementa el valor de una variable con otro valor.
   - `-=`: Decrementa el valor de una variable con otro valor.
   - `*=`: Multiplica el valor de una variable por otro valor.
   - `/=`: Divide el valor de una variable por otro valor.

3. **Operadores de Comparación:**
   - `==`: Comprueba si dos valores son iguales.
   - `!=`: Comprueba si dos valores no son iguales.
   - `<`: Comprueba si el primer valor es menor que el segundo.
   - `>`: Comprueba si el primer valor es mayor que el segundo.
   - `<=`: Comprueba si el primer valor es menor o igual al segundo.
   - `>=`: Comprueba si el primer valor es mayor o igual al segundo.

4. **Operadores Lógicos:**
   - `&&` (AND): Devuelve `true` si ambas condiciones son verdaderas.
   - `||` (OR): Devuelve `true` si al menos una de las condiciones es verdadera.
   - `!` (NOT): Niega el valor de una condición.

5. **Operadores de Incremento y Decremento:**
   - `++`: Incrementa en 1 el valor de una variable.
   - `--`: Decrementa en 1 el valor de una variable.

6. **Operadores de Bitwise (a nivel de bits):**
   - `&`: AND a nivel de bits.
   - `|`: OR a nivel de bits.
   - `^`: XOR a nivel de bits.
   - `~`: NOT a nivel de bits (complemento).

 */

public class Declaraciones_Operadores {
  public  static void main(String args[]) {
    
    //Es posible inicializar varias variables de golpe para luego darles valor (declarar)
    int a,b,c;

    final float apulgadas=(float) 2.54;

    float cm=6;

    float solucion=cm/apulgadas;

    System.out.println("los "+cm + " cm " + "son "+solucion +" pulgadas");
  }

     
}
