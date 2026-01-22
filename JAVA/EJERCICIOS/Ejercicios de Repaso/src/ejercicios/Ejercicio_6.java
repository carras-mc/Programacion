package ejercicios;

import java.util.Scanner;

public class Ejercicio_6 {

    public Ejercicio_6() {

        // Realiza un ejercicio que me
        // permita resolver ecuaciones de segundo grado del tipo ax2+bx+c=0.
        // Deberá de pedir los coeficientes a,b,c e indicar las soluciones. Si no tiene
        // solución real deberá indicarlo.

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce el valor de 'A': ");
        int A = leer.nextInt();
        System.out.print("Introduce el valor de 'B': ");
        int B = leer.nextInt();
        System.out.print("Introduce el valor de 'C': ");
        int C = leer.nextInt();

        System.out.println("===============================");

        double ecuacionSegundoGrado = Math.sqrt(Math.pow(B, 2) - 4 * A * C);
        if (ecuacionSegundoGrado > 0) {
            double ecuacionSegundoGradoSuma = (-(B) + ecuacionSegundoGrado) / (2 * A);
            System.out.println("x1 = " + ecuacionSegundoGradoSuma);
            double ecuacionSegundoGradoResta = (-(B) - ecuacionSegundoGrado) / (2 * A);
            System.out.println("x2 = " + ecuacionSegundoGradoResta);
        }
        else System.out.println("Sin solución");
        
        leer.close();
        



    }

}
