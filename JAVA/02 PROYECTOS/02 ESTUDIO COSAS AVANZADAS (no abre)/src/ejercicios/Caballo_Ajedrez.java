package ejercicios;

import java.util.Arrays;

public class Caballo_Ajedrez {

    public Caballo_Ajedrez() {

        int[][] tablero = new int[8][8];

        int yc = 1;
        int xc = 1;
        tablero[yc][xc] = 7;

        int mover = 3;

       
        int y;
        for (int x = -2; x <= 2; x++) {

            if (x == -2 || x == 2) {
                y = 1;
                boolean posicionExiste = comprobarPosicion1(tablero, xc, yc, y, x);
                if (posicionExiste == true) {
                    tablero[(yc + y)][(xc + x)] = mover;
                   //tablero[(yc + -(y))][(xc + x)] = mover;
                }
                boolean posicionExiste2 = comprobarPosicion2(tablero, xc, yc, y, x);
                if (posicionExiste2 == true) {
                    //tablero[(yc + y)][(xc + x)] = mover;
                    tablero[(yc + -(y))][(xc + x)] = mover;
                }

            }
            if (x == 1 || x == -1) {
                y = 2;
                boolean posicionExiste = comprobarPosicion1(tablero, xc, yc, y, x);
                if (posicionExiste == true) {
                    tablero[(yc + y)][(xc + x)] = mover;
                    //tablero[(yc + -(y))][(xc + x)] = mover;
                }
                boolean posicionExiste2 = comprobarPosicion2(tablero, xc, yc, y, x);
                if (posicionExiste2 == true) {
                    //tablero[(yc + y)][(xc + x)] = mover;
                    tablero[(yc + -(y))][(xc + x)] = mover;
                }
                
            }

        }
        System.out.println();
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }

    }

    private boolean comprobarPosicion1(int[][] tablero, int xc, int yc, int y, int x) {
        boolean posicionExiste;
        int ycy = yc + y;
        int xcx = xc + x;
        
        if (ycy < 0 || ycy >= tablero.length || xcx < 0 || xcx >= tablero.length) {

            posicionExiste = false;
            return posicionExiste;
        } else {
            posicionExiste = true;
            return posicionExiste;
        }

    }

    private boolean comprobarPosicion2(int[][] tablero, int xc, int yc, int y, int x) {
        boolean posicionExiste;
        int xcx = xc + x;
        int ycy2 = yc + -(y);
        if (xcx < 0 || xcx >= tablero.length || ycy2 < 0
                || ycy2 >= tablero.length) {

            posicionExiste = false;
            return posicionExiste;
        } else {
            posicionExiste = true;
            return posicionExiste;
        }

    }
}
