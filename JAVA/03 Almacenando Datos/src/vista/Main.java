package vista;

import java.io.IOException;

import ejercios.Algoritmo_de_Luhn;
import ejercios.Comprobacion_cuenta_bancaria;
import ejercios.Desencriptar_Encriptar;
import ejercios.Golosinas;
import excepciones.InvalidCuentaBancaria;
import ficheros.Cuadrado_Magico;
import ficheros.Ejercicio_leer_fichero_secuancial;
import ficheros.Fichero_Secuencial;
import ficheros.Tarjeta_Clave;
import flujoDatos.Flujo_de_datos;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println();

        // Flujo_de_datos flujo_de_datos = new Flujo_de_datos();
        // Comprobacion_cuenta_bancaria comprobacion_cuenta_bancaria = new
        // Comprobacion_cuenta_bancaria();
        // new InvalidCuentaBancaria();
        // new Algoritmo_de_Luhn();

        /*
         * try {
         * Fichero_Secuencial fichero = new Fichero_Secuencial();
         * } catch (IOException e) {
         * System.out.println(e.getMessage());;
         * }
         */

        // new Ejercicio_leer_fichero_secuancial();
        // new Cuadrado_Magico();
        // new Tarjeta_Clave();
        // new Golosinas();
        new Desencriptar_Encriptar();
    }
}
