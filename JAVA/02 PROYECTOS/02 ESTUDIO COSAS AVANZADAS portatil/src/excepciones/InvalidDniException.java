package excepciones;

public class InvalidDniException extends Exception {

    public InvalidDniException() {

        super("El DNI introducido es inválido");
    }



}
