package Ejercicios;

import java.util.Scanner;

public class Ejercicio_7 {
    public Ejercicio_7(){
    
    // 7.-Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la asignatura
    // Programación para obtener la media deseada. Hay que tener en cuenta que la nota del primer examen cuenta el
    // 40% y la delsegundo examen un 60%.

    Scanner leer = new Scanner(System.in);
    
    // media = (examen1 * 0.40 + examen2(x) * 0.60) 
    // examen2(x) = (examen1 * 0.40 - media) / 0.60

    System.out.print("Introduce la nota del primer examen: ");
    double notaExamen1 = leer.nextDouble();
    System.out.print("Introduce la media deseada: ");
    double mediaDeseada = leer.nextDouble();
    
    // double notaExamen2 = (mediaDeseada - 0.4 * notaExamen1)/0.6;
    
    if (mediaDeseada <= 10 && mediaDeseada >= 0 && notaExamen1 <= 10 && notaExamen1 >= 0){
        double notaExamen2 = (mediaDeseada - 0.4 * notaExamen1)/0.6;
        
        if (notaExamen2 <= 10){
        System.out.println("Puedes alcanzar la media deseada con una puntuación en el segundo examen de: " + notaExamen2);
        }
        else{
            System.out.println("La media deseada no es alcanzable, necesitarías obtener una puntuación en el segundo examen de: " + notaExamen2);
        }

    }
    else{
    System.out.println("Los valores introducidos no son válidos");
    }

    leer.close();





    }

}
