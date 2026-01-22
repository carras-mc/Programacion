package cosas;

public class Ruleta_rusa {

    public Ruleta_rusa() {

        String[] jugadores = { "Marcos", "Pedro" };
        int[] revolverCargado = recargar();
        

    }

    private int[] recargar() {

        int cartucho = 1;
        int posicionBala = (int) (Math.random() * 6);
        int[] revolverCargado = new int[6];
        revolverCargado[posicionBala] = cartucho;

        return revolverCargado;
    }

    private int disparar(int[] revolverCargado) {

        int girarTambor = (int) (Math.random() * 6);

        revolverCargado =

    }

    
}
