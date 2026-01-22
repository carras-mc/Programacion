package ejercicios;

import java.util.Scanner;

public class Ejercicio_014 {

    public Ejercicio_014() {

        System.out.println("===================================================================");

        // Conversión a binario

        // Pide un número entero y muestra su representación en binario. Utilizando el
        // algoritmo de la divison por 2

        Scanner leer = new Scanner(System.in);

        System.out.print("Señor usuario, introduce el número que quieras mostar en binario: ");
        int num = leer.nextInt();
        int numAux = num;
        int resto = 0;
        String binarioString = "";
        String binario_0 = "0";
        System.out.println("===================================================================");

        do {

            resto = numAux % 2;

            numAux = numAux / 2;

            Integer restoInteger = resto;
            String restoString = Integer.toString(restoInteger);
            binarioString = restoString + binarioString;

        } while (numAux > 0);

        for (int cantidad_0_cont = 1; cantidad_0_cont > 0; cantidad_0_cont++ ) { // contador infinito

            int parar_0 = binarioString.length();

            if (parar_0 >= 8) break;

            binarioString = binario_0 + binarioString;

        }
        
        System.out.println(binarioString);

        leer.close();
    }

}
