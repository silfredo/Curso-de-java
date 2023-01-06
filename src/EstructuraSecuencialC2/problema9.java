/*
 Crear un programa para encontrar el area de un circulo
 */
package EstructuraSecuencialC2;

import java.util.Scanner;

/**
 *
 * @author Silfredo
 */
public class problema9 {
    public static void main(String[] args) {
        //Variable
        float Rcirculo,Acirculo;
        float PI = 3.14159F;
         
        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Diguite el radio del circulo: ");
        Rcirculo = teclado.nextFloat();
        
        //Proceso
        Acirculo = PI * (Rcirculo * Rcirculo);
        
        //Salida
        System.out.println("");
        System.out.println("El area del circulo es: "+ Acirculo);
    }
}
