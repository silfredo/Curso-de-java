
import java.util.Scanner;

/*
 Hallar el ciciente y el residuo(resto)de dos numeros enteros
 */

/**
 *
 * @author Silfredo
 */
public class problema2 {
    public static void main(String[] args){
    
        //Variales 
        int num1, num2, cociente, residuo;
        
        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Digite un segundo numero: ");
        num2 = teclado.nextInt();
        
        //Proceso
        cociente = num1 /num2;
        residuo = num1 % num2;
        
        //Salida
        System.out.println("");
        System.out.println("El valor del cociente es: "+ cociente);
        System.out.println("El valor del residuo es: "+ residuo);
        
        
        
    }
}
