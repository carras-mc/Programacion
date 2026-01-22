package flujoDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flujo_de_datos {

    public Flujo_de_datos() {

        System.out.println("Almacenando datos");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Introduce un número : ");
        int num = 0;
        String dato = "";

        try {
            dato = br.readLine();
            num = Integer.parseInt(dato);
        } catch (IOException e) {
            e.getMessage();
        } catch (NumberFormatException e) {

            System.out.println("Eres gilipollas o que, introduce un NUMERO ENTERO");
        }

        System.out.println(num);

        System.out.println("Introduzca su nombre : ");

        try {
            String nombre = Leer.dato();
            System.out.println("hola " + nombre);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Introduzca su edad : ");

        try {
            int numero = Leer.datoInt();
            System.out.println("Su edad es "+numero);
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
