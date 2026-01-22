package ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {

    public Ejercicio_1() {

        // Introducir un número entero por teclado que se supone que es un mes del año. Si es así, 
        // indicar cuántos días tiene el mes que le antecede.

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un mes del año (en número): ");
        int mes = leer.nextInt();

        switch (mes) {
            case 4,6,9,11:
            System.out.println("El mes que le antecede tiene 31 días.");
            break;
            
            case 1,5,7,8,10,12:
            System.out.println("El mes que le antecede tiene 30 días.");
            break;

            case 3:
            System.out.println("El mes que le antecede tiene 28 o 29 días.");
            break;
        }

        leer.close();


        

        

    }

}
