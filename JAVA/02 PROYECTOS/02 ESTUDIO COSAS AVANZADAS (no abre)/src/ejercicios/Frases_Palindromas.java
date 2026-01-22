package ejercicios;
import java.util.Scanner;

public class Frases_Palindromas {

    public Frases_Palindromas() {

        // Un programa que me pida una frase y e diga si es palíndroma. Busca frases
        // palíndromas en internet.
        // TERMINADO AUNQUE FALTAN LOS SIMBOLOS DE PUNTUACIÓN

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una frase : ");
        String fraseInput = sc.nextLine();
        comprobacionPalindromo(fraseInput);

        sc.close();

    }

    public void comprobacionPalindromo(String fraseInput) {

        String fraseInputInvertida = "";
        String fraseInputAux = "";

        for (int i = 0; i < fraseInput.length(); i++) {

            char letraExtraida = fraseInput.charAt(i);
            
            if (letraExtraida != ' ') {
                fraseInputAux+=letraExtraida;
            }
        }
        fraseInputAux = fraseInputAux.toLowerCase();
        
        
        for (int i = fraseInputAux.length() - 1; i >= 0; i--) {

            char letraExtraida = fraseInputAux.charAt(i);
            if (letraExtraida != ' ') {
                fraseInputInvertida += String.valueOf(letraExtraida);
            }
        }
        System.out.println("Frase invertida : " + fraseInputInvertida);

        if (fraseInputAux.equals(fraseInputInvertida)) {
            System.out.println("La frase introducida es palíndroma");
        } else {
            System.out.println("La frase introducida no es palíndroma");
        }

    }

}
