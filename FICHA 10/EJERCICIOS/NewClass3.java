/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion10.ejercicios.newpackage;

import static sesion10.ejercicios.newpackage.BuscadorElemento.buscarElemento;

public class NewClass3 {
    public static void main(String[] args) {
        // Ejemplo de uso con diferentes tipos de datos
        Producto[] productos = {
                new Producto("001", "Producto1", 10.0),
                new Producto("002", "Producto2", 20.0),
                new Producto("003", "Producto3", 30.0)
        };

        Persona[] personas = {
                new Persona("123", "Persona1", "Dirección1"),
                new Persona("456", "Persona2", "Dirección2"),
                new Persona("789", "Persona3", "Dirección3")
        };

        Estudiante[] estudiantes = {
                new Estudiante("999", "Estudiante1", "Dirección4", "Carrera1"),
                new Estudiante("888", "Estudiante2", "Dirección5", "Carrera2"),
                new Estudiante("777", "Estudiante3", "Dirección6", "Carrera3")
        };

        // Búsqueda por código en productos
        int posicionProducto = buscarElemento(productos, "codigo", "001");
        System.out.println("Posición del producto: " + posicionProducto);

        // Búsqueda por nombres en personas
        int posicionPersona = buscarElemento(personas, "nombres", "Persona3");
        System.out.println("Posición de la persona: " + posicionPersona);

        // Búsqueda por nombres y carrera en estudiantes
        int posicionEstudiante = buscarElemento(estudiantes, "nombresCarrera", "Estudiante2");
        System.out.println("Posición del estudiante: " + posicionEstudiante);
    }
}


