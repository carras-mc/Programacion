package EstudioTiposDatosEstructurasBasicas;

import java.util.Scanner;

public class EstudioBucles {
    public EstudioBucles(){

        System.out.println("========================");
        System.out.println("|    Estudio Bucles    |");
        System.out.println("========================");
        
        // | FOR | (Solo sirve con condiciones númericas)
        // El "for" tiene tres partes, la primera es una variable que tenemos que inicializar; la segunda es la condición 
        // de cuando se tiene que salir del bucle; y la tercera es un contador. Se utiliza sobre todo si la variable es un
        // contador. 

        /*System.out.println("For");

        for (int i = 11; i > 11; i+= 1) {
            System.out.println(i);
        }

        // | WHILE | (Funciona con todo tipo de condiciones. Si la condicion es verdadera, se repite; si es falsa, se sale.)
        // Se puede utilizar el While y el For juntos. La diferencia es que cuando es sin for, while se tiene que ejecutar una vez
        // si o si; en cambio con el for puede que no se entre en el while si la condicion no es la requerida.   

        int i = 11;

        System.out.println("While");

        while (i < 11) {
            System.out.println(i);
            i++;
            
        }
        
        i = 11;
    
        System.out.println("Do While"); 

        do {
            System.out.println(i);
            i++;
        } while (i < 11);*/
        
        // Ejercicio Prueba
        // Un programa que me pida un número y me diga si ese número es par o impar. Si el numero introducido es par quiero
        // que me vuelva a pedir otro numero, y el programa se sale cuando se introduce un número impar.

        /*Scanner leer = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = leer.nextInt();

        while (num % 2 == 0) {
            System.out.print("Introduce otro número parguela: ");
            num = leer.nextInt();
        }*/

        // Con boleano

        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int num2 = leer.nextInt();
        boolean numeroPar = num2 % 2 == 0;
        //boolean numeroImpar = num2 % 2 != 0;

        while (numeroPar) {
            System.out.print("Introduce otro número parguela: ");
            num2 = leer.nextInt();  
        }

        leer.close();

    } 

}