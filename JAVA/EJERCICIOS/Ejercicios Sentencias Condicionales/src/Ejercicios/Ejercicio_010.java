package Ejercicios;

import java.util.Scanner;

public class Ejercicio_010 {
    public Ejercicio_010(){

        // Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa. Se permiten
        // números de hasta 5 cifras.

        // Creo que el math.abs no es necesario.

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce el número que quieras comprobar si es capicúa: ");
        int num = leer.nextInt();

        int numIntroducido = num;
        num = Math.abs(num);
        int numInvertido = 0;

        while (num>0) {
            int ultimoDigito = num % 10;
            numInvertido = numInvertido * 10 + ultimoDigito;
            num = Math.abs(num/10);
        }

        //System.out.println(num);
        //System.out.println(numInvertido);

        if (numIntroducido == numInvertido) {
            System.out.println("El número es capicúa.");
        }
        else System.out.println("El número no es capicúa.");
        
        leer.close();

       

        

    }

}
