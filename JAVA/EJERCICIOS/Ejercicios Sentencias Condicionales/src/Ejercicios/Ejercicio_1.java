package Ejercicios;

import java.util.Scanner;

public class Ejercicio_1 {
    public Ejercicio_1(){
    
    // Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese
    // día.

    System.out.println("==============");
    System.out.println(" Ejercicio 1");
    System.out.println("==============");

    Scanner leer = new Scanner(System.in);
    
    System.out.print("Introduce un día de la semana (lunes, martes, miercoles, jueves, viernes): ");
    String dia = leer.nextLine();

    switch (dia) {
        case "lunes":
            System.out.println("Tienes IPE a primera hora");
            break;
        
        case "martes":
            System.out.println("Tienes Base de Datos a primera hora");
            break;

        case "miercoles":
            System.out.println("Tienes Lenguaje de Marcas a primera hora");
            break;

        case "jueves":
            System.out.println("Tienes IPE a primera hora");
            break;

        case "viernes":
            System.out.println("Tienes Base de Datos a primera hora");
            break;

        default:
            System.out.println("El día esta mal introducido, recuerda que debe ser en minúsculas");
            

       leer.close();

    }


    }

}
