package empresa;

class DepartamentoRRHH {
    private String nombreDepartamento = "Recursos Humanos";

    public void mostrarInfo() {
        System.out.println("Departamento: " + nombreDepartamento);
        System.out.println("Esta clase solo es visible en el paquete 'empresa'");
    }

    public void gestionarEmpleado(Empleado empleado) {
        System.out.println("\n--- Desde DepartamentoRRHH (mismo paquete 'empresa') ---");
        // PUBLIC: Siempre accesible
        empleado.nombre = "Modificado desde RRHH";
        System.out.println(" nombre: Accesible y modificable");
        // PRIVATE: NO accesible ni siquiera desde el mismo paquete
        // empleado.salario = 50000;
        System.out.println(" salario: NO ACCESIBLE (es private)");
        // PROTECTED: Accesible porque estamos en el mismo paquete
        empleado.numeroEmpleado = "EMP-RRHH-001";
        System.out.println(" numeroEmpleado: Accesible (protected en mismo paquete)");
        // SIN MODIFICADOR: Accesible porque estamos en el mismo paquete
        empleado.antiguedad = 3;
        System.out.println(" antiguedad: Accesible (sin modificador en mismo paquete)");
        System.out.println("\nProbando métodos:");
        // Métodos public, protected y sin modificador son accesibles
        empleado.mostrarInformacionBasica();
        empleado.asignarNumeroEmpleado("EMP-2024-001");
        empleado.actualizarAntiguedad(5);
        // Método private NO es accesible
        // empleado.calcularImpuestos();
        System.out.println(" calcularImpuestos(): NO ACCESIBLE (es private)");
    }

    public void contratarNuevoEmpleado() {
        Empleado nuevoEmpleado = new Empleado("Carlos Martínez", 28000);
        System.out.println("\n Nuevo empleado contratado: " + nuevoEmpleado.nombre);
        // Desde aquí podemos gestionar todos los aspectos del empleado
        // excepto los privados
        gestionarEmpleado(nuevoEmpleado);
    }
}
