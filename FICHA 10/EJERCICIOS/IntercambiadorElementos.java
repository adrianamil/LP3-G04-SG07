/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion10.ejercicios;

import java.util.Arrays;

public class IntercambiadorElementos {

    // Método genérico para intercambiar las posiciones de dos elementos en un arreglo
    public static <T> void intercambiarElementos(T[] array, int indice1, int indice2) {
        if (indice1 >= 0 && indice1 < array.length && indice2 >= 0 && indice2 < array.length) {
            T temp = array[indice1];
            array[indice1] = array[indice2];
            array[indice2] = temp;
        } else {
            System.out.println("Índices fuera de rango.");
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso con un array de enteros
        Integer[] arrayEnteros = {1, 2, 3, 4, 5};

        System.out.println("Array original: " + Arrays.toString(arrayEnteros));

        // Intercambiar los elementos en las posiciones 1 y 3
        intercambiarElementos(arrayEnteros, 4, 2);

        System.out.println("Array después del intercambio: " + Arrays.toString(arrayEnteros));
    }
}
