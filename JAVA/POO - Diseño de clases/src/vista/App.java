package vista;

import figuras.Circulo;
import figuras.Punto;
import figuras.Rectangulo;
import herencia.Consultor;
import herencia.Programador;
import herencia.ProgramadorJunior;
import herencia.Trabajador;
import interfaces.Cebra;
import interfaces.Leon;
import interfaces.Rana;
import listas.Lista_1;
import modelo.Persona1;
import modelo.Persona2;
import modelo.Persona3;
import empresa.Empleado;
import estaticos.Bicicleta;
import excepciones.DniException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(":)");

        // estudioClasePersona();
        //estudioConstructores();
        //estudioArgumentos();
        //estudioPropiedadesYMetodos();
        //estudioEquals();
        //pasoValorReferencia();
        //estudioModificadores();
        //estudioHerencia();
        //estudioInterface();
        //estudioMetodosEstaticos();
        Lista_1 lista_1 = new Lista_1();
        
    }

    private static void estudioInterface() {
        Leon leon=new Leon("mamifero", "sabana");
        Cebra cebra=new Cebra("mamifero", "sabana");
        Rana rana=new Rana("anfibio", "charca");
        leon.acechar();
        cebra.vigilar();
        rana.acechar();
        rana.vigilar();
    }

    private static void estudioHerencia() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║ HERENCIA Y POLIMORFISMO EN JAVA ║");
        System.out.println("╚════════════════════════════════════════╝\n");

        // Crear diferentes tipos de trabajadores
        Programador prog1 = new Programador("Ana García", "12345678A", 2500);
        ProgramadorJunior junior1 = new ProgramadorJunior("Carlos López", "87654321B", 800);
        Consultor consultor1 = new Consultor("María Pérez", "11223344C", 45);

        // El consultor registra sus horas
        consultor1.registrarHoras(120);


        System.out.println("═══════════════════════════════════════════");
        System.out.println(" INFORMACIÓN DE CADA TRABAJADOR");
        System.out.println("═══════════════════════════════════════════\n");

        prog1.mostrarInfo();
        System.out.println();

        junior1.mostrarInfo();
        System.out.println();

        consultor1.mostrarInfo();


        System.out.println("\n═══════════════════════════════════════════");
        System.out.println(" DEMOSTRACIÓN DE POLIMORFISMO");
        System.out.println("═══════════════════════════════════════════\n");

        // POLIMORFISMO: Un array de Trabajadores que contiene objetos de diferentes clases
        Trabajador[] trabajadores = { prog1, junior1, consultor1 };
        System.out.println(" Lista de nóminas del mes:\n");
        double totalNominas = 0;

        // El MISMO método calcularPaga() se comporta diferente según el tipo real del objeto
        for (Trabajador t : trabajadores) {
        double paga = t.calculaPaga(); // ← POLIMORFISMO en acción
        totalNominas += paga;
        System.out.println(" " + t.nombre + " → " + paga + "€");
        }
        System.out.println("\n TOTAL NÓMINAS: " + totalNominas + "€");

        
        System.out.println("\n═══════════════════════════════════════════");
        System.out.println(" EXPLICACIÓN DEL POLIMORFISMO");
        System.out.println("═══════════════════════════════════════════\n");

        System.out.println(" Todos los objetos son de tipo Trabajador (clase padre)");
        System.out.println(" Pero cada uno ejecuta SU PROPIA versión de calcularPaga():");
        System.out.println(" • Programador: sueldo - 21% impuestos");
        System.out.println(" • ProgramadorJunior: beca (sin impuestos)");
        System.out.println(" • Consultor: tarifa × horas");
        System.out.println("\n¡Esto es POLIMORFISMO! ");

    }

    private static void estudioModificadores() {
        // ACCESO A CLASES
         System.out.println("--- 1. ACCESO A CLASES ---");

        // ✅ PÚBLICO: Se puede acceder desde cualquier parte
        Empleado empleado1 = new Empleado("Ana García", 35000);
        System.out.println("✅ Puedo crear objeto Empleado (es public)");

        // ❌ SIN MODIFICADOR: NO se puede acceder desde otro paquete
        // DepartamentoRRHH rrhh = new DepartamentoRRHH();
        System.out.println("❌ NO puedo crear objeto DepartamentoRRHH (sin modificador, solo visible en su paquete)");


        // ACCESO A ATRIBUTOS Y METODOS
        System.out.println("\n--- 2. ACCESO A ATRIBUTOS Y MÉTODOS ---");
        // Probando acceso a miembros de Empleado
        System.out.println("Intentando acceder a miembros de Empleado:");

        // ATRIBUTOS CON LOS MODIFICADORES

        // ✅ PUBLIC
        empleado1.nombre = "Ana García López";
        System.out.println("✅ nombre: " + empleado1.nombre);

        // ❌ PRIVATE
        // empleado1.salario = 40000;
        System.out.println("❌ salario: NO ACCESIBLE (es private)");

        // ❌ PROTECTED
        // empleado1.numeroEmpleado = "EMP001";
        System.out.println("❌ numeroEmpleado: NO ACCESIBLE (es protected, y no estamos en el mismo paquete ni heredamos)");
        
        // ❌ SIN MODIFICADOR
        // empleado1.antiguedad = 5;
        System.out.println("❌ antiguedad: NO ACCESIBLE (sin modificador, solo visible en el mismo paquete)");


        // METODOS CON LOS MODIFICADORES
        System.out.println("\n--- 3. ACCESO A MÉTODOS ---");

        // ✅ PUBLIC
        empleado1.mostrarInformacionBasica();

        // ❌ PRIVATE
        // empleado1.calcularImpuestos();
        System.out.println("❌ calcularImpuestos(): NO ACCESIBLE (método privado)");

        // ❌ PROTECTED
        // empleado1.asignarNumeroEmpleado();
        System.out.println("❌ asignarNumeroEmpleado(): NO ACCESIBLE (método protected)");

        // ❌ SIN MODIFICADOR
        // empleado1.actualizarAntiguedad();
        System.out.println("❌ actualizarAntiguedad(): NO ACCESIBLE (método sin modificador)");


        // METODOS QUE USA METODOS PRIVADOS
        System.out.println("\n--- 4. MÉTODO PÚBLICO QUE USA MÉTODOS PRIVADOS ---");
        System.out.println("Salario neto calculado: " + empleado1.calcularSalarioNeto() + "€");

        System.out.println("\n--- 5. INFORMACIÓN COMPLETA (desde dentro de la clase) ---");
        empleado1.mostrarInformacionCompleta();
    }

    private static void estudioMetodosEstaticos() {
        Bicicleta bici1 = new Bicicleta(21, 27, 0);
        Bicicleta bici2 = new Bicicleta(18, 24, 0);

        System.out.println(bici1);
        System.out.println(bici2);

        //System.out.println(bici1.getNumeroDeBicicleta()); NO DEBERIA DE HACER FALTA USAR EL OBJETO PARA ACCEDER A LA VARIABLE ESTATICA YA QUE EL RESULTADO NO CAMBIA LLAME AL OBJETO QUE LLAME
        System.out.println(Bicicleta.getNumeroDeBicicletas()); // ASI QUE MEJOR LLAMO DIRECTAMENTE A LA CLASE CON EL METODO PARA SABER EL VALOR DE LA VARIABLE
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
