package ejercicios;

import java.util.Arrays;

public class Ley_dHondt {

    public Ley_dHondt() {

        // int[][] partidosYvotos = new int [7][50];
        // int censo = 677904;

        int numEscaños = 7;
        int[] numeroVotosPorPartido = { 100, 250, 50 };
        String[] partidos = { "P1", "P2", "P3" };
        int censo = 410;

        double[][] matrizVotos = calcularVotos(numeroVotosPorPartido, numeroVotosPorPartido, numEscaños);

        for (int i = 0; i < matrizVotos.length; i++) {
            System.out.println(Arrays.toString(matrizVotos[i]));// (Arrays.toString(matrizEscaños[i]));
        }

        calcularEscaños(matrizVotos, partidos, numEscaños, numeroVotosPorPartido);
    }

    private double[][] calcularVotos(int[] partidos, int[] numeroVotosPorPartido, int escaños) {

        double[][] matrizVotos = new double[partidos.length][escaños];

        for (int y = 0; y < matrizVotos.length; y++) {
            for (int x = 0; x < matrizVotos[0].length; x++) {
                if (x == 0) {
                    matrizVotos[y][0] = numeroVotosPorPartido[y];
                }
                if (x > 0) {
                    matrizVotos[y][x] = Math.floor(matrizVotos[y][0] / (x + 1) * 100) / 100;
                }
            }
        }
        return matrizVotos;
    }

    private void calcularEscaños(double[][] matrizVotos, String[] partidos, int numEscaños,
            int[] numeroVotosPorPartido) {

        double max = 0;
        int xNumMax = 0;
        int yNumMax = 0;

        int[] escaños = new int[partidos.length];

        System.out.println(max);
        for (int i = 0; i < numEscaños; i++) {

            for (int y = 0; y < matrizVotos.length; y++) {
                for (int x = 0; x < matrizVotos[0].length; x++) {

                    if (matrizVotos[y][x] > max) {

                        max = matrizVotos[y][x];
                        xNumMax = x;
                        yNumMax = y;

                    } else if (matrizVotos[y][x] == max) {
                        // Desempate: gana el que tenga más votos totales
                        if (numeroVotosPorPartido[y] > numeroVotosPorPartido[yNumMax]) {
                            xNumMax = x;
                            yNumMax = y;
                        }
                    }

                    // System.out.println(Arrays.deepToString(matrizVotos));
                }
            }
            escaños[yNumMax]++;
            matrizVotos[yNumMax][xNumMax] = 0;
            max = 0;
        }

        System.out.println(Arrays.toString(escaños));

    }

}
