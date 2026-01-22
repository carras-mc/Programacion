package ejercios;

public class Algoritmo_de_Luhn {

    public Algoritmo_de_Luhn() {

        String numeroCuenta = "4620058441887023";

        // creo el array del numero de la cuenta
        int[] arrayNumeroCuenta = new int[16];
        for (int i = 0; i < arrayNumeroCuenta.length; i++) {
            arrayNumeroCuenta[i] = Integer.parseInt(String.valueOf(numeroCuenta.charAt(i)));
        }

        // creo el array con las posiciones
        int[] arrayPosiciones = new int[arrayNumeroCuenta.length];
        int x = 0;
        for (int i = 16; i > 0; i--) {
            arrayPosiciones[x] = i;
            if (x < 16)
                x++;

        }

        // duplico los pares
        int[] arrayParesDuplicados = new int[arrayNumeroCuenta.length];
        for (int i = arrayPosiciones.length - 1; i >= 0; i--) {
            if (arrayPosiciones[i] % 2 == 0) {
                arrayParesDuplicados[i] = arrayNumeroCuenta[i] * 2;
            } else
                arrayParesDuplicados[i] = arrayNumeroCuenta[i];
        }

        // Sumar los dígitos si el resultado es mayor que 9
        int[] arraySumaDigitos = new int[arrayNumeroCuenta.length];
        for (int i = 0; i < arraySumaDigitos.length; i++) {
            if(arrayParesDuplicados[i] > 9) {
                int digito1 = arrayParesDuplicados[i] / 10;
                int digito2 = arrayParesDuplicados[i] - 10;
                arraySumaDigitos[i] = digito1 + digito2;
                 
            }
        }

        // mostrar
        System.out.printf("%-12s %-4s", "Posiciones", " : ");
        for (int i = 0; i < arrayPosiciones.length; i++) {
            System.out.print(String.format("%-4s", (arrayPosiciones[i]))); // otra forma de printf
        }
        System.out.println();

        System.out.printf("%-12s %-4s", "Cuenta", " : ");
        for (int i = 0; i < arrayNumeroCuenta.length; i++) {
            System.out.printf("%-4s", arrayNumeroCuenta[i]);
        }
        System.out.println();

        System.out.printf("%-12s %-4s", "Duplicados", " : ");
        for (int i = 0; i < arrayParesDuplicados.length; i++) {
            System.out.printf("%-4s", arrayParesDuplicados[i]);
        }
        System.out.println();

        System.out.printf("%-12s %-4s", "Suma dígitos"," : ");
        for (int i = 0; i < arraySumaDigitos.length; i++) {
            System.out.printf("%-4s", arraySumaDigitos[i]);
        }

    }

}
