package Ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {
    public Ejercicio_3() {

        // Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos pedirá
        // la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”y si
        // acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.Tendremos cuatro oportunidades para abrir la
        // caja fuerte.

        Scanner leer = new Scanner(System.in);

        int contraseña = 4561;
        
        int intentos = 4;
        
        System.out.print("Introduce la contraseña numérica: ");
        int contraseñaIntroducida = leer.nextInt();

            if (contraseña == contraseñaIntroducida) {
                System.out.println("¡Acertaste la contraseña!");
            }
            
            else {
                while (intentos > 1 && contraseñaIntroducida != contraseña) {
                intentos--;
                System.out.println("La contraseña introducida es incorrecta :( . Intentalo de nuevo, tienes: " + intentos + " intentos");
                System.out.print("Introduce la contraseña: ");
                contraseñaIntroducida = leer.nextInt();
                }
                if (contraseña == contraseñaIntroducida) {
                System.out.println("¡Acertaste la contraseña!");    
                }
                else System.out.println("La contraseña introducida es incorrecta. No te quedan más intentos. Espabila.");
                
            }
                
        leer.close();

    }

}
