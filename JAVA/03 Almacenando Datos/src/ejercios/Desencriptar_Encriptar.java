package ejercios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Desencriptar_Encriptar {

    public Desencriptar_Encriptar() throws IOException {

        desencriptar();

    }

    private void desencriptar() throws IOException {

        String abecedario = "abcdefghijklmnopqrstuvwxyz";

        File fichero = new File("mensajeSecreto.txt");
        FileReader fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);

        String datos = br.readLine();
        String[] datosArray = datos.split(",");
        System.out.println(Arrays.toString(datosArray));

        int cantidadPalabras = Integer.parseInt(datosArray[0]);
        String frase = "";

        int puntero = 1;

        for (int posicionPalabras = 0; posicionPalabras < cantidadPalabras; posicionPalabras++) {

            for (int i = puntero + 1; i <= Integer.parseInt(datosArray[puntero]) * 2 + puntero; i+=2) {
                int posicionLetra = Integer.parseInt(datosArray[i]);
                int posicionRelativa = Integer.parseInt(datosArray[i + 1]);
                if (posicionRelativa % 2 == 0) {
                    frase+= abecedario.substring(posicionLetra - 1, posicionLetra);
                }
                else frase+= abecedario.substring((26 - posicionLetra), (26 - posicionLetra) + 1);
            }
            puntero+= (Integer.parseInt(datosArray[puntero]) * 2) + 1;
            frase+= " ";
        }
        System.out.println(frase);

        fr.close();
        br.close();
        fr = null;
        br = null;
        
        

    }

}
