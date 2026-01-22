package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Cuadrado_Magico {

    public Cuadrado_Magico() throws IOException {

        File fichero;
        fichero = new File("matrices.txt");

        FileReader fr = null;
        BufferedReader br = null;
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);

        int numMatrices = Integer.parseInt(br.readLine());

        int[][] matriz;
        boolean esCuadradoMagico = false;

        for (int i = 0; i < numMatrices; i++) {

            int tamañoMatriz = Integer.parseInt(br.readLine());
            matriz = new int[tamañoMatriz][tamañoMatriz];
            String[] datosArray = new String[tamañoMatriz];

            for (int y = 0; y < tamañoMatriz; y++) {

                String datos = br.readLine();
                datosArray = datos.split(",");

                for (int x = 0; x < tamañoMatriz; x++) {

                    matriz[y][x] = Integer.parseInt(datosArray[x]);
                }
            }

            for (int c = 0; c < tamañoMatriz; c++) {
                System.out.println(Arrays.toString(matriz[c]));
            }
            System.out.println();

            esCuadradoMagico = comprobacionCuadradoMagico(matriz);
            if (esCuadradoMagico == true) {
                System.out.println("Es un cuadrado mágico.");
            } else
                System.out.println("No es un cuadrado mágico.");
            System.out.println();

        }

        fr.close();
        br.close();
        fr = null;
        br = null;
        

    }

    private boolean comprobacionCuadradoMagico(int[][] matriz) {

        int numMagico = 0;
        int acumulador;
        boolean cuadradoMagico = false;

        // horizontales
        boolean horizontales = true;

        for (int y = 0; y < matriz.length; y++) {
            acumulador = 0;
            for (int x = 0; x < matriz.length; x++) {

                acumulador += matriz[y][x];
            }
            if (y == 0)
                numMagico = acumulador;
            if (numMagico != acumulador) {
                horizontales = false;
                break;
            }
        }

        // verticales
        boolean verticales = true;

        for (int y = 0; y < matriz.length; y++) {
            acumulador = 0;
            for (int x = 0; x < matriz.length; x++) {

                acumulador += matriz[x][y];
            }
            if (numMagico != acumulador) {
                verticales = false;
                break;
            }
        }

        // diagonales

        boolean diagonales = true;
        acumulador = 0;

        for (int xy = 0; xy < matriz.length; xy++) {

            acumulador += matriz[xy][xy];

        }
        if (numMagico != acumulador) {

            diagonales = false;
        }

        if (diagonales == true) {
            acumulador = 0;

            for (int y = 0; y < matriz.length; y++) {
                int x = (matriz.length - 1) - y;

                acumulador += matriz[x][y];
            }
            if (numMagico != acumulador) {
                    diagonales = false;
                }

        }

        if (horizontales == true && verticales == true && diagonales == true) {
            cuadradoMagico = true;
        }

        return cuadradoMagico;

    }

}
