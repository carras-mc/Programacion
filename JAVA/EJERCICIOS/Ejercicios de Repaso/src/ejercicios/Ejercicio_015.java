package ejercicios;

import java.util.Scanner;

public class Ejercicio_015 {

    public Ejercicio_015() {
    
        /* Adivina el número
        El programa genera un número aleatorio entre 1 y 100.
        El usuario debe adivinarlo en el menor número de intentos posibles. Maximo intentos 5.
        Después de cada intento, se le dirá si el número es mayor o menor. */

        Scanner leer = new Scanner(System.in);
        int numRandom = (int)(Math.random()* 100);
        int count = 7;
        
        System.out.println("===============================================================================");
        System.out.println("    A ver chaval, tienes que adivinar un número del 1 al 100. Inténtalo: ");
        System.out.println("===============================================================================");

        do {
            System.out.print(" Pon un número del uno al cien, porfi: ");
            int numInput = leer.nextInt();
            if (numInput >= 0 && numInput <= 100  ) {
                
                if (numRandom > numInput) {
                    System.out.println(" Más alto. guapeton.");
                }

                if (numRandom < numInput) {
                    System.out.println(" Tas pasado. tanquilo.");
                }
                if (numInput == numRandom) {
                    System.out.println(" ACERTASTE!! Que máquina ere. Era el " + numRandom);
                }
                count--;
                System.out.println(" Te quedan " + count + " intentos.");
                System.out.println(" ");
            }
        
        } while (count > 0);
        System.out.println(" Que malo eres mamón. El número era " + numRandom+".");

        leer.close();
    }

}      
            
            
      
      
    
   
