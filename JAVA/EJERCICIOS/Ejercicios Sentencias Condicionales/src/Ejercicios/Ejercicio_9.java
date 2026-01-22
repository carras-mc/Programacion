package Ejercicios;

import java.util.Scanner;

public class Ejercicio_9 {
    public Ejercicio_9(){

        //Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se
        //permiten números de hasta 5 dígitos.
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = leer.nextInt();

        // Forma de ver cuantos dígitos tiene un número
        
        int digitos = (int) (Math.log10(Math.abs(num)) + 1);
        System.out.println("El número introducido tiene = " + digitos + " dígito/s");

        leer.close();

        //También se podría hacer comparando: <10 = 1 digito...

        


    }

}
