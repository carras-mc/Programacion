package ejercicios;

/* import java.util.ArrayList; */
import java.util.Scanner;

public class Menu_Notas {

    public Menu_Notas() {

        Scanner leer = new Scanner(System.in);

        int[][] notas = {
                { 5, 7, 9, 6, 9, 4, 7, 8, 5, 6, 7, 9, 8, 10, 5, 7, 8, 9, 6, 7 }, // programación
                { 4, 8, 7, 9, 5, 6, 8, 7, 9, 5, 6, 8, 7, 5, 6, 8, 9, 7, 8, 6 }, // base de datos
                { 7, 6, 2, 8, 7, 5, 6, 9, 8, 7, 5, 6, 9, 1, 7, 6, 5, 8, 9, 4 }, // sistemas
                { 8, 9, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 6, 7, 5, 8 }, // lenguaje
                { 9, 5, 8, 7, 6, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 5, 6, 7, 9 },// entornos
        };

        String[] alumnos = {
                "Juan Garcia", "Maria López", "Carlos Ruiz", "Ana Martinez", "Pedro Sanchez",
                "Laura Fernández", "Diego Torres", "Sofia Romero", "Javier Diaz", "Carmen Muñoz",
                "Alberto Pérez", "Elena González", "Miguel Ángel", "Isabel Jiménez", "Francisco Gil",
                "Lucia Ramos", "Roberto Herrera", "Patricia Vega", "Daniel Moreno", "Cristina Silva"
        };

        @SuppressWarnings("unused")
        String[] asignaturas = { "Programación", "BBDD", "Sistemas", "LLMM", "Entornos" };

        int opcion;

        do {
            System.out.println("=========================================");
            System.out.println("         MENÚ GESTIÓN DE NOTAS");
            System.out.println("=========================================");
            System.out.println("1. Mostrar todas las notas de una asignatura");
            System.out.println("2. Mostrar notas de un alumno");
            System.out.println("3. Mostrar alumno con la media mas alta");
            System.out.println(
                    "4. Mostrar alumnos que tengan una nota igual o mayor de 8 en programación y que suspenda sistemas");
            System.out.println("5. Mostrar los alumnos que tienen suspenso base de datos o sistema");
            System.out.println();
            System.out.print("Elige una opción ===> ");
            opcion = leer.nextInt();

        } while (opcion < 1 && opcion > 3);

        switch (opcion) {
            case 1:

                System.out.println("¿De que asignatura quieres saber las notas? Seleccione el número de la asignatura");
                System.out.println("    1. Programación     2. BBDD     3. Sistemas     4.LLMM      5. Entornos");
                int asignaturaSeleccionada = leer.nextInt() - 1;
                System.out.println();
                mostrarNotasDeUnaAsignatura(notas, alumnos, asignaturaSeleccionada);

                break;

            case 2:

                mostrarNotasDeUnAlumno(notas, alumnos);
                break;

            case 3:
                mostrarMediaMasAlta(notas, alumnos);
                break;

            case 4:
                mostrarConsulta4(notas, alumnos);
                break;

            case 5:
                mostrarConsulta5(notas, alumnos);

            default:
                break;
        }
        leer.close();
    }

    private void mostrarNotasDeUnaAsignatura(int[][] notas, String[] alumnos, int asignaturaSeleccionada) {
        for (int x = 0; x < notas[asignaturaSeleccionada].length; x++) {
            System.out.println(alumnos[x] + ": " + notas[asignaturaSeleccionada][x]);
        }
    }

    private void mostrarNotasDeUnAlumno(int[][] notas, String[] alumnos) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el numero de lista del alumno (1 - 20): ");
        int alumnoSeleccionado = leer.nextInt() - 1;
        System.out.println();

        for (int y = 0; y < notas.length; y++) {
            System.out.print(notas[y][alumnoSeleccionado] + " - ");
        }
        leer.close();
    }

    private void mostrarMediaMasAlta(int[][] notas, String[] alumnos) {
        int sumaNotaAlumno;
        int notaMax = 0;
        String alumnosMediaMasAlta = "";

        for (int x = 0; x < alumnos.length; x++) {
            sumaNotaAlumno = 0;

            for (int y = 0; y < notas.length; y++) {
                sumaNotaAlumno += notas[y][x];
            }

            if (sumaNotaAlumno > notaMax) {
                notaMax = sumaNotaAlumno;
                alumnosMediaMasAlta = alumnos[x];
            }
        }
        double notaMediaAlumno = (double) notaMax / 5;
        System.out.println(alumnosMediaMasAlta + ": " + notaMediaAlumno);
    };

    private void mostrarConsulta4(int[][] notas, String[] alumnos) {
        System.out.println(
                "---------------------------------------------------------------------------------------------------------");
        for (int y = 0; y < notas[0].length; y++) {
            if (notas[0][y] > 8 && notas[2][y] < 5) {

                System.out.println(alumnos[y] + " tiene aprobado programación con un " + notas[0][y] + " y tiene un "
                        + notas[2][y] + " en sistemas.");
            }

        }
    }

    private void mostrarConsulta5(int[][] notas, String[] alumnos) {

        for (int x = 0; x < notas[0].length; x++) {
            if (notas[1][x] < 5) {
                System.out.println(alumnos[x] + " - " + notas[1][x]);
            }

            if (notas[2][x] < 5) {
                System.out.println(alumnos[x] + " - " + notas[2][x]);
            }
        }
        
    }
}
