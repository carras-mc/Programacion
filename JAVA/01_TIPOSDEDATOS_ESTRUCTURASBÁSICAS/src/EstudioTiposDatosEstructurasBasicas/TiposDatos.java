package EstudioTiposDatosEstructurasBasicas;


import java.util.Scanner;

public class TiposDatos {
    enum Dias {Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo}
    //establecer la clase
    @SuppressWarnings("resource")
    public TiposDatos(){
        //constructor. a partir de aqui se escribe el código  
        
        System.out.println("Estudio de los tipos de datos");

       byte tipoByte = 0;
       tipoByte = 24;
       //dentro de "byte" el maximo es 127

       System.out.println("tipoByte = " + tipoByte);    
        //el "+" sirve para contatenar

        int x = 0;
        System.out.println("La variable x es: " + x);
        x = 5;
        System.out.println("Ahora la variable x es: " + x);

        long tipoLong = 222222222L;
        //hay que ponerle la "L" al final para que 
        System.out.println(tipoLong);

    
        char tipoChar = 'a';
        char tipoChar2 = 'b';
        System.out.println("tipoChar: " + tipoChar + " tipoChar2: " + tipoChar2);
        //para serparar y que no quede junto dejar el espacio en las comillas. abajo ejemplo con coma
        System.out.println("tipoChar: " + tipoChar + ", tipoChar2: " + tipoChar2);
        
        char tipoChar3 = 'A';
        int codigoASCII_tipoChar3 = tipoChar3;
        //los char tienen una dualidad q se pueden convertir en numero convirtiendolo al codigo ascii de ese caracter
        System.out.println("El código ASCII de " + tipoChar3 + " es " + codigoASCII_tipoChar3 );

       float tipoFloat = 14.8F;
       //hay q ponerle la "F" al final
       System.out.println("El float es: " + tipoFloat);

       double tipoDouble1 = 5;
       double tipoDouble2 = 15.55; 
       System.out.println("El double 1 es = " + tipoDouble1);
       System.out.println("El double 2 es = " + tipoDouble2);

       final double PI = 3.14;
       System.out.println(PI);
       //el final indica que este valor no puede cambiar durante la ejecución del programa. siempre el nombre de la varibale con el final delante tiene que estar en mayúsculas

       double div;
       int dividendo, divisor;
       dividendo = 7;
       divisor = 3;
       div =  dividendo / (double) divisor;
       System.out.println("La division es: " + div);
       //para que una division sea Real, el divisor o el dividendo, uno de los dos tiene que ser Real

       //pedir que introduzcan datos
       Scanner leer = new Scanner(System.in);
       
        System.out.print("Introduce tu nombre y apellido: ");
        String nombre_y_apellido = leer.nextLine();
        System.out.println("Tu nombre y apellido es: " + nombre_y_apellido);
        leer = null;
        

        //despues de haber introducito el input y mostrarlo, es necesario convertir "leer" en null. para que olvide su anterior valor y no se raye
        leer = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = leer.next();
        System.out.println("Tu nombre es: " + nombre);
        leer = null;

        leer = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = leer.nextInt();
        System.out.println("Tu edad es: " + edad);
        leer = null;


        //Días enumerados
        leer = new Scanner(System.in);
        System.out.print("Introduce que día es: ");
       
        leer.close();

    }

//end class
}

