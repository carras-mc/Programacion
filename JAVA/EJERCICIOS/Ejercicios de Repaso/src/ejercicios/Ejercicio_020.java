package ejercicios;

import java.util.Scanner;

public class Ejercicio_020 {

    public Ejercicio_020 () {
     
    /* Números Amigos
    Crea un programa que pida dos números enteros y determine si son "números amigos". Dos números son
    amigos si la suma de los divisores propios de uno es igual al otro número, y viceversa. El par de números
    amigos más conocido es 220 y 284.  */  
    
    Scanner leer = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    int num1 = leer.nextInt();
    System.out.print("Introduce el segundo número: ");
    int num2 = leer.nextInt();
    int sumaDivisores1 = 0;
    int sumaDivisores2 = 0;

    for(int cont = 1; cont < num1; cont++) {
        int resto = num1 % cont;
        if (resto == 0) {
            sumaDivisores1 = sumaDivisores1 + cont;
        }
    }

    for(int cont = 1; cont < num2; cont++) {
        int resto = num2 % cont;
        if (resto == 0) {
            sumaDivisores2 = sumaDivisores2 + cont;
        }
    }

    if (sumaDivisores1 == num2 && sumaDivisores2 == num1) {
        System.out.println("Son números amigiwis.");
    }
    else System.out.println("No son amigiwis :(");

    leer.close();
    }

    

}
