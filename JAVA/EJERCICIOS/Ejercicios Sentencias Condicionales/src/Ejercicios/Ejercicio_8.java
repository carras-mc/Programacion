package Ejercicios;

import java.util.Scanner;

public class Ejercicio_8 {
    public Ejercicio_8(){

        // Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten
        // números de hasta 5 cifras.

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un numero de hasta 5 cifras: ");
        int num = leer.nextInt();
        int primeraCifra; 

        if (num >= -99 && num <= 99){
            primeraCifra = num / 10;
            System.out.println("La primera cifra es: " + primeraCifra);
        }
        else if (num >= -999 && num <= 999){
            primeraCifra = num / 100;
            System.out.println("La primera cifra es: " + primeraCifra);

        }
        else if (num >= -9999 && num <= 9999){
            primeraCifra = num / 1000;
            System.out.println("La primera cifra es: " + primeraCifra);
        }
        else if (num >= -99999 && num <= 99999){
            primeraCifra = num / 10000;
            System.out.println("La primera cifra es: " + primeraCifra);
        }
        else {
            System.out.println("El número introducido no es válido");
        }

        leer.close();

    }

}
