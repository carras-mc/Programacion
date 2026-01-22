import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);

    System.out.println("Introduce un valor para comprobar sus multiplos: ");
    int numero_introducido = leer.nextInt();

    System.out.println("¿Hasta que multiplo quires llegar?: ");
    int limite_introducido =leer.nextInt();

    for (int i = 1; i <= limite_introducido; i++) {
        int multiplo = numero_introducido * i;
        System.out.println(numero_introducido + " x " + i + " = " + multiplo);
        
    }




















    }
}


