package empresa;

public class Empleado {
    public String nombre;
    private double salario;
    protected String numeroEmpleado;
    int antiguedad;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.numeroEmpleado = generarNumeroEmpleado();
        this.antiguedad = 0;
    }

    public void mostrarInformacionBasica() {
        System.out.println(" Empleado: " + nombre);
    }

    private double calcularImpuestos() {
        // Simulación simple: 21% de impuestos
        return salario * 0.21;
    }

    protected void asignarNumeroEmpleado(String numero) {
        this.numeroEmpleado = numero;
        System.out.println(" Número de empleado asignado: " + numero);
    }

    void actualizarAntiguedad(int años) {
        this.antiguedad = años;
        System.out.println(" Antigüedad actualizada a " + años + " años");
    }

    public double calcularSalarioNeto() {
        double impuestos = calcularImpuestos(); // Acceso a método privado desde dentro
        return salario - impuestos;
    }

    public void mostrarInformacionCompleta() {
        System.out.println("\n--- INFORMACIÓN COMPLETA DEL EMPLEADO ---");
        System.out.println("Nombre (public): " + nombre);
        System.out.println("Salario bruto (private): " + salario + "€");
        System.out.println("Número empleado (protected): " + numeroEmpleado);

        System.out.println("Antigüedad (sin modificador): " + antiguedad + " años");
        System.out.println("Impuestos (calculado con método private): " + calcularImpuestos() + "€");
        System.out.println("Salario neto: " + calcularSalarioNeto() + "€");
    }

    private String generarNumeroEmpleado() {
        return "EMP" + System.currentTimeMillis() % 10000;
    }
}