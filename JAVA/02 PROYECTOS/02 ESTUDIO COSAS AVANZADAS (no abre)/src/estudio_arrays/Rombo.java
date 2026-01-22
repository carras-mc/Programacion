package estudio_arrays;

public class Rombo {

    public Rombo() {

        System.out.println("ROMBO");
        System.out.println("=========");
        System.out.println(" ");

        int lados = 5;
        generarEspacios(lados);
        generarCaracteres(lados);

    }

    private void generarEspacios(int lados) {
        for (int i = lados - 1; i > 0; i--) {
            String espacio = ".";
            System.out.println();
            for (int c = 1; c <= i; c++) {
                System.out.print(espacio);
            }
        }
    }

    private void generarCaracteres(int lados) {
        for (int i = 1; i < lados * 2 - 1; i+=2){
            String punto = "o";
            System.out.println();
            for (int c = i; c > 0; c-- ){
                System.out.print(punto);
            }
        }
        
    }

    
}
