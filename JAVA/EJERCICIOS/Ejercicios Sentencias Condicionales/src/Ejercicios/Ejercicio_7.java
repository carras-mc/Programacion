package Ejercicios;

import java.util.Scanner;

public class Ejercicio_7 {
    public Ejercicio_7(){

        // Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int numeroIntroducido = leer.nextInt();

        int ultimaCifra = numeroIntroducido % 10;
        System.out.println("La útlima cifra del número introducido es: " + ultimaCifra);

        leer.close();

    }

}
