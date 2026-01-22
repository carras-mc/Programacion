package ejercicios;

import java.util.Scanner;

public class Rompe_Cadenas {

    public Rompe_Cadenas() {

        // Crea un programa que me pida una frase y me la rompa en palabras.

        Scanner sc = new Scanner(System.in);

        // System.out.print("Introduce una frase : ");
        String fraseInput = "     tus      muertos        jesus       ";
        rompeCadenas(fraseInput);

        sc.close();
    }

    public void rompeCadenas(String fraseInput) {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("    FRASE SEPARADA");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        System.out.println("---------------------");
        String palabra = "";

        // marcos's way
        for (int i = 0; i < fraseInput.length(); i++) {

            boolean espacio = false;
            char letraExtraida = fraseInput.charAt(i);

            if (letraExtraida != ' ') {
                espacio = false;
                palabra += letraExtraida;
            }
            if (letraExtraida == ' ' && espacio == false) {
                espacio = true;
            }
            if (palabra.length() > 0 && espacio == true || i == fraseInput.length() - 1) {
                System.out.println(palabra);
                palabra = "";
            } 
        }

        // pedro's way
        for (int i = 0; i < fraseInput.length(); i++) {
            if (fraseInput.charAt(i)!=' ') {
                palabra+= fraseInput.charAt(i);
            }
            if (fraseInput.charAt(i)==' ' && palabra.length()!=0) {
                System.out.println(palabra);
                palabra="";
            }
        }

        System.out.println("---------------------");
    }
}
