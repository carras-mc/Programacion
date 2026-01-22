package ejercicios;

public class Ejercicio_5 {

    public Ejercicio_5() {

        // Muestra los caracteres del código
        // ascii , del 32 a 131 )en 10 columnas mostrando el código y el carácter.
        // Formatea la salida con printf

        int salto = 0;

        for (int letra = 32; letra <= 131; letra++) {

            if (salto == 10) {

                System.out.printf("%n");
                salto = salto - 10;
            }

            System.out.printf(" %6d ==> %c ", letra, (char) letra); 
            salto++;

           

              
        }
        
    }




}
