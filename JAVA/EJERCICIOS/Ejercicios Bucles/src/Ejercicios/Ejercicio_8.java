package Ejercicios;

import java.util.Scanner;

public class Ejercicio_8 {
    @SuppressWarnings("resource")
    public Ejercicio_8() {

        // Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado
        // y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir incrementando
        // de 7 en 7.

        Scanner leer = new Scanner(System.in);

        int w;

        System.out.print("Introduce el numero incial: ");
        int numInicial = leer.nextInt();

        System.out.print("Introduce el numero final: ");
        int numFinal = leer.nextInt();

        if (numFinal != numInicial) {

            for (w = numInicial; w <= numFinal; w+=7 ) {
                System.out.println(w);
            }

        }

        else System.out.println("El número debe ser distinto.");

        leer.close();

    }

}
