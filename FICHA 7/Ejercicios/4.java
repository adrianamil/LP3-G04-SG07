public class Ejemplo {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;
        try {
            int resultado = dividir(numerador, denominador);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("División por cero");
        }
        return numerador / denominador;
    }
}
