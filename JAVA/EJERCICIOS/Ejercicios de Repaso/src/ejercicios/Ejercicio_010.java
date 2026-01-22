package ejercicios;

import java.util.Scanner;

public class Ejercicio_010 {

    public Ejercicio_010() {

        // Muestra todos los números primos que hay entre dos dados. Indicar cuantos
        // se han encontrado

       Scanner leer = new Scanner(System.in);

       int num1;
       int num2;

        System.out.println("======================================");
        do {
        System.out.print("Introduce el primer número: ");
        num1 = leer.nextInt();
        } while (num1 < 0);

        do {
        System.out.print("Introduce el segundo número: ");
        num2 = leer.nextInt();
        } while (num2 < 0);
         
        System.out.println("======================================");
        System.out.println("PRIMOS ENTRE LOS DOS NÚMEROS");
        System.out.println("--------------------------------------");
        
        int resto;
       
        for (int num1aux = num1; num1aux <= num2; num1aux++) {
            if (num1aux == 2) System.out.println(num1aux);

            for (int i = 2; i < num1aux; i++) {
                resto = num1aux % i;
                if (resto == 0) break;
                if (i == num1aux - 1) System.out.println(num1aux);  
                 
            }
        }
        
        System.out.println("--------------------------------------");
       
        leer.close();
        

    }

}
