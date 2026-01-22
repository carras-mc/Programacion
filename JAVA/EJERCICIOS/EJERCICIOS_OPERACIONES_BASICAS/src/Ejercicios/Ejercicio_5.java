package Ejercicios;

import java.util.Scanner;

public class Ejercicio_5 {
    public Ejercicio_5(){

        // Escribe un programa que calcule el área de un triangulo.

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la base: ");
        double base = leer.nextDouble();

        System.out.println("Introduce la altura: ");
        double altura = leer.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("El area del triángulo es de = " + area + " unidades cuadradas");

        leer.close();
        






    }

}
