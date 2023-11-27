/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad3;

public class Actividad_3 {
    public static void main(String[] args) throws IsFull, ObjectNoExist {
        System.out.println("BAG INTEGER");
        Bag<Integer> bolsaInteger = new Bag<>(5);
        bolsaInteger.add(1);
        bolsaInteger.add(2);
        System.out.println(bolsaInteger);
        System.out.println(" nuevo Integer");
        bolsaInteger.add(3);
        System.out.println(bolsaInteger);
        System.out.println("Eliminar Integer");
        bolsaInteger.remove(1);
        System.out.println(bolsaInteger);
        System.out.println("Posicion de 3: " + bolsaInteger.getIndex(3));
        System.out.println("BAG STRING ");
        Bag<String> bolsaString = new Bag<>(3);
        bolsaString.add("Rojo");
        bolsaString.add("Azul");
        System.out.println(bolsaString);
        System.out.println("nuevo String");
        bolsaString.add("Verde");
        System.out.println(bolsaString);
        System.out.println(" Eliminar String");
        bolsaString.remove("Rojo");
        System.out.println(bolsaString);
        System.out.println(" Posicion de Azul: " + bolsaString.getIndex("Azul"));
        System.out.println("BAG PERSONA ");
        Persona p1 = new Persona("Juan", "peras", "234652789");
        Persona p2 = new Persona("Pablo", "manzanas", "123456789");
        Persona p3 = new Persona("Luis", "duraznos", "234567435");
        Bag<Persona> bolsaPersona = new Bag<>(3);
        bolsaPersona.add(p1);
        bolsaPersona.add(p2);
        System.out.println(bolsaPersona);
        System.out.println("Anadir nueva Persona");        
        bolsaPersona.add(p3);
        System.out.println(bolsaPersona);
        System.out.println("Eliminar Persona");   
        bolsaPersona.remove(p2);
        System.out.println(bolsaPersona);
        System.out.println("Posicion de P1: " + bolsaPersona.getIndex(p3));
    }
}