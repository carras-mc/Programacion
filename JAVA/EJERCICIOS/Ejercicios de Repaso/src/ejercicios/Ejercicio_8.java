package ejercicios;

import java.util.Scanner;

public class Ejercicio_8 {

    public Ejercicio_8() {

        /* Calcular el producto de dos
        números enteros positivos mediante el denominado "algoritmo ruso del
        producto": consiste en duplicar el primer factor y dividir (cociente entero)
        por 2 el segundo, obteniendo un producto equivalente, salvo si el segundo es
        impar, en cuyo caso es necesario acumular previamente el primero en donde se va
        a obtener el resultado. El proceso termina cuando el segundo factor se hace 0.
        Por ejemplo: 25 * 6 */

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce dos números enteros para hallar su producto.");
        System.out.println("=========================================================");
        System.out.print("Introduce el primer número: ");
        int numero1 = leer.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = leer.nextInt();
        System.out.println("=========================================================");

        int producto = 0;

        do {
            if (numero1 % 2 != 0) {
                producto = numero2 + producto;  
            }
            numero1 = numero1 / 2;
            numero2 = numero2 *2;

        }   while (numero1 > 0);

        System.out.println("El producto es = " + producto);

        leer.close();
          
    }

}
