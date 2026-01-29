package vista;

import clases.TarjetaRegalo;
import excepciones.InvalidCompra;
import excepciones.InvalidSaldo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        /*
         * Ejercicio que planteamos en clase:
         * La empresa El Corte Islandés nos ha encargado una aplicación para gestionar
         * las tarjetas regalo.
         * Como primer paso para implementar la aplicación, es necesario crear la clase
         * principal. Implementa la clase TarjetaRegalo.
         * Cuandose crea una nueva tarjeta, se le da un saldo y se asigna de forma
         * automática un número de 5 dígitos.
         * Si se intenta gastar más dinero del que tiene la tarjeta, se debe mostrar un
         * mensaje de error.
         * Dos tarjetas regalo se pueden fusionar creando una nueva tarjeta con la suma
         * del saldo que tenga cada una y un
         * nuevo número aleatorio de 5 cifras.Al fusionar dos tarjetas en una, las dos
         * tarjetas originales se quedarían con 0 € de saldo.
         */

        crearTarjetasRegalo();
    }

    private static void crearTarjetasRegalo() {

        try {
            // creo tarjeta
            TarjetaRegalo tarjetaRegalo1 = new TarjetaRegalo(100);
            System.out.println("Tarjeta regalo 1 : "+tarjetaRegalo1);
            // gasto dinero
            tarjetaRegalo1.gastarPasta(50);
            System.out.println("Tarjeta regalo 1 : "+tarjetaRegalo1);
            tarjetaRegalo1.gastarPasta(5);
            System.out.println("Tarjeta regalo 1 : "+tarjetaRegalo1);
            // fusiono tarjetas
            TarjetaRegalo tarjetaRegalo2 = new TarjetaRegalo(200);
            TarjetaRegalo tarjetaRegalo3 = new TarjetaRegalo();
            tarjetaRegalo3 = tarjetaRegalo3.fusionar(tarjetaRegalo1, tarjetaRegalo2);
            System.out.println("Tarjeta regalo 3 : "+tarjetaRegalo3);
            System.out.println("t1 "+tarjetaRegalo1); // compruebo que las tarjetas fusionadas no tienen saldo
            System.out.println("t2 "+tarjetaRegalo2);

        } catch (InvalidSaldo | InvalidCompra e) {
            System.out.println(e.getMessage());
        }

    }

}
