package EstudioTiposDatosEstructurasBasicas;

import java.util.Scanner;

public class EstudioPrintF {
    public EstudioPrintF() {
        
        // Ejemplo 1 - Multiples variables

        String nombre = "Marcos";
        int edad = 19;
        double nota = 8.86;
        
        System.out.printf("Nombre: %s, Edad: %d, Nota media: %.1f%n",nombre, edad, nota);

        // Ejemplo 2 - Alineación y anchura

        System.out.printf("%-10s %-12s %5s%n", "Producto", "Precio", "Marca");
        System.out.printf("%-11s %-10.2f %-5s%n", "Manzana", 1.5, "Mercadona");
        System.out.printf("%-11s %-10.2f %-5s%n", "Plátano", 0.75, "Carrefour");
        System.out.printf("%-11s %-10.2f %-5s%n", "Pera", 2.0, "Aldi");

        System.out.println("");

        // Ejemplo 3 - Porcentajes y cálculos

        double total = 50;
        double descuento = 0.1;
        System.out.printf("Descuento aplicado: %.0f%%%n", descuento * 100);
        System.out.printf("Precio final: %.2fE%n", total * (1 - descuento));

        System.out.println("");

        // Ejemplo práctico 1

        System.out.printf(" Nombre: %s%n Edad: %d%n Altura: %.2f %s%n", "Juan", 21, 1.82, "metros");

        System.out.println("");

        //Ejemplo práctico 2

        System.out.printf("%-9s %-18s %-11s %-19s%n", "Nombre", "Precio Unitario", "Cantidad", "Precio Total");
        System.out.printf("%-14s %-17.2f %-11d %-10.2f%n", "Manzana", 0.75, 4, 3.00);
        System.out.printf("%-14s %-17.2f %-11d %-10.2f%n", "Plátano", 0.50, 6, 3.00);
        System.out.printf("%-14s %-17.2f %-11d %-10.2f%n", "Pera", 1.20, 2, 2.40);
         
        System.out.println("");

        // Ejercicio práctico 3

        Scanner leer = new Scanner(System.in);  
        
        System.out.print("Introduce el nombre del primer alumno: ");
        String alumno1 = leer.nextLine();
        System.out.print("Introduce la nota su nota: ");
        float nota1 = leer.nextFloat();
        leer.nextLine();
        System.out.print("Introduce el nombre del segundo alumno: ");
        String alumno2 = leer.nextLine();
        System.out.print("Introduce la nota su nota: ");
        float nota2 = leer.nextFloat();
        leer.nextLine();
        System.out.print("Introduce el nombre del tercer alumno: ");
        String alumno3 = leer.nextLine();
        System.out.print("Introduce la nota su nota: ");
        float nota3 = leer.nextFloat();   

        System.out.printf("%-10s %s%n", "Alumno", "Nota");
        System.out.printf("%-10s %.1f%n", alumno1, nota1);
        System.out.printf("%-10s %.1f%n", alumno2, nota2);
        System.out.printf("%-10s %.1f%n", alumno3, nota3);

        leer.close();



        



        






    }

}
