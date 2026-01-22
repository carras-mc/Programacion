package Ejercicios;

import java.util.Scanner;

public class Ejercicio_012 {

    @SuppressWarnings("resource")
    public Ejercicio_012() {

        // Escribe un programa que calcule el factorial de un número entero leído por
        // teclado.

        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numeroIntroducido = leer.nextInt();
        
        /*int numeroIntroducidoAux = numeroIntroducido;
        int numeroIntroducidoAux2 = numeroIntroducido;

        numeroIntroducidoAux2 = numeroIntroducidoAux2 * (numeroIntroducidoAux - 1);
        numeroIntroducidoAux-=1;
        
        if (numeroIntroducido > 1) {
            
        while (numeroIntroducidoAux > 1) {
            
            numeroIntroducidoAux-=1;
            numeroIntroducidoAux2 = numeroIntroducidoAux2 * numeroIntroducidoAux;

        }
        System.out.println("El factorial de " + numeroIntroducido + " es " + numeroIntroducidoAux2);
        }

        else if (numeroIntroducido == 1 || numeroIntroducido == 0) {
            System.out.println("El factorial de " + numeroIntroducido + " es " + 1);
        }

        else System.out.println("El número introducido es negativo.");*/

        // ===========================================================================================

        int t;
        int factorial = 1;
        for (t = 1; t <= numeroIntroducido; t++) {
            factorial*=t;
        }
        System.out.println("El factorial de " + numeroIntroducido + " es " + factorial);

        leer.close();

        

        


    }
}
