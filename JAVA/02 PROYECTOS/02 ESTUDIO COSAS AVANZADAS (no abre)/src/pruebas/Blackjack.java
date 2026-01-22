package pruebas;

import java.util.Arrays;

public class Blackjack {

    public Blackjack() {

        // y = 4 x = 14 | total = 56
        String[][] baraja = {
                  //0    //1    //2    //3    //4    //5    //6    //7    //8     //9    //10   //11   //12
                { "|2|", "|3|", "|4|", "|5|", "|6|", "|7|", "|8|", "|9|", "|10|", "|J|", "|Q|", "|K|", "|AS|" },
                { "|2|", "|3|", "|4|", "|5|", "|6|", "|7|", "|8|", "|9|", "|10|", "|J|", "|Q|", "|K|", "|AS|" },
                { "|2|", "|3|", "|4|", "|5|", "|6|", "|7|", "|8|", "|9|", "|10|", "|J|", "|Q|", "|K|", "|AS|" },
                { "|2|", "|3|", "|4|", "|5|", "|6|", "|7|", "|8|", "|9|", "|10|", "|J|", "|Q|", "|K|", "|AS|" } };

        String[][] barajaAux = Arrays.copyOf(baraja, baraja.length);

        int dineroInicial = 1000;
        int sumaCartasJugador = 0;
        int sumaCartasCrupier = 0;
        String cartaBocaAbajo = "|x|";

        boolean seguirJugando = true;

        int cartaAleatoriaArray[] = new int[2];

        do {

            System.out.println("¡EMPIEZA LA PARTIDA!");

            for (int i = 1; i > 0; i++) {

                cartaAleatoriaArray = cartaAleatoria(barajaAux);
                if (cartaAleatoriaArray[1] >= 0 && cartaAleatoriaArray[1] <= 8) {
                    sumaCartasCrupier += cartaAleatoriaArray[1] + 2;
                }
                else if (cartaAleatoriaArray[1] >= 9 && cartaAleatoriaArray[1] <= 11) {
                    sumaCartasCrupier += 11;
                }
                else if (cartaAleatoriaArray[1] == 12) {

                    if (sumaCartasCrupier + 11 > 21) {
                        sumaCartasCrupier++;
                    }
                    else if (sumaCartasCrupier + 11 < 21) {
                        sumaCartasCrupier+= 11;
                    }
                    
                }
                

                barajaAux[cartaAleatoriaArray[0]][cartaAleatoriaArray[1]] = "";

                cartaAleatoriaArray = cartaAleatoria(barajaAux);
                sumaCartasJugador += cartaAleatoriaArray[1];

                barajaAux[cartaAleatoriaArray[0]][cartaAleatoriaArray[1]] = "";


            }

        } while (seguirJugando == true);

    }

    public int[] cartaAleatoria(String[][] barajaAux) {
        int numRamdomY = 0;
        int numRandomX = 0;
        do {
            numRandomX = (int) (Math.random() * 12);
            numRamdomY = (int) (Math.random() * 3);

            int[] cartaAleatoria = { numRamdomY, numRandomX };

            return cartaAleatoria;
        } while (barajaAux[numRamdomY][numRandomX] == "");
    }

    public int[] sumarCartas;

}
