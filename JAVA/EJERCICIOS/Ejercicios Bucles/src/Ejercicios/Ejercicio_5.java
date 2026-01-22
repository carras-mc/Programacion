package Ejercicios;

import java.util.Scanner;


public class Ejercicio_5 {
    public Ejercicio_5() {

        // Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A priori,
        // el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir los datos
        // cuando meta un número negativo. 

        Scanner leer = new Scanner(System.in);

        int numCantidad = 0;
        int numIntroducido;
        int suma = 0;
        System.out.println("|===========================================================================================|");
        System.out.println("| A continuación introducirá los números de los que desee hacer la media.                   |");
        System.out.println("| Cuando haya terminado de introducir los números, introduzca un número negativo para salir |");
        System.out.println("|===========================================================================================|");

       
        do {
            System.out.println("Introduce un número para hacer la media: ");
            numIntroducido = leer.nextInt();
            if (numIntroducido >= 0) {
            suma = suma + numIntroducido;
            numCantidad++;
            }
            else;
        } while (numIntroducido >= 0);

        double media = suma / (double) numCantidad;
        System.out.println("La media es de = " + media);

        leer.close();

    }

}
