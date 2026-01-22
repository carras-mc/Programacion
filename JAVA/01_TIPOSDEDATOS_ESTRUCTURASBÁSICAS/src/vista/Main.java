package vista;

import EstudioTiposDatosEstructurasBasicas.EstudioArrays;
import EstudioTiposDatosEstructurasBasicas.EstudioBucles;
import EstudioTiposDatosEstructurasBasicas.EstudioClasesEnvoltorio;
import EstudioTiposDatosEstructurasBasicas.EstudioEstructurasCondicionales;
import EstudioTiposDatosEstructurasBasicas.EstudioMath;
import EstudioTiposDatosEstructurasBasicas.EstudioMetodos;
import EstudioTiposDatosEstructurasBasicas.EstudioOperadores;
import EstudioTiposDatosEstructurasBasicas.EstudioPrintF;
import EstudioTiposDatosEstructurasBasicas.TiposDatos;

@SuppressWarnings("unused")
public class Main {

    public static void main(String[] args) {
        
        //se establece la clase
        System.out.println("Tipos de Datos y Estructuras Basicas En Java");
        System.out.println(" ");
        
        /* int [] notaAdmision = new int[5];
        for (int i = 0; i < notaAdmision.length; i++){
            notaAdmision[i] = (int) (Math.random()*10);
        }

        marcos("Muñoz Carrasco", 19, "Español", notaAdmision); */

        //TiposDatos tiposDatos = new TiposDatos();
        //instanciar la clase TipoDatos. hace existir la otra clase

        //new EstudioOperadores();
        //new TiposDatos();
        //new EstudioEstructurasCondicionales();
        //new EstudioBucles();
        //new EstudioPrintF();
        //new EstudioMath();
        //new EstudioClasesEnvoltorio();
        //EstudioMetodos estudioMetodos = new EstudioMetodos();
        new EstudioArrays();
    
        
        
    }

    private static boolean marcos(String apellidos, int edad, String nacionalidad, int [] notaAdmision ) {
        boolean esMayorDeEdad = false;
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Edad: "+edad);
        double media = 0;
        double sumaNotas = 0;

        for (int nota : notaAdmision) {
            sumaNotas = sumaNotas + nota;
            media = sumaNotas / notaAdmision.length;
        }
        System.out.println("La media es = "+media);
        if (media > 5) System.out.println("El alumno es apto.");
        else System.out.println("El alumno no es apto.");

        if (edad > 18) {
            return esMayorDeEdad = true;
        }
        else return esMayorDeEdad;

       
    }

    



}
