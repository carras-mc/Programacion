package vista;

import ejercicios.Boletos;
import ejercicios.Caballo_Ajedrez;
import ejercicios.Comprobacion_ISBN;
import ejercicios.Comprobar_Cuadrado_Magico;
import ejercicios.Encriptar_Cadena;
import ejercicios.Frases_Palindromas;
import ejercicios.Hacer_Cuadrado_Magico;
import ejercicios.Juego_Baraja_Espaniola;
import ejercicios.Ley_dHondt;
import ejercicios.Rellenar_Arrays;
import ejercicios.Rompe_Cadenas;
import ejercicios.Tute;
import ejercicios.Menu_Notas;
import estudio_cadenas.Cadenas;
import estudio_cadenas.Ejercicio_Comprobar_DNI;
import estudio_excepciones.Como_Van_Las_Excepciones;
import estudio_excepciones.InvalidAgeException;
import pruebas.PRUEBAS;
import pruebas.Piedra_Papel_Tijeras;

@SuppressWarnings("unused")
public class Main {

    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";
    public static final String RED_BRIGHT     = "\u001B[91m";
    public static final String GREEN_BRIGHT   = "\u001B[92m";
    public static final String YELLOW_BRIGHT  = "\u001B[93m";
    public static final String BLUE_BRIGHT    = "\u001B[94m";
    public static final String MAGENTA_BRIGHT = "\u001B[95m";
    public static final String CYAN_BRIGHT    = "\u001B[96m";
    public static final String WHITE_BRIGHT   = "\u001B[97m";

    public static void main(String[] args) throws Exception {
        System.out.println();

        // new Rombo();
        // new Arrays_Bidimensionales();
        // new Menu_Notas();
        // new Boletos();
        // new Clase_Arrays();
        // new Cuadrado_Magico();
        // new Como_Van_Las_Excepciones();
        // new Rellenar_Array();
        // new Hacer_Cuadrado_Magico();
        // new Juego_Baraja_Espaniola();
        // new Cadenas();
        // new Ejercicio_Comprobar_DNI();
        // new Encriptar_Cadena();
        // new Rompe_Cadenas_UNDONE();
        // new Frases_Palindromas();
        // new Caballo_Ajedrez();
        //new PRUEBAS();
        //new Piedra_Papel_Tijeras();
        //new Comprobacion_ISBN();
        //new Ley_dHondt();
        new Tute();
    }
}
