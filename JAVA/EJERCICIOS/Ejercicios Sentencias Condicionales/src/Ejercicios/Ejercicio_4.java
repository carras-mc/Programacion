package Ejercicios;

import java.util.Scanner;

public class Ejercicio_4 {
    public Ejercicio_4(){

    // Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.

    Scanner leer = new Scanner  (System.in);

    System.out.print("¿En qué mes naciste?: ");
    String mes = leer.nextLine();

    System.out.print("¿En que día naciste?: ");
    int dia = leer.nextInt();

    switch (mes) {
        case "enero":
            if (dia > 0 && dia <= 19) {
                System.out.println("Tu horóscopo es Capricornio");
            }
            else if (dia >= 20 && dia <= 31) {
                System.out.println("Tu horóscopo es Acuario");
            }
            else {
                System.out.println("ERROR");
            }
            break;
        
        case "febrero":
            if (dia > 0 && dia <= 18) {
                System.out.println("Tu horóscopo es Acuario");
            }
            else if (dia >= 19 && dia <= 29) {
                System.out.println("Tu horóscopo es Piscis");
            }
            else {
                System.out.println("ERROR");
            }
            break;
        
        case "marzo":
            if (dia > 0 && dia <= 20) {
                System.out.println("Tu horóscopo es Piscis");
            }
            else if (dia >= 21 && dia <= 31) {
                System.out.println("Tu horóscopo es Aries");
            }
            else {
                System.out.println("ERROR");
            }
            break;
        
        case "abril":
            if (dia > 0 && dia <= 19) {
                System.out.println("Tu horóscopo es Aries");
            }
            else if (dia >= 20 && dia <= 30) {
                System.out.println("Tu horóscopo es Tauro");
            }
            else {
                System.out.println("ERROR");
            }
            break;

        case "mayo":
            if (dia > 0 && dia <= 20) {
                System.out.println("Tu horóscopo es Tauro");
            }
            else if (dia >= 21 && dia <= 31) {
                System.out.println("Tu horóscopo es Géminis");
            }
            else {
                System.out.println("ERROR");
            }
            break;
        
        case "junio":
            if (dia > 0 && dia <= 20) {
                System.out.println("Tu horóscopo es Géminis");
            }
            else if (dia >= 21 && dia <= 30) {
                System.out.println("Tu horóscopo es Cáncer");
            }
            else {
                System.out.println("ERROR");
            }
            break;
        
        case "julio":
            if (dia > 0 && dia <= 22) {
                System.out.println("Tu horóscopo es Cáncer");
            }
            else if (dia >= 23 && dia <= 31) {
                System.out.println("Tu horóscopo es Leo");
            }
            else {
                System.out.println("ERROR");
            }
            break;
        
        case "agosto":
            if (dia > 0 && dia <= 22) {
                System.out.println("Tu horóscopo es Leo");
            }
            else if (dia >= 23 && dia <= 30) {
                System.out.println("Tu horóscopo es Virgo");
            }
            else {
                System.out.println("ERROR");
            }
            break;

        case "septiembre":
            if (dia > 0 && dia <= 22) {
                System.out.println("Tu horóscopo es Virgo");
            }
            else if (dia >= 23 && dia <= 31) {
                System.out.println("Tu horóscopo es Libra");
            }
            else {
                System.out.println("ERROR");
            }
            break;
        
        case "octubre":
            if (dia > 0 && dia <= 22) {
                System.out.println("Tu horóscopo es Libra");
            }
            else if (dia >= 23 && dia <= 30) {
                System.out.println("Tu horóscopo es Escorpio");
            }
            else {
                System.out.println("ERROR");
            }
            break;
        
        case "noviembre":
           if (dia > 0 && dia <= 21) {
                System.out.println("Tu horóscopo es Escorpio");
            }
            else if (dia >= 22 && dia <= 31) {
                System.out.println("Tu horóscopo es Sagitario");
            }
            else {
                System.out.println("ERROR");
            }
            break;

        case "diciembre":
            if (dia > 0 && dia <= 21) {
                System.out.println("Tu horóscopo es Sagitario");
            }
            else if (dia >= 22 && dia <= 31) {
                System.out.println("Tu horóscopo es Capricornio");
            }
            else {
                System.out.println("ERROR");
            }
            break;

        default: 
            System.out.println("ERROR");
           leer.close();
            break;

        

            
    }








    }

}
