// ACTIVIDAD 3
public class LimInvalidoEx extends Exception {
    public LimInvalidoEx(String mensaje) {
        super(mensaje);
    }

    public static void main(String[] args) {
        // int
        Integer[] arrayInt = {1, 2, 3, 4, 5};
        try {
            System.out.println("Elementos en el rango: ");
            int numElementos = imprimirArray(arrayInt, 0, 3);
            System.out.println("Numero de elementos impresos: " + numElementos);
        } catch (LimInvalidoEx e) {
            System.err.println("Error: " + e.getMessage());
        }

        // string
        String[] arrayString = {"a", "b", "c", "d", "e"};
        try {
            System.out.println("Elementos en el rango: ");
            int numElementos = imprimirArray(arrayString, 1, 3);
            System.out.println("Numero de elementos impresos: " + numElementos);
        } catch (LimInvalidoEx e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static <T> int imprimirArray(T[] array, int limiteInferior, int limiteSuperior) throws LimInvalidoEx {
        if (limiteInferior < 0 || limiteSuperior >= array.length || limiteInferior > limiteSuperior) {
            throw new LimInvalidoEx("Limites de invalidos");
        }

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            System.out.println(array[i]);
        }

        return limiteSuperior - limiteInferior + 1;
    }
}
