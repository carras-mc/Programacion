package Ejercicios;

import java.util.Scanner;

public class Ejercicio_6 {
    public Ejercicio_6(){

        // Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a razón
        // de 12 euros la hora.

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la cantidad de días trabajados semanalmente: ");
        int diasTrabajados = leer.nextInt();
        System.out.println("Introduce las horas trabajadas diariamente: ");
        int horasTrabajadas = leer.nextInt();

        double salarioSemanal = diasTrabajados * horasTrabajadas * 12;
        System.out.println("El salario semanal es de = " + salarioSemanal + " euros");

        leer.close();





    
    }

}
