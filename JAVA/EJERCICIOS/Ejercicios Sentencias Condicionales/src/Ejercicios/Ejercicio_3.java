package Ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {
    public Ejercicio_3(){

    // Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias
    // (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.

    Scanner leer = new Scanner(System.in);
    
    System.out.print("Introduce cuántas horas trabajas semanalmente: ");
    int horas = leer.nextInt();
    
    double salarioTotal;
    double salario40horas = 12 * 40;

    if (horas > 40){
        horas = horas - 40;
        double horasExtraPaga = horas * 16;
        salarioTotal = salario40horas + horasExtraPaga;
        System.out.print("Salario total con horas extras = " + salarioTotal);
    }
    else if (horas <= 40 && horas >= 0){
        salarioTotal = horas * 12;
        System.out.print("Salario total = " + salarioTotal);
    }
    else {
        System.out.print("El valor introducido no puede ser negativo.");
    }

    leer.close();

    }

}
