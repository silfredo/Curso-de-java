
import java.util.Scanner;

/*
 Dado un numero de n digitos, devolver el numero en orden inverso
 */

/**
 *
 * @author Silfredo
 */
public class problema6 {
    public static void main(String[] args) {
        //Variables
        int numero,ni,r;
        
        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        numero  = teclado.nextInt();
        
        //Proceso
        r = numero % 10;
        numero = numero / 10;
        ni = r * 10;
        
        r = numero % 10;
        numero = numero / 10;
        ni = (ni + r) * 10;
        
        r = numero % 10;
        numero = numero / 10;
        ni = (ni + r) * 10;
        
        r = numero % 10;
        numero = numero / 10;
        ni = (ni + r) * 10;
        
        ni = ni + numero;
        
        //Salida
        System.out.println("");
        System.out.println("Inverso: "+ ni);
        
        
    }
}
