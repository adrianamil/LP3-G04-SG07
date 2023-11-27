/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion11;

public class App {
    public static void main(String[] args) {

        // (Integer, Integer)
        OrderedPair<Integer, Integer> pair1 = new OrderedPair<>(1, 2);
        System.out.println("Pair 1: " + pair1);

        //(Integer, String)
        OrderedPair<Integer, String> pair2 = new OrderedPair<>(3, "Hello");
        System.out.println("Pair 2: " + pair2);

        // (String, Persona)
        Persona persona = new Persona("Pedro Picapiedra" , 50);
        OrderedPair<String, Persona> pair3 = new OrderedPair<>("pepito", persona);
        System.out.println("Pair 3: " + pair3);
    }
}