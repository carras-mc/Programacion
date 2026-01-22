package pruebas;

public class PRUEBAS {

    public PRUEBAS() {

        String[] jugadores = {"Marcos", "Pedro"};
        int[] revolver = recargar();

    }

    private int[] recargar() {

        int cartucho = 1;
        int posicionBala = (int) (Math.random() * 6);
        int[] revolverCargado = new int[6];
        revolverCargado[posicionBala] = cartucho;

        return revolverCargado;
    }
}
    

