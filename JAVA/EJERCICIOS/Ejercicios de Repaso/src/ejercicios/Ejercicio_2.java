package ejercicios;

import java.util.Scanner;

public class Ejercicio_2 {
    public Ejercicio_2() {

        // Introducir un número entero por teclado que se supone que es un año. Indicar si es bisiesto o no y por qué motivo 
        // (P.e.: “Es bisiesto por ser múltiplo de 4 y no de 100”. P.e.: “Es bisiesto por ser múltiplo de 400”. P.e.: 
        // “No es bisiesto por ser múltiplo de 100”).

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        int año = leer.nextInt();

        if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
            System.out.println("El año es bisiesto.");
        }
        else if (año % 4 != 0 || año % 100 == 0 && año % 400 != 0) {
            System.out.println("El año no es bisiesto.");
        }

        leer.close();

    

    }

}
