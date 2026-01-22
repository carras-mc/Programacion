package ejercicios;

import java.util.Scanner;

public class Ejercicio_011 {

     public Ejercicio_011() {

        // Números perfectos      Un número es perfecto si la suma de sus divisores (sin contar él
        // mismo) es igual al número.

        // Por ejemplo: 6 → 1 + 2 + 3 = 6.

        System.out.println("===================================================================");

        Scanner leer = new Scanner(System.in);

        System.out.print(" Introduzca el número que quieras comprobar si es perfecto: ");
        int num = leer.nextInt();

        int suma_divisores = 0;

        for (int i = 1; i < num; i++) {
            
            if (num % i == 0) suma_divisores = suma_divisores + i;

        }

        System.out.println("===================================================================");
        if (suma_divisores == num) System.out.println("El número es perfecto. Máquina. Como tu ;)");
        else System.out.println("El número no es perfecto. Parguela");
        System.out.println("------------------------------------------------------------------");

        leer.close();
    }

}
