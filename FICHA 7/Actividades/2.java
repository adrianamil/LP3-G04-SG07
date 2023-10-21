import java.util.InputMismatchException;
import java.util.Scanner;

public class App1 {
    public static int cociente(int numerador, int denominador) throws ArithmeticException {
        return numerador/denominador;
    }
    public static void main(String[] args) {
        Scanner explorador = new Scanner(System.in);
        boolean flag=true;
        do{
            try {
                System.out.print("Introduzca un numerador entero: ");
                int numerador = explorador.nextInt();

                System.out.print("Introduzca un denominador entero: ");
                int denominador = explorador.nextInt();

                int resultado = cociente(numerador, denominador);

                System.out.printf("Resultado: %d / %d = %d%n", numerador, denominador, resultado);
                flag=false;
            } 
            catch (InputMismatchException e) {
                System.out.printf("\nExcepcion: %s\n",e);
                explorador.nextLine();
               System.out.println("Debe introducir enteros. Intente de nuevo....\n");
            } 
            catch (ArithmeticException e) {
                System.out.printf("\nExcepcion: %s\n",e);
                explorador.nextLine();
                System.out.println("Cero es un denominador inválido. Intente de nuevo...\n");
            }
        }while (flag);
    }
}
