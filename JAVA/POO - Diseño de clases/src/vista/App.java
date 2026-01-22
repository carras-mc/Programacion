package vista;

import modelo.Persona;
import modelo.Persona1;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(":)");

        // estudioClasePersona();
        estudioConstructores();
    }

    private static void estudioConstructores() {

        Persona1 persona = new Persona1("Marcos", "Muñoz");
        persona = null;
        persona = new Persona1("Marcos", "Muñoz", 19, "32954840A", 177, 70.5f);
        System.out.println();
    }

    private static void estudioClasePersona() {
        
        // creamos personas
        Persona persona = new Persona(); 
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        
        persona.morir();
        persona2.nacer();



        //cuando no queramos seguir utilizandolas las ponemos en null
        persona = null;
        persona2 = null;

        //si queremos volver a utilizarlo debemos de instanciarlo de nuevo
        persona = new Persona();
        persona.hablar();
        
    }
}
