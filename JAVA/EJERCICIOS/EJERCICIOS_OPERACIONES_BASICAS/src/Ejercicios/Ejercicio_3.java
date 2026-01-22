package Ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {
    public Ejercicio_3(){
    Scanner leer = new Scanner(System.in);

    // Realiza un conversor de pesetas a euros.

    System.out.print("Introduce cuántas pesetas quieres convertir a euros = ");
    double pesetas = leer.nextDouble();

    double euros = pesetas / 166.386;
    System.out.println("Las pesetas introducidas = " + euros + " euros");

   leer.close();
    


    }

}
