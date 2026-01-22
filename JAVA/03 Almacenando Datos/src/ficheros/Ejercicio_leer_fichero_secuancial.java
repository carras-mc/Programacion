package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_leer_fichero_secuancial {

    public Ejercicio_leer_fichero_secuancial() throws IOException {

        File fichero;
        fichero = new File("notas.txt");

        FileReader fr = null;
        BufferedReader br = null;
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);

        String nombres = br.readLine();
        String[] nombresArray = nombres.split(",");
        String asignaturas = br.readLine();
        String[] asignaturasArray = asignaturas.split(",");

        String datos;
        String[][] notasArray = new String[nombresArray.length][asignaturasArray.length];

        int cont = 0;
        while ((datos = br.readLine()) != null) {

            notasArray[cont] = datos.split(",");
            cont++;
        }

        for (int i = 0; i < asignaturasArray.length; i++) {
            if (i == 0) {
                System.out.printf("%-8s", " ");
            }
            System.out.printf("%-19s", asignaturasArray[i]);
        }
        System.out.println();

        for (int i = 0; i < nombresArray.length; i++) {
            System.out.printf("%-6s %-7s", nombresArray[i], " : ");
            for (int index = 0; index < asignaturasArray.length; index++) {
                System.out.printf("%-15s", notasArray[i][index]);
            }
            System.out.println();
        }

        fr.close();
        br.close();
        fr = null;
        br = null;

        // ===================================================

        // escribir en un fichero

        nombresArray[0] = "Miguel de Cervantes";
        asignaturasArray[0] = "Python";
        notasArray[0][0] = "10";

        FileWriter fw = null;
        BufferedWriter bw = null;
        fw = new FileWriter(fichero);
        bw = new BufferedWriter(fw);

        datos = String.join(",", nombresArray);
        // System.out.println(datos);
        bw.write(datos);
        bw.newLine();
        datos = String.join(",", asignaturasArray);
        // System.out.println(datos);
        bw.write(datos);
        bw.newLine();
        for (int i = 0; i < notasArray.length; i++) {

            datos = String.join(",", notasArray[i]);
            bw.write(datos);
            bw.newLine();

        }
        bw.flush();
        fw.close();
        bw.close();

    }

    /*
     * private String convertirACadena(int[] nota) {
     * String resultado = "";
     * for (int i = 0; i < nota.length; i++) {
     * resultado = nota[i];
     * if (i < nota.length - 1) {
     * resultado += ",";
     * }
     * }
     * return resultado;
     * }
     */

}
