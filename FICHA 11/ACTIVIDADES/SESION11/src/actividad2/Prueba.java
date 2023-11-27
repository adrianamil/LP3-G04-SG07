/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;
public class Prueba {
    public static void main(String[] args) {
        // Ejemplo con Persona
        Persona persona = new Persona("Miguel", "pecesitos", "123456789");
        System.out.println(persona.contiene("Miguel")); 
        
        // Ejemplo con Goodies
        Goodies goodies = new Goodies(5, "Polo", 6.87f);
        System.out.println(goodies.contiene(5)); 

        // Ejemplo con Estudiante
        Procedencia procedencia = new Procedencia("Arequipa", "Arequipa");
        Estudiante estudiante = new Estudiante("Miguel", "pecesitos", "123456789", "Chef", procedencia);
        System.out.println(estudiante.contiene("Miguel"));
        System.out.println(estudiante.contiene("Miguel", procedencia)); 
    }
}
