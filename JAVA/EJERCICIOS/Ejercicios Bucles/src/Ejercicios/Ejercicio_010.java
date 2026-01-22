package Ejercicios;

import java.util.Scanner;

public class Ejercicio_010 {
    public Ejercicio_010() {

        // Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce el número que quieras invertir: ");
        int numeroIntroducido = leer.nextInt();
        int numeroParaConvertir = numeroIntroducido;
        int numeroInvertido = 0;

        while (numeroParaConvertir > 0) {

            int ultimoDigito = numeroParaConvertir % 10;
            numeroInvertido = numeroInvertido * 10 + ultimoDigito;
            numeroParaConvertir/=10;
            
        }

        System.out.print("El número invertido es: " + numeroInvertido);

        leer.close();

    }

}
