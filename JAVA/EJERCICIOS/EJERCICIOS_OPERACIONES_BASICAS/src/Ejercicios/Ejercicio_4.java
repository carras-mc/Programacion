package Ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
    public Ejercicio_4(){
        System.out.println("Ejercicio 4");

        // Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA).Pide los
        // datos por teclado.

       Scanner leer = new Scanner(System.in);
        
       System.out.print("Introduce la base imponible: ");
       double baseImponible = leer.nextDouble();
       double total = baseImponible + (baseImponible * 0.21);

       System.out.print("El total de la factura es = " + total);

       leer.close();


        
        
    }

}
