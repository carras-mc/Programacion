package vista;

import figuras.Circulo;
import figuras.Punto;
import figuras.Rectangulo;
import modelo.Persona1;
import modelo.Persona2;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(":)");

        // estudioClasePersona();
        //estudioConstructores();
        //estudioArgumentos();
        estudioPropiedadesYMetodos();
        estudioEquals();
        pasoValorReferencia();
    }

    // =================== ESTUDIO CONSTRUCTORES Y CLASES =======================================================

    private static void estudioConstructores() {

        Persona2 persona = new Persona2("Marcos", "Muñoz");
        persona = null;
        persona = new Persona2("Marcos", "Muñoz", 19, "32954840A", 177, 70.5f);
        System.out.println();
    }

    private static void estudioClasePersona() {
        
        // creamos personas
        Persona1 persona = new Persona1(); 
        Persona1 persona2 = new Persona1();
        Persona1 persona3 = new Persona1();

        
        persona.morir();
        persona2.nacer();



        //cuando no queramos seguir utilizandolas las ponemos en null
        persona = null;
        persona2 = null;

        //si queremos volver a utilizarlo debemos de instanciarlo de nuevo
        persona = new Persona1();
        persona.hablar();
        
    }

    // ================================ ESTUDIO PROPIEDADES Y METODOS ====================================

    private static void estudioPropiedadesYMetodos() {

        Persona3 persona1 = new Persona3();
        persona1.setNombre("Pedrito");

        try {
            Persona3 persona2 = new Persona3("Chema", "Puto Vago", "51849647C");
            System.out.println(persona2.toString());
            System.out.println(persona2.mostrarDatos());
        } catch (DniException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(persona1.getNombre());

    }

    private static void estudioEquals() {

        try {
            Persona3 persona2 = new Persona3("Chema", "Puto Vago", "51849647C");
            Persona3 persona3 = new Persona3("Chema", "Puto Vago", "51849647C");
            Persona3 persona4 = new Persona3("Marcos", "Muñoz Carrasco", 19, "32954840A", 178, 70.2f);
            System.out.println(persona2.equals(persona3));
            System.out.println(persona2.hashCode());
            System.out.println(persona3.hashCode());
            System.out.println(persona2.toString().equals(persona3.toString()));
            System.out.println(persona4.toString());
        } catch (DniException e) {
            System.out.println(e.getMessage());
        }

    }

    //===================================== FIGURAS ====================================================

    private static void estudioArgumentos() {
        
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(5,0);
        Punto punto3 = new Punto(5,3);
        Punto punto4 = new Punto(0,3);
        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3, punto4);
        Punto[] puntos = {punto1, punto2, punto3, punto4};
        rectangulo = new Rectangulo(puntos);
        System.out.println(rectangulo.toString());

        

        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.setOtraFigura(punto1, punto2, punto3);

    }

    private static void pasoValorReferencia() {

        Circulo circle = new Circulo(2, 3);
        System.out.println(circle); 
        moveCircle(circle, 23, 56);
        System.out.println(circle);

    }

    private static void moveCircle(Circulo circle, int x, int y) {
       
        circle.setX(circle.getX() + x);
        circle.setY(circle.getY() + y);
        
        circle = new Circulo(15,10); // se crea una referencia a un objeto nuevo. nuevo objeto del método. no toca la referencia primitiva  
        System.out.println(circle);
    }
}   
