package Ejercicios;

import java.util.Scanner;

public class Ejercicio_6 {
    public Ejercicio_6(){

    // Escribe un programa que ordene tres números enteros introducidos por teclado.

    Scanner leer = new Scanner(System.in);

    System.out.print("Introduce el primer numero para ordenar: ");
    int A = leer.nextInt();
    System.out.print("Introduce el segundo numero para ordenar: ");
    int B = leer.nextInt();
    System.out.print("Introduce el tercer numero para ordenar ");
    int C = leer.nextInt();

    int numeroMayor = 0, numeroIntermedio = 0, numeroMenor = 0;
    
    if (A >= B && A >= C){
        numeroMayor = A;
    }
    else if (A <= B && A <= C){
        numeroMenor = A;
    }
    else {
        numeroIntermedio = A;
    }

    if (B >= A && B >= C){
        numeroMayor = B;
    }
    else if (B <= A && B <= C){
        numeroMenor = B;
    }
    else {
        numeroIntermedio = B;
    }

    if (C >= B && C >= A){
        numeroMayor = C;
    }
    else if (C <= B && C <= A){
        numeroMenor = C;
    }
    else {
        numeroIntermedio = C;
    }

    System.out.println("Los número introducidos ordenados = " + numeroMayor + " ===> " + numeroIntermedio + " ===> " + numeroMenor);

    leer.close();





    }

}
