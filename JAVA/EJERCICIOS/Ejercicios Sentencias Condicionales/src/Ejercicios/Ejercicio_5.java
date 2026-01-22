package Ejercicios;

import java.util.Scanner;

public class Ejercicio_5 {
    public Ejercicio_5(){

    // Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos que faltan para llegar
    // a la medianoche.

    Scanner leer = new Scanner(System.in);

    System.out.print("Introduce que hora es (solo la hora): ");
    int hora = leer.nextInt();

    System.out.print("Introduce los minutos: ");
    int minutos = leer.nextInt();

    int segundosDia = 86400;

    if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59) {

        hora = (hora * 60) * 60;
        minutos = minutos * 60;

        int sumaSegundos = minutos + hora;
        int segundosRestantes = segundosDia - sumaSegundos;

        System.out.println("Quedan " + segundosRestantes + " segundos para que sea medianoche");
        }

    else {
        System.out.println("ERROR");
    }

    leer.close();

    }

    
}
