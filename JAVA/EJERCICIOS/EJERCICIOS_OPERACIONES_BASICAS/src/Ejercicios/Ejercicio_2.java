package Ejercicios;

import java.util.Scanner;

public class Ejercicio_2 {
    public Ejercicio_2(){

    // Realiza un conversor de euros a pesetas.
    
    Scanner leer = new Scanner(System.in);
    System.out.print("Introduce la cantidad de euros a convertir: ");
    double euros = leer.nextDouble();

    double pesetas = euros * 166.386;
    System.out.println("La cantidad introducida es = " + pesetas + " pesetas");

  
    leer.close();
    





    }

}
