package pruebas;

import java.util.Scanner;
import java.util.random.RandomGenerator.JumpableGenerator;

public class Piedra_Papel_Tijeras {

    public Piedra_Papel_Tijeras() {

        Scanner sc = new Scanner(System.in);

        String piedra = "piedra";
        String papel = "papel";
        String tijeras = "tijeras";

        System.out.println("Elige (número):   1 · piedra    2 · papel    3 · tijeras");
        int eleccionJugador = 0;
        do {
            eleccionJugador = sc.nextInt();
            String eleccionJugadorString;
            if (eleccionJugador == 1)
                eleccionJugadorString = piedra;
            if (eleccionJugador == 2)
                eleccionJugadorString = papel;
            if (eleccionJugador == 3)
                eleccionJugadorString = tijeras;
            if (eleccionJugador < 1 || eleccionJugador > 3)
                System.out.println("Introduce un número del 1 al 3.");
        } while (eleccionJugador < 1 || eleccionJugador > 3);

        int jugadaAleatoria = (int) (Math.random() * 3 + 1);
        System.out.println(jugadaAleatoria);

        String maquinaJugada;

        if (jugadaAleatoria == 1)
            maquinaJugada = piedra;
        if (jugadaAleatoria == 2)
            maquinaJugada = papel;
        if (jugadaAleatoria == 3)
            maquinaJugada = tijeras;

        

    }

}
