package Ejercicios;

import java.util.Scanner;

public class Ejercicio_9 {
    public Ejercicio_9 () {

        // Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos
        // números se han introducido, la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para
        // indicar el final de la introducción de datos pero no se incluye en el cómputo.

        Scanner leer = new Scanner(System.in);

        int cantidadNumerosIntroducidos = 0;
        int numeroIntroducido;
        int numeroParMayor = 0;
        int mediaNumerosImpar = 0;
        int numerosImpares = 0;
        int cantidadImparesIntroducidos = 0;

        System.out.println("=========================================================================================================");
        System.out.println(" La función de este programa es contar la cantidad de número introducidos, hacer la media de los impares");
        System.out.println(" y mostrar cual fue el mayor número par introducido. Para salir del bucle escribe un número negativo. ;)");
        System.out.println("=========================================================================================================");
        System.out.println("                        ");

        do {

            System.out.print("Introduce un número: ");
            numeroIntroducido = leer.nextInt();
            

            if (numeroIntroducido % 2 == 0 && numeroIntroducido >= 0) {

                cantidadNumerosIntroducidos++;
                
                if (numeroParMayor < numeroIntroducido) {

                    numeroParMayor = numeroIntroducido;

                }

                else continue;

            }

            else if (numeroIntroducido >= 0) {

                cantidadNumerosIntroducidos++;
                cantidadImparesIntroducidos++;

                numerosImpares = numerosImpares + numeroIntroducido;
                mediaNumerosImpar = numerosImpares / cantidadImparesIntroducidos;

            }



        }

        while (numeroIntroducido >= 0);
        System.out.println("                                                           ");
        System.out.println("----------------------------------------------------------");
        System.out.println("         Cantidad de números introducidos: " + cantidadNumerosIntroducidos);
        System.out.println("----------------------------------------------------------");
        System.out.println("         Media números impares: " + mediaNumerosImpar);
        System.out.println("----------------------------------------------------------");
        System.out.println( "         El número par mayor es: " + numeroParMayor);
        System.out.println("----------------------------------------------------------");
        
        leer.close();

    }

}
