package ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
    public Ejercicio_4() {

    // Leer 10 datos, compuesto cada uno de ellos por un nombre de persona y su sueldo neto mensual, y obtener y visualizar 
    // el nombre y sueldo de la persona que más cobra y de la que menos. Si hay varias con el mismo sueldo (máximo o mínimo) se 
    // presentará la primera que aparezca en la secuencia de entrada.

    Scanner leer = new Scanner(System.in);

    String linea = "=============================================";
    String pregunta_nombre = "Introduce el nombre del empleado";
    String pregunta_sueldo = "Introduce el sueldo del empleado";
    String dos_punto = ":";
    int contador = 1;
    int sueldo_empleado = 0;
    int sueldo_max = 0;
    int sueldo_min = 0;
    String nombre_empleado_sueldo_max = "n/A";
    String nombre_empleado_sueldo_min = "n/A";

    do {


        System.out.println(linea);
        System.out.printf("%-10s %d %s ", pregunta_nombre, contador, dos_punto);
        String nombre_empleado = leer.nextLine();
        System.out.printf("%-10s %d %s ", pregunta_sueldo, contador, dos_punto);
        sueldo_empleado = leer.nextInt();
        leer.nextLine();

        if (contador==1) {

            sueldo_max = sueldo_empleado;
            nombre_empleado_sueldo_max = nombre_empleado;
            sueldo_min = sueldo_empleado;
            nombre_empleado_sueldo_min = nombre_empleado;

        }
        
        contador++;

        if (sueldo_empleado > sueldo_max) { 
            sueldo_max = sueldo_empleado;
            nombre_empleado_sueldo_max = nombre_empleado;
            
        }
        else if (sueldo_empleado < sueldo_min) {
            sueldo_min = sueldo_empleado;
            nombre_empleado_sueldo_min = nombre_empleado;

        }
        /*else if (sueldo_empleado == sueldo_max || sueldo_empleado == sueldo_min) {
            
        }*/
        //else System.out.println("ERROR");
        
    } while (contador <= 4);

    System.out.println("=============================================");
    System.out.println("El sueldo máximo es " + sueldo_max + " de " + nombre_empleado_sueldo_max);
    System.out.println("El sueldo mínimo es " + sueldo_min + " de " + nombre_empleado_sueldo_min);

    leer.close();

    }


}
