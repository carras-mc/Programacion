package clases;

import excepciones.InvalidCompra;
import excepciones.InvalidSaldo;

public class TarjetaRegalo {

    private int saldo;
    private String numTarjeta;
    static int numTarjetaCont = 1;

    public TarjetaRegalo() {
    }

    public TarjetaRegalo(int saldo) throws InvalidSaldo {
        this.setSaldo(saldo);
        this.setNumTarjeta(numTarjeta);

    }

    public void gastarPasta(int gastar) throws InvalidCompra, InvalidSaldo {
        if ((this.saldo - gastar) >= 0) {
            this.saldo-= gastar;
        }
        else throw new InvalidCompra();
    }

    public static TarjetaRegalo fusionar(TarjetaRegalo tarjetaRegalo1, TarjetaRegalo tarjetaRegalo2) throws InvalidSaldo {
        int nuevoSaldo = tarjetaRegalo1.saldo + tarjetaRegalo2.saldo;
        tarjetaRegalo1.setSaldo(0);
        tarjetaRegalo2.setSaldo(0);

        return new TarjetaRegalo(nuevoSaldo);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) throws InvalidSaldo {

        if (saldo >= 0) {
            this.saldo = saldo;
        }
        else throw new InvalidSaldo();
        
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    private void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = String.valueOf(numTarjetaCont++);
        while (this.numTarjeta.length() < 5) {
            this.numTarjeta = "0" + this.numTarjeta;
        }
    }

    @Override
    public String toString() {
        return "Tarjeta regalo [" + saldo + ", numTarjeta=" + numTarjeta + "]";
    }
    
}
