package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fichero_Secuencial {
    public Fichero_Secuencial() throws IOException {

        // crear fichero
        File fichero;
        fichero = new File("alumnos.txt");
        if (!fichero.exists())
            fichero.createNewFile();

        // crear lo que leera el fichero
        FileReader fr = null;
        BufferedReader br = null;
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);

        // leer fichero
        /*
         * String nombre = br.readLine();
         * System.out.println(nombre);
         * String nombre2 = br.readLine();
         * System.out.println(nombre2);
         * String nombre3 = br.readLine();
         * System.out.println(nombre3);
         * String nombre4 = br.readLine();
         * System.out.println(nombre4);
         */

        String nombre;
        while ((nombre = br.readLine()) != null) {
            System.out.println(nombre);
        }

        fr.close();
        br.close();
        fr = null;
        br = null;

        // ================================================

        fichero = new File("daw.txt");
        if (!fichero.exists())
            fichero.createNewFile();

        fr = new FileReader(fichero);
        br = new BufferedReader(fr);

        String nombreDaw;
        while ((nombreDaw = br.readLine()) != null) {
            String[] nombreSplit = nombreDaw.split(",");
            for (int i = 0; i < nombreSplit.length; i++) {
                System.out.println(nombreSplit[i]);
            }
        }
        fr.close();
        br.close();
        fr = null;
        br = null;
        // ================================================

        
        
    }

}
