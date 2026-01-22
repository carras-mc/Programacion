package ejercicios;

import java.util.Scanner;

public class Ejercicio_9 {

    public Ejercicio_9() {

        // Introducir un número y desglosarlo de forma ideal en billetes y monedas de curso legal.

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce la cantidad de dinero que quieras desglosar: ");
        int dinero_introducido = leer.nextInt();
        int cantidad_moneda_o_billetes = 0;

        System.out.println("=================================");

        if (dinero_introducido >= 500) {
            cantidad_moneda_o_billetes = dinero_introducido/500;
            dinero_introducido%=500 * cantidad_moneda_o_billetes;
        }
        if (cantidad_moneda_o_billetes != 0) {
            System.out.println(cantidad_moneda_o_billetes + " billete/s de 500");
            cantidad_moneda_o_billetes = 0;
        }
        


        if (dinero_introducido >= 200) {
            cantidad_moneda_o_billetes = dinero_introducido/200;
            dinero_introducido%=200 * cantidad_moneda_o_billetes;
        }
        if (cantidad_moneda_o_billetes != 0) {
            System.out.println(cantidad_moneda_o_billetes + " billete/s de 200");
            cantidad_moneda_o_billetes = 0;
        }



        if (dinero_introducido >= 100) {
            cantidad_moneda_o_billetes = dinero_introducido/100;
            dinero_introducido%=100 * cantidad_moneda_o_billetes;
        }
        if (cantidad_moneda_o_billetes != 0) {
            System.out.println(cantidad_moneda_o_billetes + " billete/s de 100");
            cantidad_moneda_o_billetes = 0;
        }



        if (dinero_introducido >= 50) {
            cantidad_moneda_o_billetes = dinero_introducido/50;
            dinero_introducido%=50 * cantidad_moneda_o_billetes;
        }
        if (cantidad_moneda_o_billetes != 0) {
            System.out.println(cantidad_moneda_o_billetes + " billete/s de 50");
            cantidad_moneda_o_billetes = 0;
        }



        if (dinero_introducido >= 20) {
            cantidad_moneda_o_billetes = dinero_introducido/20;
            dinero_introducido%=20 * cantidad_moneda_o_billetes;
        }
        if (cantidad_moneda_o_billetes != 0) {
            System.out.println(cantidad_moneda_o_billetes + " billete/s de 20");
            cantidad_moneda_o_billetes = 0;
        }



        if (dinero_introducido >= 10) {
            cantidad_moneda_o_billetes = dinero_introducido/10;
            dinero_introducido%=10 * cantidad_moneda_o_billetes;
        }

        if (cantidad_moneda_o_billetes != 0) {
            System.out.println(cantidad_moneda_o_billetes + " billete/s de 10");
            cantidad_moneda_o_billetes = 0;
        }



        if (dinero_introducido >= 5) {
            cantidad_moneda_o_billetes = dinero_introducido/5;
            dinero_introducido%=5 * cantidad_moneda_o_billetes;
        }
        if (cantidad_moneda_o_billetes != 0) {
            System.out.println(cantidad_moneda_o_billetes + " billete/s de 5");
            cantidad_moneda_o_billetes = 0;
        }



        if (dinero_introducido >= 2) {
            cantidad_moneda_o_billetes = dinero_introducido/2;
            dinero_introducido%=2 * cantidad_moneda_o_billetes;
        }
        if (cantidad_moneda_o_billetes != 0) {
            System.out.println(cantidad_moneda_o_billetes + " moneda/s de 2");
            cantidad_moneda_o_billetes = 0; 
        }
        



        if (dinero_introducido >= 1) {
            cantidad_moneda_o_billetes = dinero_introducido/1;
            dinero_introducido%=1 * cantidad_moneda_o_billetes;
        }
        if (cantidad_moneda_o_billetes != 0) {
            System.out.println(cantidad_moneda_o_billetes + " moneda de 1");
            cantidad_moneda_o_billetes = 0; 
        }
        

        System.out.println("=================================");

        leer.close();

    }


}
