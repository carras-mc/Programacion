package modelo;

import excepciones.DniException;

public class Persona3 {

    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private int estatura;
    private float peso;


    // CONSTRUCTORES
    public Persona3() {

    }

    public Persona3(String nombre, String apellidos, String dni) throws DniException {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setDni(dni);
    }

    public Persona3(String nombre, String apellidos, int edad, String dni, int estatura, float peso) throws DniException {
        this(nombre, apellidos, dni);
        this.setEdad(edad);
        this.setEstatura(estatura);
        this.setPeso(peso);
    }

    // SETTERS GETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) throws DniException {
        validaDNI(dni);
        this.dni = dni;
    }

    private void validaDNI(String dni) throws DniException {

        if (dni == null || dni.length() != 9) {
            throw new DniException();
        }
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public int getEstatura() {
        return estatura;
    }

    public float getPeso() {
        return peso;
    }

    public String mostrarDatos() {
        return nombre + "," + apellidos + "," + edad + "," + dni;
    }

    @Override
    public String toString() {
        return nombre + "," + apellidos + "," + edad + "," + dni
                + "," + estatura + "," + peso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona3 other = (Persona3) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

}


