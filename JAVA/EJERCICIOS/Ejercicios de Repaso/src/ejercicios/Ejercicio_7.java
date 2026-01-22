package ejercicios;

import java.util.Scanner;

public class Ejercicio_7 {

    public Ejercicio_7() {

        // Dados dos números enteros
        // positivos, hallar el mínimo común múltiplo.
        // Método a usar:
        // Se van hallando los sucesivos múltiplos del mayor de ellos hasta encontrar uno
        // que sea divisible por el más pequeño.

        Scanner leer = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        boolean parar_bucle = false;
        int multiplicador = 1;

        do {
        System.out.println("Introduce dos números enteros positivos.");
        System.out.println("========================================");
        System.out.print("Número 1 = ");
        numero1 = leer.nextInt();
        System.out.print("Número 2 = ");
        numero2 = leer.nextInt();
        System.out.println("========================================"); }
        while (numero1 < 0 || numero2 < 0);

        if (numero1 < numero2) {
            int numero1aux = numero1;
            int numero2aux = numero2;

            numero1 = numero2aux;
            numero2 = numero1aux;
            
        }

        while (parar_bucle == false) {
            int min_comun_multiplo = numero1 * multiplicador;
            if (min_comun_multiplo % numero2 == 0) {
                System.out.println("El mínimo común múltiplo es = " + min_comun_multiplo);
                parar_bucle = true;
            }
            else multiplicador++;
        }

        leer.close();


  



    }

}
