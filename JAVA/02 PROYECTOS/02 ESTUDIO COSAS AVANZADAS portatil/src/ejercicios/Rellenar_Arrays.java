package ejercicios;

import java.util.Arrays;

public class Rellenar_Arrays {

    public Rellenar_Arrays() {

        /*
         * 3.-Disena un programa en Java que rellene un array de 4x4 de la siguiente
         * manera:
         * 1 0 0 0 x0 y0
         * 0 1 0 0 x1 y1
         * 0 0 1 0 x2 y2
         * 0 0 0 1 x3 y3
         */

        int[][] array3 = new int[4][4];

        for (int xy = 0; xy < array3.length; xy++) {
            array3[xy][xy] = 1;
            System.out.println(Arrays.toString(array3[xy]));
        }
        System.out.println("-----------------------------------------------------");

        /*
         * 4.-Disena un programa en Java que rellene un array de 4x4 de la siguiente
         * manera:
         * 0 0 0 1 x3 y0
         * 0 0 1 0 x2 y1
         * 0 1 0 0 x1 y2
         * 1 0 0 0 x0 y3
        */

        int[][] array4 = new int[4][4];
        
        int x = 3;
        int y = 0;
        int i = array4.length;
        do {
        
            array4[y][x] = 1;
            System.out.println(Arrays.toString(array4[y]));
            x--;
            y++;
            i--;

            
        } while(i > 0);

        

    }

}
