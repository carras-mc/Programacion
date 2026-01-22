package estudio;

import java.util.Arrays;

public class Cadenas {

    public Cadenas(){

        String nombre = new String("Pedrito <3");
        String cadena = "Bienvenidos a la clase de programacion   ";
        String cad2= "AAA";

        int tam = cadena.length();
        System.out.println("Tamaño: "+tam);
        System.out.println();
        
        // char charAt(indice) MUY IMPORTANTE (segun jesus)
        char c = cadena.charAt(0); // esto con un for podria sacar la cadena entera, incluso del revés
        System.out.println(c);
        System.out.println();

        // substring - con esto se puede coger dentro de un intervalo, o en un lugar concreto
        System.out.println(cadena.substring(0, 11)); 
        String DNI = "32954840A";
         String numerosDNI = DNI.substring(0, 8);
         System.out.println(numerosDNI);
         char letraDNI = DNI.charAt(8);
         System.out.println(letraDNI);
        // o tambien
        String letraDNIString = DNI.substring(DNI.length()-1);
        System.out.println(letraDNIString);
        System.out.println();

        //indexof
        System.out.println(cadena.indexOf("o")); // se puede hacer con palabras o con caracteres
        System.out.println(cadena.indexOf("o", 10)); // busca "o" a partir de la posicion 10
        System.out.println();

        //equals
        nombre = "Pedrón";
        String nombre2 = "pedrón";
         System.out.println(nombre.equals(nombre2)); //tiene en cuenta las mayús 
         System.out.println(nombre.equalsIgnoreCase(nombre)); // no tiene encuenta las mayús
        nombre = "   aBc   ";
         System.out.println(nombre.length());
         String nombreTrim = nombre.trim(); // "trim" quita los espacios del nombre, ya sea en su lenght o en sí
         System.out.println(nombreTrim.length());
         System.out.println(nombre.toUpperCase()); // convierte en mayusculas 
         System.out.println(nombre.toLowerCase()); // convierte en minúsculas 
        System.out.println();

        //remplace
        System.out.println(cadena.replace("Bienvenidos", "tus muertos"));
        System.out.println();
        
        //starts with / contains
        System.out.println(cadena.startsWith("Bienvenidos")); 
        System.out.println(cadena.contains("idos"));
        System.out.println();

        //de cadena a array
        String asignatura = "Programación";
        char[] caracteres = asignatura.toCharArray(); // convierte un array cadena en un array de caracteres 
        System.out.println(Arrays.toString(caracteres));
        System.out.println(caracteres);
        String alumno = "Pepe,programación,BBDD,LLMM";
        String[]nuevoAlumno = alumno.split(","); // mete cadenas en un array separando por el caracter q le pongas
        System.out.println();

        

        



         














































        String yo = "Marcos";
        String amor = "<====3";
        String pedroXoxito = "()";

        if (nombre == "Pedrito <3") {
            System.out.println();

        }
    }

}
