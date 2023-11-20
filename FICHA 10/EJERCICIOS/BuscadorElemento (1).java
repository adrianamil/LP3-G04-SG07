/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion10.ejercicios.newpackage;

public class BuscadorElemento {
    // Método genérico para buscar un elemento en un arreglo
    public static <T> int buscarElemento(T[] arreglo, String atributoBuscado, String valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            T elemento = arreglo[i];
            switch (atributoBuscado) {
                case "codigo":
                    if (elemento instanceof Producto) {
                        Producto producto = (Producto) elemento;
                        if (producto.getCodigo().equals(valorBuscado)) {
                            return i;
                        }
                    }
                    break;
                case "nombres":
                    if (elemento instanceof Persona) {
                        Persona persona = (Persona) elemento;
                        if (persona.getNombres().equals(valorBuscado)) {
                            return i;
                        }
                    }
                    break;
                case "nombresCarrera":
                    if (elemento instanceof Estudiante) {
                        Estudiante estudiante = (Estudiante) elemento;
                        if (estudiante.getNombres().equals(valorBuscado) && estudiante.getCarrera().equals(valorBuscado)) {
                            return i;
                        }
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Atributo de búsqueda no válido");
            }
        }
        return -1; // Si no se encuentra el elemento, devolver -1
    }
}

    