package Ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
    public Ejercicio_4() {

        // Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. Este ejercicio es
        // equivalente a otro realizado anteriormente, con la salvedad de que el anterior estaba limitado a números de 5 dígitos
        // como máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de esta manera, la única limitación en
        // el número de dígitos la establece el tipo de dato que se utilice (int o long).
        
        Scanner leer = new Scanner(System.in);

         System.out.print("Introduce un número: ");
        int num = leer.nextInt();

        // Forma de ver cuantos dígitos tiene un número. ESTO LO SAQUE DE CHAT GTP.
        
        /*int digitos = (int) (Math.log10(Math.abs(num)) + 1);
        System.out.println("El número introducido tiene = " + digitos + " dígito/s");

        leer.close();*/

        // ESTA LA HICE YO.
        
        int digitos = 0;

        while (num > 0) {
        int operacion = num / 10;
        num = operacion;
        digitos++;
        }

        System.out.println(digitos);

        leer.close();



        




        
    }

}
