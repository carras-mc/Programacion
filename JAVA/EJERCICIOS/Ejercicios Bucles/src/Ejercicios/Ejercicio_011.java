package Ejercicios;

import java.util.Scanner;

public class Ejercicio_011 {
    public Ejercicio_011() {

        // Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe dar la posición
        // (o posiciones) contando de izquierda a derecha que ocupa ese dígito en el número introducido.

        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numeroIntroducido = leer.nextInt();
        System.out.print("Introduce el dígito que quieras ubicar: ");
        int digitoUbicar = leer.nextInt();

        int numeroIntroducidoAux;
        int numeroInvertido = 0;
        int posicion = 0;

        numeroIntroducidoAux = numeroIntroducido;

        while (numeroIntroducidoAux > 0) {
            
            int ultimoDigito = numeroIntroducidoAux % 10;
            numeroIntroducidoAux = numeroIntroducidoAux / 10;
            numeroInvertido = numeroInvertido * 10 + ultimoDigito;

        }

        while (numeroInvertido > 0) {

            int ultimoDigitoNumInvertido = numeroInvertido % 10;
            numeroInvertido = numeroInvertido / 10;
            posicion++;


            if (ultimoDigitoNumInvertido == digitoUbicar) {

                System.out.println("El número " + digitoUbicar + " está en la posición " + posicion);

            }

            leer.close();

        }

    }

}
