package estudio_cadenas;

import excepciones.InvalidDniException;

public class Ejercicio_Comprobar_DNI {

    public Ejercicio_Comprobar_DNI() {

        // EJERCICIO: tenemos que comprobar un dni
        // si el dni no es valido tira una excepcion
        // comprobar si tiene la cantidad de numeros de un dni y si la letra que tiene
        // puede estar en un dni
        // mod de 23 del dni y dependiendo del resto debe tener una letra u otra
        // extraer del dni la letra

        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        String DNI = "32954840A";

        try {
            compruebaDni(letrasDni, DNI);
        } catch (InvalidDniException e) {
            System.out.println(e.getMessage());
        }

    }

    public void compruebaDni(String letrasDni, String DNI) throws InvalidDniException {

        String DNInumeros = DNI.substring(0, 8);
        String DNIletra = DNI.substring(8);
        char DNIletraChar = DNI.charAt(8);
        int numeroCorrespondienteALetraDNI = (Integer.parseInt(DNInumeros) % 23);
        char letraCorrespondienteDNI = letrasDni.charAt(numeroCorrespondienteALetraDNI);

        if (DNInumeros.length() != 8)
            throw new InvalidDniException();

        if (letrasDni.contains(DNIletra)) {
        } else
            throw new InvalidDniException();

        if (DNIletraChar == letraCorrespondienteDNI) {
        } else
            throw new InvalidDniException();

    }

}
