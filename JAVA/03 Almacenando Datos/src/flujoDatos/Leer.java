package flujoDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {

    public Leer() {


    }

    public static String dato() throws IOException {
        
        String dato = "";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        dato = br.readLine();
        return dato;

    }

    public static int datoInt() throws IOException, NumberFormatException {

        int num = 0;
        String datoCadena = dato();
        num = Integer.parseInt(datoCadena);
        // tmb se puede : num = Integer.paarseInt(dato());

        return num;
    }

}
