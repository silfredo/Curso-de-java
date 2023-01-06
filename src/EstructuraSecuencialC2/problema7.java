/*
 Determinar la suma de los N numeros enteros positivos (Z+). 
 Use la siguiente formula S= (numero * (numero + 1)) / 2
    
 */
package EstructuraSecuencialC2;

import java.util.Scanner;

/**
 *
 * @author Silfredo
 */
public class problema7 {
    public static void main (String[] args){
    //Variables
    int numero, suma;
    
    //Entrada
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite un numero: ");
    numero = teclado.nextInt();
    
    //Proceso
    suma = (numero * (numero + 1)) / 2;
    
    //Salida
    System.out.println("");
    System.out.println("La suma de los numeros enteros positivo antes del: "+ numero + " es :" + suma);
        
    }
}
