package Ejercicios;

public class Ejercicio_1 {
    public Ejercicio_1(){

        // Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.,while y do while
        int num = 5;
        int multiplo = 0;

        while (multiplo <= 100) {
            int resultado = num * multiplo;
            System.out.println(multiplo + " x 5 = " + resultado);
            multiplo++;
            

        }

    }

}
