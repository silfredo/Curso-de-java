
import java.util.Scanner;

/*
 Hallar la radicacion a, donde a y n pertenecen a z (numeros enteros positivos)
 */

/**
 *
 * @author Silfredo
 */
public class problema5 {
    public static void main(String[] args) {
        //Variables
        int a, n, radicacion;
        
        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el valor de a: ");
        a = teclado.nextInt();
        System.out.println("Digite el valor de n: ");
        n = teclado.nextInt();
        
        //Proceso
        radicacion = (int)Math.pow((double)a,(1/(double)n));
        
        //Salida
        System.out.println("");
        System.out.println("El resultado de la radicacion es: "+ radicacion);
        
    }
    
}
