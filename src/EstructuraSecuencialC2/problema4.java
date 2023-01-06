
import java.util.Scanner;

/*
 Hallar la potencia de a^n, donde a y n pertenecen a Z+(numeros enteros positivos)
 */

/**
 *
 * @author Silfredo
 */
public class problema4 {
    public static void main(String[] args) {
        //Variables
        int a,n,potencia;
        
        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el valor de a: ");
        a = teclado.nextInt();
        System.out.println("Digite el valor de n: ");
        n = teclado.nextInt();
        
        //Proceso
        potencia = (int) Math.pow((double)a,(double)n);
        
        //Salida
        System.out.println("");
        System.out.println("El resultadod de la potencia es: "+ potencia);
    }
    
}
