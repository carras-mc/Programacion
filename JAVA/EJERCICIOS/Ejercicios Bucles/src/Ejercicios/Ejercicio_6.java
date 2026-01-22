package Ejercicios;

import java.util.Scanner;

public class Ejercicio_6 {
    public Ejercicio_6() {

        // Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de
        // Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que los términos
        // son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.

        Scanner leer = new Scanner(System.in);
        int A = 0;
        int B = 1;
        int C = 0;
        
        System.out.print("¿Cuántos términos de fibonacci quieres mostrar? ");
        int cantidadTerminos = leer.nextInt();
        System.out.println("--------------");
        
        while (cantidadTerminos > 0) {
            System.out.print(A);
        
            C = A + B;
            A = B;
            B = C;

            System.out.print(" , ");
        
           cantidadTerminos--;
        }

        leer.close();



    }

}
