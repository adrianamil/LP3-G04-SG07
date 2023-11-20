/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion10.ejercicios.ejercicio3;

public class ComparadorGenerico {
    // Método genérico para comparar dos objetos utilizando el método equals
    public static <T> boolean isEqualTo(T obj1, T obj2) {
        // Si ambos objetos son nulos, son iguales
        if (obj1 == null && obj2 == null) {
            return true;
        }
        // Si uno de los objetos es nulo,  no son iguales
        if (obj1 == null || obj2 == null) {
            return false;
        }
        // metodo equals para comparar 
        return obj1.equals(obj2);
    }
    public static void main(String[] args) {
        // uso con diferentes tipos de datos
        Object objeto1 = "Hola";
        Object objeto2 = "Hol";
        System.out.println("Son iguales (Object): " + isEqualTo(objeto1, objeto2));

        Integer numero1 = 5;
        Integer numero2 = 6;
        System.out.println("Son iguales (Integer): " + isEqualTo(numero1, numero2));

        Double decimal1 = 3.14;
        Double decimal2 = 3.15;
        System.out.println("Son iguales (Double): " + isEqualTo(decimal1, decimal2));

        String cadena1 = "Arroz";
        String cadena2 = "Zanahoria";
        System.out.println("Son iguales (String): " + isEqualTo(cadena1, cadena2));
        
        Persona persona1 = new Persona("Jose", 30);
        Persona persona2 = new Persona("Jose", 30);
        System.out.println("Son iguales (Persona): " + isEqualTo(persona1, persona2));
    }
}
