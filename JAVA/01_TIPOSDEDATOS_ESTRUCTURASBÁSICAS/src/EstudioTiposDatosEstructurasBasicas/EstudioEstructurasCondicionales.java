package EstudioTiposDatosEstructurasBasicas;

import java.util.Scanner;

public class EstudioEstructurasCondicionales {
        public EstudioEstructurasCondicionales(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Estudio de estructuras condicionales");

        // Estructura if
        boolean bisiesto = false;
        
        if(bisiesto){
            System.out.println("El año es bisiesto, tiene 366 días");

        }
        else{
            System.out.println("El año no es bisiesto, tiene 365 días");

        }
        System.out.println("=============================================");

        int mayorDeEdad = 17;
        if(mayorDeEdad >= 18){
            System.out.println("Puedes acceder");
        }
        else{
            System.out.println("No puedes acceder, eres menor de edad");
        }

        System.out.println("======================================");

        System.out.print("Introduce un numero: ");
        int numeroIntroducido = leer.nextInt();

        if(numeroIntroducido >= 0){
            System.out.println("Es positivo");
        }
        else{
            System.out.println("Es negativo");
        }
        System.out.println("============================================");
        
        System.out.print("Introduce la edada de Pedro: ");
        int Pedro = leer.nextInt();
        
        System.out.print("Introduce la edad de Luis: ");
        int Luis = leer.nextInt();

        if(Pedro >= 18 && Luis >= 18){
            System.out.println("Los dos pueden votar.");
        }
        else if(Pedro < 18 && Luis < 18){
            System.out.println("Ninguno de los dos puede votar.");
        }
        else{
            System.out.println("Uno de los dos no puede votar.");
        }
        
        // Función Switch
        
        
        System.out.print("Introduce el mes: ");
        int mes = leer.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octube");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default: 
                System.out.println("Mes inválido");
                
        
            leer.close();
            
       








        
        }     
       
    } 
}     
    

    

