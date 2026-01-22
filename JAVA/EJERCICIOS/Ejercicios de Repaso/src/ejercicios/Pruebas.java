package ejercicios;

import java.util.Scanner;

public class Pruebas {

    public Pruebas() {

        Scanner leer = new Scanner(System.in);


        System.out.print("Introduce en que numero quieres que empiece el intervalo: ");
        int numStart = leer.nextInt();
        System.out.print("Introduce en que numero quieres que termine el intervalo: ");
        int numEnd = leer.nextInt();

        int primo = 0;
        boolean esPrimo = true;
        boolean esSexy = true;



       /*  for (int contPrimos = numStart; contPrimos <= numEnd; contPrimos++) {
            for (int contComprobarPrimos = 2; contComprobarPrimos <= contPrimos; contComprobarPrimos++) {
                if (contComprobarPrimos == contPrimos - 1 || contPrimos == 2) {
                    primo = contPrimos;
                        
                        int numSexo = primo + 6;
                        for (int comprobarNumSexoPrimo = 2; comprobarNumSexoPrimo < numSexo; comprobarNumSexoPrimo++) {
                            if (numSexo > numEnd) break;
                            
                            if (comprobarNumSexoPrimo == numSexo - 1) {
                            System.out.println(primo + " y " + numSexo + " son amigiwis.");

                            break;
                            }
                            if (numSexo % comprobarNumSexoPrimo == 0) {
                            break;
                            }
                       }
                    break;
                }
                if (contPrimos % contComprobarPrimos == 0) break;
            }
            
            
        } */

        for (int contPrimos = numStart; contPrimos <= numEnd; contPrimos++) {
            for (int contComprobarPrimos = 2; contComprobarPrimos <= contPrimos; contComprobarPrimos++) {
                if (contComprobarPrimos == contPrimos - 1 || contPrimos == 2) {
                    primo = contPrimos;
                    esPrimo = true;
                    break;
                }
                if (contPrimos % contComprobarPrimos == 0) { 
                    esPrimo = false;
                    break;
                }
            }
            
        }
        
    }
}

    


