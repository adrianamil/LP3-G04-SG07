/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion11.ejercicio3;

public class App {
    public static void main(String[] args) {
        try {
            Bag<Integer> integerBag = new Bag<>(5);
            integerBag.add(1);
            integerBag.add(2);
            integerBag.add(3);

            System.out.println("Bag of Integers: " + integerBag);

            Bag<String> stringBag = new Bag<>(3);
            stringBag.add("Hello");
            stringBag.add("World");

            System.out.println("Bag of Strings: " + stringBag);

            // Supongamos que tienes una clase Persona con un método toString implementado
            Bag<Persona> personaBag = new Bag<>(2);
            personaBag.add(new Persona("John", 25));
            personaBag.add(new Persona("Jane", 30));

            System.out.println("Bag of Personas: " + personaBag);

            // Prueba de remove
            personaBag.remove(new Persona("John", 25));
            System.out.println("After removing John: " + personaBag);
        } catch (IsFull | IsEmpty | ObjectNoExist e) {
            e.printStackTrace();
        }
    }
}
