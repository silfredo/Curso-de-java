/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraSecuencialC2;

import java.util.Scanner;

/**
 *
 * @author Silfredo
 */
public class problema10 {

    public static void main(String[] args) {
        
        //Constantes
        int Hora = 360;
        int Minuto = 60;
        
        //Variables
        int Tsegundo,hora,minuto,segundo;
        
        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el tiempo en segundo: ");
        Tsegundo = teclado.nextInt();
        
        //Proceso
        hora = Tsegundo / Hora;
        Tsegundo = Tsegundo % Hora;
        minuto = Tsegundo / Minuto;
        segundo = Tsegundo % Minuto;
        
        // Salida
        System.out.println("");
        System.out.println("HORAS: "+ hora);
        System.out.println("MINUTOS: "+ minuto);
        System.out.println("SEGUNDO: "+ segundo);
        
    }
}
