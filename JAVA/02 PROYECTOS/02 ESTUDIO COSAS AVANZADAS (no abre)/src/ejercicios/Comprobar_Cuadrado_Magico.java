package ejercicios;

public class Comprobar_Cuadrado_Magico {

    public Comprobar_Cuadrado_Magico() {

        // Crear un método al que se le manda una matriz cuadrada (mismo numero de filas
        // y columnas) y
        // que me diga si es un cuadrado mágico (todas las filas, columnas y diagonales
        // suman lo mismo)

        int[][] cuadradoMágico = {
                { 4, 14, 15, 1 },   
                { 9, 7, 6, 12 },
                { 5, 11, 10, 8 },
                { 16, 2, 3, 13 }

        

        };

        boolean filasMagico = recorrerFilas(cuadradoMágico);
        boolean columasMagico = recorrerColumnas(cuadradoMágico);
        boolean diagonalesMagico = recorrerDiagonales(cuadradoMágico);
        if (filasMagico == true && columasMagico == true && diagonalesMagico == true)
            System.out.println("El cuadrado es mágico");
        else
            System.out.println("El cuadrado no es mágico");

    }

    private boolean recorrerFilas(int[][] cuadradoMágico) {
        int sumaFilaAux = 0;
        boolean esMagico = true;
        for (int y = 0; y < cuadradoMágico.length; y++) {
            int sumaFila = 0;

            for (int x = 0; x < cuadradoMágico.length; x++) {
                sumaFila += cuadradoMágico[y][x];
            }
            if (y == 0) {
                sumaFilaAux = sumaFila;
            }
            if (sumaFila != sumaFilaAux) {
                esMagico = false;
            }
        }
        return esMagico;
    }

    private boolean recorrerColumnas(int[][] cuadradoMágico) {
        int sumaFilaAux = 0;
        boolean esMagico = true;
        for (int x = 0; x < cuadradoMágico.length; x++) {
            int sumaFila = 0;

            for (int y = 0; y < cuadradoMágico.length; y++) {
                sumaFila += cuadradoMágico[y][x];
            }
            if (x == 0) {
                sumaFilaAux = sumaFila;
            }
            if (sumaFila != sumaFilaAux) {
                esMagico = false;
            }
        }
        return esMagico;
    }

    private boolean recorrerDiagonales(int[][] cuadradoMágico) {

        int sumaFilaAux = 0;
        boolean esMagico = true;
        int sumaFila = 0;

        for (int xy = 0; xy < cuadradoMágico.length; xy++) {

            sumaFila += cuadradoMágico[xy][xy];
        }
        sumaFilaAux = sumaFila;
        sumaFila = 0;
        int x = cuadradoMágico.length;

        for (int y = 0; y < cuadradoMágico.length; y++) {
            x--;
            sumaFila += cuadradoMágico[y][x];
            
        }

        if (sumaFila != sumaFilaAux) {
            esMagico = false;
        }
        return esMagico;

    }

}
