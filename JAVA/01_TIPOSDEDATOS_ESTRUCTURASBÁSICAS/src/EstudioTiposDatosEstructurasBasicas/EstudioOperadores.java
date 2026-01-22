package EstudioTiposDatosEstructurasBasicas;

import java.util.Scanner;

public class EstudioOperadores {
     public EstudioOperadores(){
        System.out.println("EstudioDeOperadores");

        int suma,c=-5,d=3,e=2, multi;
        double sumaDouble, num1=5.5, num2=2.3;
        suma = c-d;
        multi = c*d;
        System.out.println("Suma= " + suma);
        System.out.println("Multiplicacion= " + multi);
        int op=c+d*e;
        System.out.println("Operador Prioridad= " + op);
        sumaDouble=num1+num2;
        System.out.println("Suma Doble= " + sumaDouble);
        suma=(int)(num1+num2);
        System.out.println("Suma con casting= " + suma);

        int divEntera, divid = 7, div= 3;
        double divReal;
        divEntera = divid / div;
        System.out.println("Divi entera =" + divEntera);
        divReal =  divid / div;  
        System.out.println("Divi real =" + divReal);
        double divRealCast;
        divRealCast = divid / (double) div;
        System.out.println("División real con casteo =" + divRealCast);

        int resto;
        divid = 8;
        div = 3;
        resto = divid % div;
        System.out.println("El resto es =" + resto);

        int con = 2;
        con+=5;
        con++;
        System.out.println(con);

        int z = con++;
        System.out.println(z);
        z = ++con;
        System.out.println(z);

        //CALCULAS LAS MEDIAS ARITMETICAS DE LAS NOTAS DE UNA CLASE
        //Variables
        //  nota = almacenar las notad de un alumno (acumulador)
        //  media = suma de valores / por la cantidad de valores
        //  cant = almacena la cantidad de valores (contador)
        // no es lo de abajo, solo es el planteamiento escrito

        int acu = 0;
        int nota = 7;
        acu+= nota;
        System.out.println("Acumulador = " + acu);
        nota=6;
        acu+= nota;
        System.out.println("Acumulador = " + acu);

        //OPERADORES DE RELACIÓN
        // < | > | <= | >= | == | !=

        int s = 3, r = 4;
        boolean sw = false, sw1, sw2;

        sw = s == r;
        System.out.println(sw);

        sw = s!= r;
        System.out.println(sw);
        
        sw = s >= r; 
        System.out.println(sw);

        // OPERADOR TERNARIO
        // se hace una pregunta ej:"(z > r)?" si es true devuelve "z", si es false devuelve "r". ya que "z : r"
        int resultado = (z > r)? z : r;
        int notaNumerica = 6;
        String notaCadena = notaNumerica < 5 ? "suspenso" : "aprobado";

        System.out.println("El mayor es : " + resultado);
        System.out.println("Resultado del examen: " + notaCadena);
        
        // OPERADORES LÓGICOS
        // ^ (devuelve true si unos de los dos es true) | NOT ("!" "operador de inversión o de complemento") | OR ("||" "|" "o" "suma lógica") | AND ("&&" "&" "y" "multiplicador lógico") | XOR

        sw1= false;
        sw2 = true;

        System.out.println(!sw1);
        System.out.println(sw1 || sw2);
        System.out.println(sw1 && sw2);
        System.out.println(sw1 ^ sw2);

        boolean a = true;
        System.out.println("a || (6 > 10) = " + (a || (6 >10)));


        // Realiza un programa que calcule la nota que hace falta sacar en el sengundo
        // examen de la asignatura Programación para obtener la media deseada. Hay
        // que tener en cuenta que la nota del primer examen cuenta un 40 % y la nota
        // del segundo examen un 60%


       Scanner leer = new Scanner(System.in);
        
       System.out.println("¿Qué sacaste en el primer examen?: ");
        double notaExamen1 = leer.nextDouble();
        
        
        System.out.println("Introduce la media deseada: ");
        double notaMedia = leer.nextDouble();


         double notaExamen2 = (notaMedia - 0.4 * notaExamen1)/0.6;


        System.out.println("Nota necesaria en el segundo examen: " + notaExamen2); 

        leer.close();





     }

    }

    


