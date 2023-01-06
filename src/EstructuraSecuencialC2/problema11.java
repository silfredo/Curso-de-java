/*
 Salario minimo
 */
package EstructuraSecuencialC2;

import java.util.Scanner;

/**
 *
 * @author Silfredo
 */
public class problema11 {
    public static void main(String[] args) {
        //Variables
        float salario = 1160000;
        float Atransporte = 140606;
        float recargo = 1691;
        float DomyFes = 67666;
        
        int Dtrabajados,Hrecargo,DDomyFes;
        float Salarion;
        
        //Entrada
        Scanner teclado = new  Scanner(System.in);
        System.out.println("Digite el numero  dias trabajados: ");
        Dtrabajados = teclado.nextInt();
        System.out.println("Digite el numero de horas de  recargo trabajadas: ");
        Hrecargo = teclado.nextInt();
        System.out.println("Digite el numero dias dominicales y festivos trabajados: ");
        DDomyFes = teclado.nextInt();
        
        //Proceso
        Salarion = (salario/30) * Dtrabajados + (Hrecargo * recargo )+ (DomyFes * DDomyFes )+(Atransporte/2);
        
        //Salida
        System.out.println("");
        System.out.println("el valor a cancelar esta quincena es: " + Salarion);
        
        
        
        
    }
}
