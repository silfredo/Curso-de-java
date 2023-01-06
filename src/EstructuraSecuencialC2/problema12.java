/*
 Dado dos numeros enteros(Z) a y b, hallar a + b y a - b.
 */
package EstructuraSecuencialC2;

import java.util.Scanner;

/**
 *
 * @author Silfredo
 */
public class problema12 {
    public static void main(String[] args) {
        //varialble
        int num1, num2, suma, resta;
        
        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Digite un segundo numero: ");
        num2 = teclado.nextInt();
        
        //Proceso
        suma = num1 + num2;
        resta = num1 - num2;
        
        //Salida
        System.out.println("");
        System.out.println("El resultado de la suma es: "+ suma);
        System.out.println("El resultado de la resta es: " + resta);
    }
}
