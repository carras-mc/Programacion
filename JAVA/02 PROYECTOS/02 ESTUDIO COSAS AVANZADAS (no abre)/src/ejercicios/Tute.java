package ejercicios;

import java.util.Arrays;

public class Tute {

    public Tute() {

        String[] barajaEspañola = {
                "1O", "2-O", "3-O", "4-O", "5-O", "6-O", "7-O", "S-O", "C-O", "R-O",
                "1-C", "2-C", "3-C", "4-C", "5-C", "6-C", "7-C", "S-C", "C-C", "R-C",
                "1-E", "2-E", "3-E", "4-E", "5-E", "6-E", "7-E", "S-E", "C-E", "R-E",
                "1-B", "2-B", "3-B", "4-B", "5-B", "6-B", "7-B", "S-B", "C-B", "R-B" };

        int min = 0;
        int max = 39;
        int cant = 10;
        int jugadores = 4;

        int[][] jugada = generarNumeroAletorioSinRepetición(min, max, cant, jugadores);

        for (int index = 0; index < jugada.length; index++) {
            System.out.println(Arrays.toString(jugada[index]));
        }

        
        

    }

    public int[][] generarNumeroAletorioSinRepetición(int numMin, int numMax, int cant, int jugadores) {

        int[][] numeroAleatorioGenerados = new int[jugadores][cant];

        for (int i = 0; i < numeroAleatorioGenerados.length; i++) {
            Arrays.fill(numeroAleatorioGenerados[i], -1);
        }
        
        int numeroAleatorio;
        for (int y = 0; y < numeroAleatorioGenerados.length; y++) {

            for (int x = 0; x < cant; x++) {

                do {
                    numeroAleatorio = (int) (Math.random() * (numMax - numMin + 1) + numMin);

                } while (repetido(numeroAleatorio, numeroAleatorioGenerados));

                numeroAleatorioGenerados[y][x] = numeroAleatorio;
            }
        }
        return numeroAleatorioGenerados;
    }

    public boolean repetido(int numeroAleatorio, int[][] numeroAleatorioGenerados) {
        boolean repe = false;
        for (int y = 0; y < numeroAleatorioGenerados.length; y++) {

            for (int x = 0; x < numeroAleatorioGenerados[0].length; x++) {
                if (numeroAleatorioGenerados[y][x] == numeroAleatorio) {
                    repe = true;
                    break;
                }
            }
        }
        return repe;
    }

}
