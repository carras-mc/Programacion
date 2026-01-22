package pruebas;

import java.util.Scanner;

public class Piedra_Papel_Tijeras {

    public Piedra_Papel_Tijeras() {

        Scanner sc = new Scanner(System.in);

        String piedra = "PIEDRA";
        String papel = "PAPEL";
        String tijeras = "TIJERAS";
        String jugadorGanador = "¡Has ganado!";
        String adversarioGandaro = "Perdiste :(";
        for (int i = 1; i > 0; i++) {

            System.out.println("Elige (número):   1 · PIEDRA    2 · PAPEL    3 · TIJERAS");
            int eleccionJugador = 0;
            String jugadorJugada = "";
            do {
                eleccionJugador = sc.nextInt();
                if (eleccionJugador == 1)
                    jugadorJugada = piedra;
                if (eleccionJugador == 2)
                    jugadorJugada = papel;
                if (eleccionJugador == 3)
                    jugadorJugada = tijeras;
                if (eleccionJugador < 1 || eleccionJugador > 3)
                    System.out.println("Introduce un número del 1 al 3.");
            } while (eleccionJugador < 1 || eleccionJugador > 3);

            int jugadaAleatoria = (int) (Math.random() * 3 + 1);
            
            String maquinaJugada = "";
            if (jugadaAleatoria == 1)
                maquinaJugada = piedra;
            if (jugadaAleatoria == 2)
                maquinaJugada = papel;
            if (jugadaAleatoria == 3) {
                maquinaJugada = tijeras;
            }

            System.out.println("==============|==============");
            System.out.println("    JUGADOR   |  ADVERSARIO");
            System.out.println("==============|==============");
            System.out.printf("%-3s %-15s"," ", jugadorJugada);
            if (jugadorJugada == piedra && maquinaJugada == piedra) {
                System.out.println(piedra);
                System.out.println("-----------------------------");
                System.out.println("Empate.");
                System.out.println();
            }
            if (jugadorJugada == tijeras && maquinaJugada == tijeras) {
                System.out.println(tijeras);
                System.out.println("-----------------------------");
                System.out.println("Empate.");
                System.out.println();
            }
            if (jugadorJugada == papel && maquinaJugada == papel) {
                System.out.println(papel);
                System.out.println("-----------------------------");
                System.out.println("Empate.");
                System.out.println();
            }
            if (jugadorJugada == piedra && maquinaJugada == tijeras) {
                System.out.println(tijeras);
                System.out.println("-----------------------------");
                System.out.println(jugadorGanador);
                System.out.println();
            }
            if (jugadorJugada == piedra && maquinaJugada == papel) {
                System.out.println(papel);
                System.out.println("-----------------------------");
                System.out.println(adversarioGandaro);
                System.out.println();
            }
            if (jugadorJugada == papel && maquinaJugada == piedra) {
                System.out.println(piedra);
                System.out.println("-----------------------------");
                System.out.println(jugadorGanador);
                System.out.println();
            }
            if (jugadorJugada == papel && maquinaJugada == tijeras) {
                System.out.println(tijeras);
                System.out.println("-----------------------------");
                System.out.println(adversarioGandaro);
                System.out.println();
            }
            if (jugadorJugada == tijeras && maquinaJugada == piedra) {
                System.out.println(piedra);
                System.out.println("-----------------------------");
                System.out.println(adversarioGandaro);
                System.out.println();
            }
            if (jugadorJugada == tijeras && maquinaJugada == papel) {
                System.out.println(papel);
                System.out.println("-----------------------------");
                System.out.println(jugadorGanador);
                System.out.println();
            }

        }

        sc.close();

    }

}
