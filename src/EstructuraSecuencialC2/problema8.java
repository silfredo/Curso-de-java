/*
 Calcular el interes compuesto generado por un capital depositado durante cierta cantidad de tiempo, a una 
tasa de interes determinada;
 */
package EstructuraSecuencialC2;

import java.util.Scanner;

/**
 *
 * @author Silfredo
 */
public class problema8 {
    public static void main(String[] args) {
        
        //Variable
        Float capital, Tinteres, tiempo, interes,monto;
        
        //Entrada
        Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor digitel el valor del capital a prestar: ");
        capital = teclado.nextFloat();
        System.out.println("Por favor digitel el porcentaje(%) de la tasa de interes: ");
        Tinteres = teclado.nextFloat();
        System.out.println("Por favor digitel en meses el tiempo durante el cual se presta el dinero: ");
        tiempo = teclado.nextFloat();
        
        //Proceso
        monto = //(float)(Math.pow((double)(1 + Tinteres/100),(double)tiempo))*capital;
               (capital * Tinteres) * tiempo;
        interes = monto - capital;
         // Salida
         System.out.println("");
         System.out.println("El valor del monto producido es: "+ monto + 
                 " y el interes ganado es: "+ interes);
    }
    
}
