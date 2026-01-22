package Ejercicios;

import java.util.Scanner;

public class Ejercicio_013_Capicua {

    public Ejercicio_013_Capicua() {

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce el número que quieras comprobar si es capicúa: ");
        int numeroIntroducido = leer.nextInt();
        int numeroParaConvertir = numeroIntroducido;
        int numeroInvertido = 0;

        while (numeroParaConvertir > 0 || numeroParaConvertir < 0) {

            int ultimoDigito = numeroParaConvertir % 10;
            numeroInvertido = numeroInvertido * 10 + ultimoDigito;
            numeroParaConvertir/=10;
            
        }

        if (numeroInvertido == numeroIntroducido) {
            System.out.println("El numero es capicúa");
        }
        else System.out.println("El número no es capicúa: ");

        leer.close();


    }

}
