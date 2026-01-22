package ejercicios;

import java.util.Scanner;

public class Ejercicio_016 {

    public Ejercicio_016() {

        /* Pide dos números e imprime su MCD usando el algoritmo de Euclides.
        “Aceptará dos números enteros positivos y obtendrá el resto de la división del mayor entre el menor. 
        Si el resto se hace 0, el M.C.D . será el menor. Si no es así, se dividirá el mayor entre el resto de la última división realizada hasta que uno de los
        restos se haga nulo. El último divisor será el M.C.D”.
        */

        Scanner leer = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("================================================================================");
        System.out.println("  Introduce los dos numero de los cuales quieres sacar el máximo común divisor ");
        System.out.println("================================================================================");
        
        int num1;
        int num2;
       
        do {
        System.out.print(" Número 1 = ");
        num1 = leer.nextInt();
        if (num1 < 0) {
            System.out.println(" ");
            System.out.println("El número debe ser positivo. Introdúzcalo de nuevo.");
            System.out.print(" Número 1 = ");
            num1 = leer.nextInt();
        }
        
        System.out.println("-------------------------------------------------------------------------------");
        
        System.out.print(" Número 2 = ");
        num2 = leer.nextInt();
        if (num2 < 0) {
            System.out.println(" ");
            System.out.println("El número debe ser positivo. Introdúzcalo de nuevo.");
            System.out.print(" Número 2 = ");
            num2 = leer.nextInt();
        }
        System.out.println(" ");
        if (num1 == 0 && num2 == 0)  { 
            System.out.println("Los dos números no pueden ser 0.");
            System.out.println(" ");
        }
        } while (num1 == 0 && num2 == 0);

        int num1aux = num1;
        int num2aux = num2;
        int resto = 0;

        if (num2 > num1) {
            num1 = num2aux;
            num2 = num1aux;
            num2aux = num2;
            num1aux = num1;
        }

        do {
            resto = num1aux % num2aux;
            num1aux = num2aux;
            if (resto == 0) break;
            num2aux = resto;
        } while (resto != 0);

        System.out.println("MCD("+num1+","+num2+") = " + num2aux);
        System.out.println(" ");
        
        leer.close();
        

    }

}
