package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Tarjeta_de_Claves {

    public Tarjeta_de_Claves() {

        Scanner sc = new Scanner(System.in);

        int[][] tarjeta = generaTarjeta();
        String[] letras = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

        System.out.printf("%7d %4d %4d %4d %4d %4d %4d %4d %4d %4d%n", 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("=======================================================");

        for (int i = 0; i < tarjeta.length; i++) {
            System.out.print(letras[i] + " | ");
            System.out.println(Arrays.toString(tarjeta[i]));
        }
        System.out.println();

        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        int contraseña = tarjeta[y][x];

        System.out.print("Introduzca la clave de la posicion " + letras[y] + "-" + x + ". Tienes 3 intentos : ");
        int contraseñaIntroducida = sc.nextInt();
        

        for (int i = 2; i >= 0; i--) {
            if (contraseña == contraseñaIntroducida) {
                System.out.println("¡ACERTASTE!");
                break;
            }
            if (i == 0) {
                System.out.println("Te quedaste sin intentos.");
                break;
            }
            else {
                System.out.println("Fallaste :(  Tienes "+i+" intentos restantes.");
                System.out.print("Introduzca la clave de la posicion " + letras[y] + "-" + x + " de nuevo : ");
                contraseñaIntroducida = sc.nextInt();
            }
        }

        sc.close();
    }

    private int[][] generaTarjeta() {

        int[][] tarjeta = new int[10][10];
        int[] numerosGenerados = new int[100];
        int contNumGenerados = 0;
        boolean repetido;

        for (int y = 0; y < tarjeta.length; y++) {

            for (int x = 0; x < tarjeta[0].length; x++) {

                do {
                    int numRandom = (int) (Math.random() * (999 - 100 + 1) + 100);
                    tarjeta[y][x] = numRandom;

                    repetido = comprobacionRepeticion(numRandom, numerosGenerados);

                    numerosGenerados[contNumGenerados] = numRandom;

                } while (repetido == true);
                contNumGenerados++;
            }
        }

        return tarjeta;
    }

    private boolean comprobacionRepeticion(int numRandom, int[] numerosGenerados) {

        boolean repetido = false;

        for (int x = 0; x < numerosGenerados.length; x++) {

            if (numRandom == numerosGenerados[x]) {
                repetido = true;
                break;
            }
        }

        return repetido;
    }

}
