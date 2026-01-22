package ejercicios;

import java.util.Arrays;

public class Boletos {

    public Boletos() {
        int[] boletoPremiado = generarBoleto();
        System.out.println("============================================================");
        System.out.println("                   SORTEO DE LA LOTERÍA");
        System.out.println("============================================================");
        System.out.println("BOLETO PREMIADO " + Arrays.toString(boletoPremiado));
        System.out.println("------------------------------------------------------------");

        for (int i = 1; i > 0; i++) { // CONTADOR DE BOLETOS GENERADOS
            int[] boleto = generarBoleto();
            int aciertos = comprobarAciertos(boleto, boletoPremiado);
            System.out.printf("BOLETO %-4d ==> %-25s ACIERTOS : %d %n", i, Arrays.toString(boleto), aciertos);
            if (aciertos == 6) {
                System.out.println("OLE TUS COJONE. HAS GENERADO " + i + " EN TOTAL.");
                System.out.println("El boleto premiado es: " + Arrays.toString(boletoPremiado));
                break;
            }
        }
        System.out.println("============================================================");

        int[] boletoquelevaatocaramimadre = generarBoleto();
        System.out.println(Arrays.toString(boletoquelevaatocaramimadre));
    }

    public int[] generarBoleto() {
        int[] numerosBoleto = new int[49]; // INTERVALO NUMEROS BOLETO
        int[] boleto = new int[6]; // CANT NUMEROS ALEATORIOS DEL BOLETO

        for (int i = 0; i < numerosBoleto.length; i++) {
            numerosBoleto[i] = i + 1;
        }

        for (int n = 0; n < boleto.length; n++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = (int) (Math.random() * numerosBoleto.length);
            } while (numerosBoleto[numeroAleatorio] == 0);

            boleto[n] = numerosBoleto[numeroAleatorio];
            numerosBoleto[numeroAleatorio] = 0;
        }
        return boleto;
    }

    public int comprobarAciertos(int[] boleto, int[] boletoPremiado) {
        int aciertos = 0;
        for (int i = 0; i < boleto.length; i++) {
            if (boleto[i] == boletoPremiado[i])
                aciertos++;
        }
        return aciertos;
    }

}
