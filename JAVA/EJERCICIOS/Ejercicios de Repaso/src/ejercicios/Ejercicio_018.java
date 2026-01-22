package ejercicios;

public class Ejercicio_018 {

    public Ejercicio_018(){

        /* Número Armstrong
        Enunciado:
        Un número Armstrong es aquel que es igual a la suma de sus dígitos elevados al número de cifras que tiene.
        Ejemplo:
        153 = 13 + 53 + 33
        Extensión:
        Mostrar todos los números Armstrong entre 10 y 10000. */

        int numCont;
        int cantidadDigitos;
        

        for (numCont = 152; numCont <= 10000; numCont++) {
            int sumaDigitos = 0;
            int numContAux = numCont;
            Integer numContInteger = numCont;
            String numContString = numContInteger.toString();
            
            
            for (cantidadDigitos = numContString.length(); cantidadDigitos > 0; cantidadDigitos--) {
                int cantidadDigitosAux = numContString.length();
                int digito = numContAux % 10;
                sumaDigitos = sumaDigitos + (int) Math.pow(digito, cantidadDigitosAux);
                numContAux = numContAux / 10;

                
            }
            if (sumaDigitos == numCont) System.out.println(numCont);
        }
        
    }
}
