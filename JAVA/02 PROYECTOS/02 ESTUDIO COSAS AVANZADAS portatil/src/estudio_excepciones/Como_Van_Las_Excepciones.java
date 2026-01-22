package estudio_excepciones;

public class Como_Van_Las_Excepciones {

    public Como_Van_Las_Excepciones() {

        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            System.out.println("Operación finalizada.");
        }
        

        try {
            int[] numeros = { 1, 2, 3 };
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Intento de acceso fuera de los límites del array.");
        } finally {
            System.out.println("Espabila notas");

        }
        System.out.println("");

        try {
        retirarSaldo(100, 120);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        
    }

    private void retirarSaldo(int saldo, int retirar) throws SaldoInsuficienteException {
        if (retirar>saldo)
            throw new SaldoInsuficienteException();


        
    }

    

}
