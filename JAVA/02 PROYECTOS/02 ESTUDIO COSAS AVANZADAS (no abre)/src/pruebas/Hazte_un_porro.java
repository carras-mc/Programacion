package pruebas;

public class Hazte_un_porro {

    public Hazte_un_porro() {
        
        for (int i = 1; i > 0; i++) {
            System.out.println();
            System.out.println(i);
            for (int j = 0; j < i; j++) {
                System.out.print(vista.Main.YELLOW_BRIGHT+" Hazte un porro "+vista.Main.RESET); 
            }
            for (int j = 0; j < i; j++) {
                System.out.print(vista.Main.RED_BRIGHT+" ¿Un qué? "+vista.Main.RESET);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(vista.Main.GREEN_BRIGHT+" Un porro "+vista.Main.RESET);
            }

        }

        


    }

}
