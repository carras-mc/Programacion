package ejercicios;

import java.util.Arrays;

public class Juego_Baraja_Espaniola {

    public Juego_Baraja_Espaniola() {

        // 1- Escoger 4 cartas para cada jugador, sin repeticion (10 veces)
        // 2- Escoger carta ganadora
        // 3- Ver a quien de los dos jugadores le ha salido mas veces la carta ganadora
        int numMax = 39;
        int numMin = 0;
        int cant = 8;

        String[] barajaEspañola = {
                "1-O", "2-O", "3-O", "4-O", "5-O", "6-O", "7-O", "S-O", "C-O", "R-O",
                "1-C", "2-C", "3-C", "4-C", "5-C", "6-C", "7-C", "S-C", "C-C", "R-C",
                "1-E", "2-E", "3-E", "4-E", "5-E", "6-E", "7-E", "S-E", "C-E", "R-E",
                "1-B", "2-B", "3-B", "4-B", "5-B", "6-B", "7-B", "S-B", "C-B", "R-B" };

        System.out.println();
        System.out.println("---------------------------");
        String cartaGanadora = barajaEspañola[(int) (Math.random() * (numMax - numMin + 1) + numMin)]; // CARTA GANADORA
        System.out.println("¡La carta ganadora es: " + cartaGanadora + "!");
        System.out.println("---------------------------");
        String[][] cartasJugador1 = new String[10][4];
        String[][] cartasJugador2 = new String[10][4];
        int aciertosJugador1 = 0;
        int aciertosJugador2 = 0;
        /*
         * int [][] cartasJugador1INT = new int [10][4];
         * int [][] cartasJugador2INT = new int [10][4];
         */

        for (int y = 0; y < 10; y++) { // DIVIDO LA JUGADA GENERADA EN LAS DOS MANOS DE CADA JUGADOR Y LAS CONVIERTO DE
                                       // NÚMEROS A CARTAS

            int[] jugadaGenerada = generarNumeroAletorioSinRepetición(numMin, numMax, cant);
            int[] numerosJugador1 = Arrays.copyOf(jugadaGenerada, 4);
            int[] numerosJugador2 = Arrays.copyOfRange(jugadaGenerada, 4, 8);

            for (int x = 0; x < 4; x++) {

                cartasJugador1[y][x] = barajaEspañola[numerosJugador1[x]];
                
                if (cartasJugador1[y][x] == cartaGanadora)
                    aciertosJugador1++;

                cartasJugador2[y][x] = barajaEspañola[numerosJugador2[x]];

                if (cartasJugador2[y][x] == cartaGanadora)
                    aciertosJugador2++;
                /*
                 * cartasJugador1INT[y][x] = numerosJugador1[x];
                 * cartasJugador2INT[y][x] = numerosJugador2[x];
                 */
            }
        }

        System.out.println("======================="); // MUESTRO LAS CARTAS DEL JUGADOR 1
        System.out.println("   CARTAS JUGADOR 1");
        System.out.println("=======================");
        for (int i = 0; i < cartasJugador1.length; i++) {
            System.out.println(Arrays.toString(cartasJugador1[i]));
            // System.out.println(Arrays.toString(cartasJugador1INT[i]));
        }
        System.out.println();
        System.out.println("Aciertos: " + aciertosJugador1);
        System.out.println();

        System.out.println("======================="); // MUESTRO LAS CARTAS DEL JUGADOR 2
        System.out.println("   CARTAS JUGADOR 2");
        System.out.println("=======================");
        for (int i = 0; i < cartasJugador2.length; i++) {
            System.out.println(Arrays.toString(cartasJugador2[i]));
            // System.out.println(Arrays.toString(cartasJugador2INT[i]));
        }
        System.out.println();
        System.out.println("Aciertos: " + aciertosJugador2);
        System.out.println();

        // QUIEN ES EL GANADOR?
        System.out.println("--------------------------------------");
        if (aciertosJugador2 > aciertosJugador1)
            System.out.println("¡El jugador ganador es el jugador 2!");
        else if (aciertosJugador1 > aciertosJugador2)
            System.out.println("¡El jugador ganador es el jugador 1!");
        else
            System.out.println("           Hay un empate :(");
        System.out.println("--------------------------------------");
    }

    public int[] generarNumeroAletorioSinRepetición(int numMin, int numMax, int cant) {

        int[] numeroAleatorioGenerados = new int[cant];
        Arrays.fill(numeroAleatorioGenerados, -1);
        int numeroAleatorio;

        for (int i = 0; i < cant; i++) {

            do {
                numeroAleatorio = (int) (Math.random() * (numMax - numMin + 1) + numMin);

            } while (repetido(numeroAleatorio, numeroAleatorioGenerados));

            numeroAleatorioGenerados[i] = numeroAleatorio;
        }
        return numeroAleatorioGenerados;
    }

    public boolean repetido(int numeroAleatorio, int[] numeroAleatorioGenerados) {
        boolean repe = false;
        for (int x = 0; x < numeroAleatorioGenerados.length; x++) {
            if (numeroAleatorioGenerados[x] == numeroAleatorio) {
                repe = true;
                break;
            }
        }
        return repe;
    }

}
