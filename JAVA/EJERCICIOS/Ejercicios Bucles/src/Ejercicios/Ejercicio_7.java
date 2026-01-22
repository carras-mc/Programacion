package Ejercicios;

import java.util.Scanner;

public class Ejercicio_7 {
    public Ejercicio_7() {

        // Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel que
        // sólo es divisible entre él mismo y la unidad.

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce el número que quieras comprobar si es primo: ");
        int num = leer.nextInt();
        int comprobacion = 2;

        do {
            int resto = num % comprobacion;
            comprobacion++;

            if ( resto == 0 || num == 1) {
                System.out.println("El número no es primo");
            }

            else System.out.println("El número es primo");
            break;

        }

        while (comprobacion < num);

        leer.close();

    }

}
