package ejercios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Golosinas {
    Scanner sc = new Scanner(System.in);
    String[][] golosinasNombre = null;
    double[][] golosinasPrecio = null;
    int[][] golosinasStock = null;
    int cantVentas = 0;
    boolean apagarMaquina = false;

    public Golosinas() throws NumberFormatException, IOException {
        System.out.println("-----------------------------------");
        System.out.println("         MÁQUINA INICIADA");
        System.out.println("-----------------------------------");
        do {
            System.out.println();
            System.out.println("1 · Mostrar golosinas");
            System.out.println("2 · Pedir golosina");
            System.out.println("3 · Rellenar golosina");
            System.out.println("4 · Apagar máquina");
            System.out.println();
            
            boolean intError;
            int menuInput;
            do {
                menuInput = -1;
                intError = false;
                try {
                    System.out.print("Introduzca que acción desea realizar : ");
                    menuInput = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println();
                    intError = true;
                    System.out.println("Por favor, introduzca un número.");
                    sc.nextLine();
                }
            } while (intError == true);

            sc.nextLine();
            System.out.println();

            leerDatos();

            switch (menuInput) {
                case 1:
                    mostrarGolosinas();
                    break;

                case 2:
                    pedirGolosina();
                    break;

                case 3:
                    rellenarGolosinas();
                    break;
                case 4:
                    apagarMaquina();
                    break;
            }
        } while (apagarMaquina == false);

        sc.close();

    }

    private void rellenarGolosinas() throws IOException {

        String contraseña = "MaquinaExpendedora2017";
        String contraseñaIntroducida = "";
        do {
            System.out.print("Introduzca la contraseña : ");
            contraseñaIntroducida = sc.nextLine();
            System.out.println();

            if (contraseñaIntroducida.equals(contraseña)) {

                String golosinaElegida;
                System.out.print("Introduzca el número del producto : ");
                golosinaElegida = sc.nextLine();
                System.out.println();
                int y = Integer.parseInt(golosinaElegida.substring(1, 2));
                int x = Integer.parseInt(golosinaElegida.substring(0, 1));
                System.out.print("Introduce la cantidad deseada : ");
                int cantidadGolosinas = sc.nextInt();
                golosinasStock[y][x] = cantidadGolosinas;
                reescribirDatos();
            } else
                System.out.println("Contraseña incorrecta.");
        } while (!contraseñaIntroducida.equals(contraseña));

    }

    private void leerDatos() throws IOException {

        File fichero = new File("golosinas.txt");
        FileReader fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);
        int cantGolosinas = Integer.parseInt(br.readLine());
        golosinasNombre = new String[cantGolosinas][cantGolosinas];
        golosinasPrecio = new double[cantGolosinas][cantGolosinas];
        golosinasStock = new int[cantGolosinas][cantGolosinas];

        String datos;
        String[] datosSplit = new String[cantGolosinas];
        for (int y = 0; y < cantGolosinas; y++) {
            datos = br.readLine();
            datosSplit = datos.split(",");
            for (int x = 0; x < cantGolosinas; x++) {
                golosinasNombre[y][x] = datosSplit[x];
            }
        }
        for (int y = 0; y < cantGolosinas; y++) {
            datos = br.readLine();
            datosSplit = datos.split(",");
            for (int x = 0; x < cantGolosinas; x++) {
                golosinasPrecio[y][x] = Double.parseDouble(datosSplit[x]);
            }
        }
        for (int y = 0; y < cantGolosinas; y++) {
            datos = br.readLine();
            datosSplit = datos.split(",");
            for (int x = 0; x < cantGolosinas; x++) {
                golosinasStock[y][x] = Integer.parseInt(datosSplit[x]);
            }
        }

        fr.close();
        br.close();
        fr = null;
        br = null;
    }

    private void pedirGolosina() throws IOException {
        System.out.print("Introduzca el número del producto : ");
        String golosinaElegida = sc.nextLine();
        System.out.println();
        int y = Integer.parseInt(golosinaElegida.substring(1, 2));
        int x = Integer.parseInt(golosinaElegida.substring(0, 1));
        if (golosinasStock[y][x] > 0) {
            System.out
                    .println("Has seleccionado : " + golosinasNombre[y][x] + " | " + golosinasPrecio[y][x] + " Euros");
            golosinasStock[y][x]--;
            cantVentas++;
        } else if (golosinasStock[y][x] <= 0) {
            System.out.println("Lo sentimos, no quedan existencias de : " + golosinasNombre[y][x]);
        }

        reescribirDatos();
    }

    private void mostrarGolosinas() throws IOException {
        System.out.println(
                "============================================================================================");
        System.out.println(
                "--------------------------------------------------------------------------------------------");
        for (int y = 0; y < golosinasNombre.length; y++) {
            for (int x = 0; x < golosinasNombre.length; x++) {
                System.out.printf(" %-20s |", golosinasNombre[y][x]);
            }
            System.out.println();
            for (int x = 0; x < golosinasNombre.length; x++) {
                System.out.printf(" %d %d / %-14.2f |", y, x, golosinasPrecio[y][x]);
            }
            System.out.println();
            System.out.println(
                    "--------------------------------------------------------------------------------------------");
        }
        System.out.println(
                "============================================================================================");
        System.out.println();
    }

    private void reescribirDatos() throws IOException {

        File fichero = new File("golosinas.txt");
        FileWriter fw = new FileWriter(fichero);
        BufferedWriter bw = new BufferedWriter(fw);
        String datos;
        datos = String.valueOf(golosinasNombre.length);
        bw.write(datos);
        bw.newLine();

        for (int i = 0; i < golosinasNombre.length; i++) {

            datos = String.join(",", golosinasNombre[i]);
            bw.write(datos);
            bw.newLine();
        }

        for (int j = 0; j < golosinasNombre.length; j++) {
            datos = "";
            for (int j2 = 0; j2 < golosinasNombre.length; j2++) {
                datos += String.valueOf(golosinasPrecio[j][j2]);
                if (j2 != golosinasNombre.length - 1) {
                    datos += ",";
                }
            }
            bw.write(datos);
            bw.newLine();
        }
        for (int j = 0; j < golosinasNombre.length; j++) {
            datos = "";
            for (int j2 = 0; j2 < golosinasNombre.length; j2++) {
                datos += String.valueOf(golosinasStock[j][j2]);
                if (j2 != golosinasNombre.length - 1) {
                    datos += ",";
                }
            }
            bw.write(datos);
            bw.newLine();
        }
        bw.flush();

        fw.close();
        bw.close();
        fw = null;
        bw = null;
    }

    private void apagarMaquina() {
        apagarMaquina = true;
        System.out.println("Has realizado " + cantVentas + " venta/s.");

    }
}
