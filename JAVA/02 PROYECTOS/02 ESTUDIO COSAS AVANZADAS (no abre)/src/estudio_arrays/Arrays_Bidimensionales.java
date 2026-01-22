package estudio_arrays;

public class Arrays_Bidimensionales {
    public Arrays_Bidimensionales() {
        
        System.out.println("ESTUDIO ARRAY DIMENSIONALES");
        System.out.println("=============================");
        System.out.println();

        int [][] matriz = null;
        matriz = new int [5][30];
        matriz[0][0]=5; matriz[0][1]=7;
        matriz[1][0]=8;
        
        @SuppressWarnings("unused")
        double[][] matriz2 = new double[5][20];
        @SuppressWarnings("unused")
        String [] nombres = {"Ana","Felipe","Luis","María","Fernando","Lupe","Daniel","Francisco","Antonio","Luisa"};
        @SuppressWarnings("unused")
        String [] asignaturas = {"Programación","Sistemas","Base de Datos"};
        int [][] notas = 
        {
        {5,6,7,8,9,3,5,2,8,10},
        {5,6,7,2,9,8,5,0,8,7},
        {9,6,10,8,3,8,5,2,8,10}
        };

        // RECORRER ARRAY POR FILAS

        for (int x = 0; x < notas.length; x++) {

            for (int y = 0; y < notas[x].length; y++) {
                System.out.print(notas[x][y] + " - ");
            }
            System.out.println();
        } 

        System.out.println();

        // RECORRER ARRAY POR COLUMNAS
        
        for (int y = 0; y < notas[0].length; y++) {
            for (int x = 0; x < notas.length; x++) {
                System.out.print(notas[x][y] +" - ");
            }
            System.out.println();
        }

        // ARRAYS CON FILAS DE DISTINTO TAMAÑO
        int [][] ventas = {{2,3,4,5,7},{2,6,4},{1,8}};

        // FOR EACH PARA ARRAYS BIDIMENSIONALES
        
        for (int[] asignatura : notas) {
            
            for(int nota: asignatura) {
                System.out.print(nota +" - ");
            }
            System.out.println();
        }
        
        for (int[] venta : ventas) {

            for (int vent : venta) {
                System.out.print(vent + " - ");
            }
            System.out.println();
        }

        for (int x = 0; x < notas.length; x++){

            int [] modulo = notas[x];
            @SuppressWarnings("unused")
            int notaMedia = calculaMedia(modulo);
            System.out.println();
        }
        
    }

    private int calculaMedia(int[] modulo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculaMedia'");
    }

}
