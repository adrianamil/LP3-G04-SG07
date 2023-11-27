/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejerciciodos;

/**
 *
 * @author JORGE TICONA
 */
public class main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        // agregar pares
        dictionary.addes("clave1", "valor1");
        dictionary.addes("clave2", "valor2");
        dictionary.addes("clave3", "valor3");

        // mostrar  diccionario
        System.out.println(dictionary);

        // eliminar un par existente
        dictionary.delete("clave2");

        // mostrar el diccionario despuees de la eliminacion
        System.out.println(dictionary);

        // intenta obtener el valor de una clave q ya no hay
        try {
            Object value = dictionary.getValue("clave2");
            System.out.println("Valor obtenido: " + value);
        } catch (Dictionary.ObjectNoExistException e) {
            System.out.println(e.getMessage());
        }
    }
}
