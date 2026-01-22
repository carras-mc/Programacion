package ejercicios;

import java.util.Scanner;

public class Ejercicio_3 {
    public Ejercicio_3() {

        // Introducir un número entero que llamaremos <dia_semana>, y comprendido entre 0 y 6, de modo que el 0 corresponderá
        // al Domingo, el 1 al Lunes,...y así sucesivamente, hasta el 6 que señalará al Sábado. Suponed que el 1º de Enero 
        // de un año cualquiera “cae” en el día que marca <dia_semana>. Tendréis que presentar en pantalla todos los días 
        // del mes de Enero, cada uno en una línea, acompañado del nombre del día de la semana que le corresponde.

        Scanner leer = new Scanner(System.in);

        

        System.out.println("==================");
        System.out.printf("%-20s%n", "0 - Domingo");
        System.out.printf("%-20s%n", "1 - Lunes");
        System.out.printf("%-20s%n", "2 - Martes");
        System.out.printf("%-20s%n", "3 - Miercoles");
        System.out.printf("%-20s%n", "4 - Jueves");
        System.out.printf("%-20s%n", "5 - Viernes");
        System.out.printf("%-20s%n", "6 - Sábado");  
        System.out.println("==================");
       

        System.out.print("Introduce un dia de la semana, según su número: ");
        int dia_semana = leer.nextInt();
        

        int contador = 1;

    if (dia_semana < 6 && dia_semana >= 0) {
    do {

        switch (dia_semana) {

            case 0:
                if (contador <= 31) {
                System.out.println(contador + " - Domingo");
                contador++;
                dia_semana++;
                }
                else break;
            
            case 1:
                if (contador <= 31) {
                System.out.println(contador + " - Lunes");
                contador++;;
                dia_semana++;
                }
                else break;
            
            case 2:
                if (contador <= 31) {
                System.out.println(contador + " - Martes");
                contador++;
                dia_semana++;
                }
                else break;

            case 3:
                if (contador <= 31) {
                System.out.println(contador + " - Miercoles");
                contador++;
                dia_semana++;
                }
                else break;

            case 4:
                if (contador <= 31) {
                System.out.println(contador + " - Jueves");
                contador++;
                dia_semana++;
                }
                else break;

            case 5:
                if (contador <= 31) {
                System.out.println(contador + " - Viernes");
                contador++;
                dia_semana++;
                }
                else break;

            case 6:
                if (contador <= 31) {
                System.out.println(contador + " - Sabado");
                contador++;
                dia_semana = dia_semana - 6;
                }
                else break;

        }
                

    
        } while (dia_semana >= 0);
        }
        
        else System.out.println("ERROR");
       
        
        leer.close();
        
        
        
        /*if (dia_semana <= 6 && dia_semana >= 0) {

            while (dia_semana >= 0) {
                
                if (dia_semana == 0) {
                    if (contador <= 31) {
                    System.out.println(contador + " - Domingo");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Lunes");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Martes");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Miercoles");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Jueves");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Viernes");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Sabado");
                    contador++;
                    }
                      
                }

                if (dia_semana == 1) {
                    if (contador <= 31) {
                    System.out.println(contador + " - Lunes");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Martes");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Miercoles");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Jueves");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Viernes");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Sábado");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Domingo");
                    contador++;
                    }
                      
                }

                if (dia_semana == 2) {
                    if (contador <= 31) {
                    System.out.println(contador + " - Domingo");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Lunes");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Martes");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Miercoles");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Jueves");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Viernes");
                    contador++;
                    }

                    if (contador <= 31) {
                    System.out.println(contador + " - Sabado");
                    contador++;
                    }
                      
                }
            }      
        }*/
    }
}
