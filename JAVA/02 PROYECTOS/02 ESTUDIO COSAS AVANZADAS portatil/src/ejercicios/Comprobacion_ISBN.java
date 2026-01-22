package ejercicios;

import excepciones.InvalidISBNException;

public class Comprobacion_ISBN {

    public Comprobacion_ISBN() {
        // Multiplicar 1 si su posicion es impar y por 3 si es par
        // Sumar todos salvo el ultimo digito q es el digito de control
        // Dividir el resultado entre 10 y obtener el resto
        // Si a 10 le restamos el resto y si es numero que se obtiene es igual al de
        // control el isbn es valido

        String ISBN = "978-84-95354-15-10";
        // 978-84-4152-682-3 | 978-84-8130-252-3 | 978-84-95354-15-0
        String ISBNaux = ISBN;
        int numeroControl = ISBN.charAt(ISBN.length() - 1) - '0';
        ISBNaux = ISBNaux.replace("-", "");
        ISBNaux = ISBNaux.substring(0, ISBNaux.length() - 1);
        int sumaISBN = 0;

        int I = 1;
        for (int i = 0; i < ISBNaux.length(); i++) {

            if (I % 2 != 0) {
                sumaISBN += ((ISBNaux.charAt(i) - '0') * 1);
            }
            if (I % 2 == 0) {
                sumaISBN += ((ISBNaux.charAt(i) - '0') * 3);
            }
            I++;
        }

        int restoSumaISBN = sumaISBN % 10;
        int numeroControlCorrespondiente = 10 - restoSumaISBN;
        if (numeroControlCorrespondiente == 10) numeroControlCorrespondiente = 0;

        try {
            comprobarISBN(ISBNaux, numeroControl, numeroControlCorrespondiente);
        } catch (InvalidISBNException e) {
            System.out.println(e.getMessage());
        }
    }

    private void comprobarISBN(String ISBNaux, int numeroControl, int numeroControlCorrespondiente)
            throws InvalidISBNException {

        if (ISBNaux.length() != 12) {
            throw new InvalidISBNException();
        } else if (numeroControl != numeroControlCorrespondiente) {
            throw new InvalidISBNException();
        } else
            System.out.println("El ISBN introducido es válido.");

    }
}
                                                                                                                                                                                                                          