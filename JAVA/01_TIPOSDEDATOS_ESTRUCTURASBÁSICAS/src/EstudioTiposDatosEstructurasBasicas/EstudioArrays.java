package EstudioTiposDatosEstructurasBasicas;

public class EstudioArrays {

    //paso de arrays a métodos
    public EstudioArrays() {
        numeroMaxMinDeArray(new int[] {10,20,30,40,50,60});

        int [] array = {1,2,3};
        int [] arrayCopia = generadorCopiaArrays(array);
        System.out.println(array[0] + array[1] + array[2]);
        System.out.println(arrayCopia[0] + arrayCopia[1] + arrayCopia[2]);
    }

    private static void numeroMaxMinDeArray(int [] enteros) {
        System.out.println(enteros [0]);
    }

    private static int [] generadorCopiaArrays(int [] arrayIntroducido) {
        int [] arrayCopia = new int[arrayIntroducido.length];
        for (int i = 0; i < arrayIntroducido.length; i++) {
            arrayCopia[i] = arrayIntroducido[i];
        }
        return arrayCopia;
    }

    
}
