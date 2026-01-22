package ejercicios;

import java.util.Scanner;

public class Ejercicio_017 {

    @SuppressWarnings("resource")
    public Ejercicio_017(){

        /* Factorización en primos
        Enunciado:
        Pide un número entero y muestra su descomposición en factores primos.
        Ejemplo:
        60 = 2 × 2 × 3 × 5 */

        Scanner leer = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.print("Introduce el número entero que quieras descomponer en factores primos:  ");
        int numInput = leer.nextInt();
        System.out.println("============================================================================");
        int numInputAux = numInput;
        int fact;
        String resultado;


        for (fact = 2; fact <= (numInput); fact++) {
           int resto = numInputAux % fact;
            if (resto != 0) {

            }
            else if (resto == 0) {
                numInputAux = numInputAux / fact;
                /* System.out.println(fact); */
                Integer facInteger = fact;
                String facString = Integer.toString(facInteger);
                facString = facString + " x ";
                resultado = facString; 
                System.out.print(resultado);
                fact--;
            } 
        } 
        
        System.out.println(" ");
        
        leer.close();
    }

}
