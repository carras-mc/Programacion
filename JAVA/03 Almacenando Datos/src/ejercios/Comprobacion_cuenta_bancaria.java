package ejercios;

import excepciones.InvalidCuentaBancaria;

public class Comprobacion_cuenta_bancaria {

    public Comprobacion_cuenta_bancaria(){

        // EEEESSSSDCNNNNNNNNNN

        String cuenta = "14320154497422504551";
        System.out.println(cuenta.length());
        try {
            verificacion(cuenta);
        } catch (InvalidCuentaBancaria e) {
            System.out.println(e.getMessage());
        }
        
    }

    private void verificacion(String cuenta) throws InvalidCuentaBancaria {

        if (cuenta.length() != 20) {
            throw new InvalidCuentaBancaria();
        }

        // factores para comprobar el numero de cuenta
        int[] factoresDC = { 1, 2, 4, 8, 5, 10, 9, 7, 3, 6 };
        
        // saco los dos digitos de la cuenta dada
        int D = Integer.parseInt(cuenta.substring(8, 9));
        int C = Integer.parseInt(cuenta.substring(9, 10));

        // inicializo las dos variables que almacenaran los numeros de control que le
        // corresponden a la cuenta y la suma de los productos
        int trueD;
        int trueC;
        int sum = 0;

        // multiplico los factores por los numeros de cuenta
        for (int i = 2; i < factoresDC.length; i++) {
            sum += Character.getNumericValue(cuenta.charAt(i-2)) * factoresDC[i];
        }
        trueD = 11 - (sum % 11);

        sum = 0;
        for (int i = 0; i < factoresDC.length; i++) {
            sum += Character.getNumericValue(cuenta.charAt(i+10)) * factoresDC[i];
        }
        trueC = 11 - (sum % 11);

        // comprobaciones de formato  
        if (D != trueD) {
            throw new InvalidCuentaBancaria();
        }
        else if (C != trueC) {
            throw new InvalidCuentaBancaria();
        }

    }

}
