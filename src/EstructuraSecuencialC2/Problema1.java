
import java.util.Scanner;

/*
 Dados dos numeros ingresados por teclado, hallar la suma, resta,multiplicacion,division.
 */

/**
 *
 * @author Silfredo
 */
public class Problema1 {
    public static void main(String[] args) {
        // Variables
        int num1,num2,suma,resta, multiplicacion,division;
        
        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite su primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Digite su segundo numero: ");
        num2 = teclado.nextInt();
        
        //Proceso
        suma = num1 + num2 ;
        resta = num1 - num2 ;
        multiplicacion = num1 * num2 ;
        division = num1 / num2 ;
        
        //Salida
        System.out.println("");
        System.out.println("El resultado de la suma es: "+ suma);
        System.out.println("El resultado de la resta es: "+ resta);
        System.out.println("El resultado de la multiplicacion es: "+ multiplicacion);
        System.out.println("El resultado de la division es: "+ division);
        
        
    }
}
