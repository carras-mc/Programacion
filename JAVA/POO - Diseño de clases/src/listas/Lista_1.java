package listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import modelo.Persona;
import estaticos.Bicicleta;


public class Lista_1 {

    public Lista_1() {
        
        Persona p1 = new Persona("Pepe", "Garcia", "123");
        Persona p2 = new Persona("Maria", "Perez", "1234");
        Bicicleta b1 = new Bicicleta(11, 29);
        System.out.println("=================COLECCIÓN=============================");
        Collection coleccion = new ArrayList();

        coleccion.add(p1);
        coleccion.add(p2);
        coleccion.add(p1);
        coleccion.add(b1);

        for (Object elem : coleccion) {
            if(elem instanceof Persona) System.out.println("Persona :" + elem);
            if(elem instanceof Bicicleta) System.out.println("Bicicleta :" + elem);
        }
        System.out.println("=================LISTA=============================");
        /* List<Persona> lista = null;
        lista = new ArrayList<Persona>(); */
        // o
        List<Persona> lista = new ArrayList<Persona>();

        lista.add(p1);
        lista.add(p2);
        lista.add(p2); //lista.add(b1);
        lista.set(0, p2);

        for (Persona person : lista) {
            System.out.println(person);
        }

        Persona p4;
        p4 = lista.get(0); // se convierte en el mismo elemente del index 0. si modifico p4 se modificara p1(index 0)
        System.out.println("El primer elemento es " + p4 + "\n" + p1);

        System.out.println("=================BORRAR=============================");

        Persona p = lista.remove(0); // devuelve el objeto borrado
        System.out.println("Hemos borrado " + p);
        for (Persona person : lista)
            System.out.println(person);

        lista.remove(p2); // borra solo el primer p2 que encuentra, no todos
        for (Persona person : lista)
            System.out.println("..." + person);

        lista.add(p1);
        lista.add(new Persona("Antonio", "Perez", "213"));

        System.out.println("==============================================");
        for (Persona person : lista)
            System.out.println("..." + person);
        System.err.println(lista.get(2));

        System.out.println("==============ITERATOR==================================");
        java.util.Iterator<Persona> iter = lista.iterator();
        while (iter.hasNext()) {
            // Persona p3=iter.next();
            System.out.println(iter.next().toString());
        }
        System.out.println("==============FOR ==================================");
        for (int x = 0; x < lista.size(); x++) {
            p = lista.get(x);
            System.out.println(p);
        }
        // OTROS METODOS
        // void clear(); boolean isEmpty();boolean contains(Object o);
        // int indexOf(Object o)
        System.out.println(lista.isEmpty());
        System.out.println(lista.indexOf(p2));
        System.out.println(lista.contains(p2));
    }
}
