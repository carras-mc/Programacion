package clases;

import excepciones.InvalidCompra;
import excepciones.InvalidSaldo;

public class TarjetaRegalo {

    private int saldo;
    private int numTarjeta;

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

    public TarjetaRegalo fusionar(TarjetaRegalo tarjetaRegalo1, TarjetaRegalo tarjetaRegalo2) throws InvalidSaldo {
        TarjetaRegalo tarjetaRegalo3 = new TarjetaRegalo();
        tarjetaRegalo3.setNumTarjeta(numTarjeta);
        tarjetaRegalo3.setSaldo(tarjetaRegalo1.getSaldo() + tarjetaRegalo2.getSaldo());;

        return tarjetaRegalo3;
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

    public int getNumTarjeta() {
        return numTarjeta;
    }

    private void setNumTarjeta(int numTarjeta) {
        this.numTarjeta =(int) (Math.random()*(99999 - 10000 + 1) + 10000);
    }

    @Override
    public String toString() {
        return "TarjetaRegalo [saldo=" + saldo + ", numTarjeta=" + numTarjeta + "]";
    }

}
