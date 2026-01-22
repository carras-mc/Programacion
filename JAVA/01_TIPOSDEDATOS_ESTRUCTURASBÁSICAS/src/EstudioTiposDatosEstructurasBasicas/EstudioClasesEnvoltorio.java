package EstudioTiposDatosEstructurasBasicas;

import java.util.Scanner;

public class EstudioClasesEnvoltorio {

    public EstudioClasesEnvoltorio() {

        Scanner leer = new Scanner(System.in);

        Integer num = 10; //almaceno el valor en una clase de objeto
        Integer suma = num + num; 
        System.out.println(suma);

        int numPrimitivo =  num; //convierto la clase de objeto a una clase primitiva
        System.out.println(numPrimitivo);
        
        String x = "123";
        int paso_cadena_a_int = Integer.parseInt(x); //convierto la cadena en un int
        System.out.println(paso_cadena_a_int);
        paso_cadena_a_int = paso_cadena_a_int + paso_cadena_a_int; //ahora puedo operar con el valor que tenía la cadena
        System.out.println(paso_cadena_a_int);

        String str = Integer.toString(456); //convierto el int/integer en una cadena
        System.out.println(str);

        int max = Integer.MAX_VALUE; // 2147483647
        int min = Integer.MIN_VALUE; // -2147483648
        System.out.println(max);
        System.out.println(min);

        System.out.println("1111 en base 2 = " + Integer.parseInt("1111", 2)); //conversion en base 2
        System.out.println("123456 en hexadecimal = " + Integer.toHexString(123456)); //conversión hexadecimal
        System.out.println("135 en binario = " + Integer.toBinaryString(135)); //conversion binario
        System.out.println("365 en octal = " + Integer.toOctalString(365)); //conversion octal

        
        leer.close();
        
            
        
        

    }

}
