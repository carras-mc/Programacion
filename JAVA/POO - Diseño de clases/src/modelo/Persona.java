package modelo;

public class Persona {

    String nombre;
    String apellidos;
    int edad;
    int estatura;
    float peso;

    public Persona() {

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
