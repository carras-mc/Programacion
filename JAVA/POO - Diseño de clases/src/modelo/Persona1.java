package modelo;

public class Persona1 {

    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private int estatura;
    private float peso;

    public Persona1() {

    }

    public Persona1(String nombre, String apellidos) {

        this.nombre = nombre;
        this.apellidos = apellidos;  
    }

    public Persona1(String nombre, String apellidos, String dni) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public Persona1(String nombre, String apellidos, int edad) {

        this(nombre, apellidos);
        this.edad = edad;
    }

    public Persona1(String nombre, String apellidos, int edad, String dni, int estatura, float peso) {

        this(nombre, apellidos, dni);
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }


    public void caminar() {
        System.out.println("Estoy caminando");
    }

    public void hablar() {
        System.out.println("Estoy hablando");
    }

    public void nacer() {
        System.out.println("¡¡JODER ESTOY VIVO (pero eres peruano)!!");
    }

    public void morir() {
        System.out.println("Moriste webon");
    }
}
