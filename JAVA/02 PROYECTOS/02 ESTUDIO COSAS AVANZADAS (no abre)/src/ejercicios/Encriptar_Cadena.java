package ejercicios;

import java.util.Arrays;

public class Encriptar_Cadena {

    public Encriptar_Cadena() {

        int[] clave = { 2, 4, 1, 0, 3 };
        String mensaje = "Atacaremos al amanecer";

        // mensaje encriptado array
        String[][] mensajeEncriptadoArray = encriptarMensaje(mensaje, clave);
        System.out.println("========================");
        System.out.println("MENSAJE ENCRIPTADO ARRAY");
        System.out.println("========================");
        for (int i = 0; i < mensajeEncriptadoArray.length; i++) {
            System.out.println(Arrays.deepToString(mensajeEncriptadoArray[i]));
        }
        System.out.println();

        // mensaje encriptado string
        System.out.println("========================");
        System.out.println("   MENSAJE ENCRIPTADO");
        System.out.println("========================");
        String mensajeEncriptadoString = "";

        for (int index = 0; index < mensajeEncriptadoArray.length; index++) {
            for (int i = 0; i < mensajeEncriptadoArray[0].length; i++) {
                mensajeEncriptadoString += mensajeEncriptadoArray[index][i];
            }
        }
        System.out.println(mensajeEncriptadoString);
        System.out.println();

    }

    public String[][] encriptarMensaje(String mensaje, int[] clave) {

        String[][] mensajeEncriptado = new String[mensaje.length() / clave.length + 1][clave.length];

        for (int y = 0; y < mensajeEncriptado.length; y++) {

            for (int x = 0; x < mensajeEncriptado[0].length; x++) {

                mensajeEncriptado[y][x] = " ";
            }
        }

        for (int y = 0; y < mensaje.length() / clave.length + 1; y++) {

            int cant = clave.length * y;

            for (int x = 0; x < clave.length; x++) {

                if (cant + x >= mensaje.length())
                    break;

                char letraMensaje = mensaje.charAt(x + cant);
                mensajeEncriptado[y][clave[x]] = String.valueOf(letraMensaje);

            }
        }

        return mensajeEncriptado;
    }

}
