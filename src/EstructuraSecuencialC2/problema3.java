
import java.util.Scanner;

/*
 Dado el valor de venta de un producto, hallar el IGV(19%)y el precio de venta
 */

/**
 *
 * @author Silfredo
 */
public class problema3 {
    public static void main(String[] args) {
        //Variables
        double Vventa,Pventa,igv;
        
        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el valor del producto: ");
        Vventa = teclado.nextDouble();
        
        // Proceso
        igv = Vventa * 0.19;
        Pventa = Vventa + igv;
        
        //Salida
        System.out.println("");
        System.out.println("El valor del IGV es: "+ igv);
        System.out.println("El precio de venta del producto es: "+ Pventa); 
    }
         
    
}
