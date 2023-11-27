/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author JORGE TICONA
 */
public class App {
    public static void main(String[] args) {
        

        // Par ordenado de tipo (Integer, Integer)
        OrderedPair<Integer, Integer> pair1 = new OrderedPair<>(1, 2);
        System.out.println("Pair 1: " + pair1);

        // Par ordenado de tipo (Integer, String)
        OrderedPair<Integer, String> pair2 = new OrderedPair<>(3, "Hola");
        System.out.println("Pair 2: " + pair2);

        // Par ordenado de tipo (String, Persona)
        Persona persona = new Persona("Juan Perez", 25); 
        OrderedPair<String, Persona> pair3 = new OrderedPair<>("Juan", persona);
        System.out.println("Pair 3: " + pair3);
    }
}
