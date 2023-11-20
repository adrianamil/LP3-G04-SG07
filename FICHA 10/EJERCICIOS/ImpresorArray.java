/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion10.ejercicios;

public class ImpresorArray {

    // Método genérico para imprimir cualquier tipo de array
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    // Método no genérico específico para imprimir arrays de tipo String en formato tabular
    public static void imprimirArray(String[] array) {
        for (String elemento : array) {
            System.out.printf("%-10s", elemento);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Ejemplo de uso con un array de cadenas
        String[] arrayCadenas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};

        System.out.println("Array de cadenas contiene:");
        // Llamada al método genérico para imprimir cualquier tipo de array
        imprimirArray(arrayCadenas);

        // Llamada al método específico para imprimir arrays de tipo String en formato tabular
        imprimirArray(arrayCadenas);
    }
}
