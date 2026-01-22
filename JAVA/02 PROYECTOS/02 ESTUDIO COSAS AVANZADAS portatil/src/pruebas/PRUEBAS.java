package pruebas;

public class PRUEBAS {

    public PRUEBAS() {

        for (int i = 1; i > 0; i++) {
            int a = (int) (Math.random() * 100);
            String b = "";
            System.out.print(vista.Main.YELLOW_BRIGHT + a + vista.Main.RESET
                    + vista.Main.BLUE_BRIGHT + b + vista.Main.RESET
                    + vista.Main.GREEN_BRIGHT + a + vista.Main.RESET);
            a = (int) (Math.random() * 100);
            System.out.print(vista.Main.RED_BRIGHT + b + vista.Main.RESET
                    + vista.Main.MAGENTA_BRIGHT + a + vista.Main.RESET
                    + vista.Main.WHITE_BRIGHT + b + vista.Main.RESET);
        }
    }
}
