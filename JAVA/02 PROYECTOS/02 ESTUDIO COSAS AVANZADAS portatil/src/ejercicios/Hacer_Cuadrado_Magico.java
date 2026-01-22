package ejercicios;

import java.util.Arrays;

public class Hacer_Cuadrado_Magico {

    public Hacer_Cuadrado_Magico(){

        int[][] cuadradoMágico = new int[5][5];

        int y = 0;
        int x = 2;

        for (int i = 1; i < 25; i++) {  
            cuadradoMágico[y][x] = i;
            
            if (cuadradoMágico[y][x] % 5 == 0) y++;
            else if (y == 0) {
                y = 4; x++;
            }
            else if (x == 4) {
                x = 0; y--;
            }
            else {
                y--; x++;
            }
        }

        for (int i = 0; i < cuadradoMágico.length; i++) {
            System.out.println(Arrays.toString(cuadradoMágico[i]));
        }
    }

}
