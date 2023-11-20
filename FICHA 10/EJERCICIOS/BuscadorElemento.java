/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion10.newpackage;

public class BuscadorElemento {

    // Método genérico para buscar un elemento en un arreglo
    public static <T extends Number> int buscarElemento(T[] arreglo, String atributoBuscado, String valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            T elemento = arreglo[i];
            switch (atributoBuscado) {
                case "codigo":
                    // Validación para asegurar que el elemento sea una instancia de Number
                    if (elemento instanceof Producto) {
                        Producto producto = (Producto) elemento;
                        if (producto.getCodigo().equals(valorBuscado)) {
                            return i;
                        }
                    }
                    break;
                // Otros casos de búsqueda según el atributo
                default:
                    throw new IllegalArgumentException("Atributo de búsqueda no válido");
            }
        }
        return -1; // Si no se encuentra el elemento, devolver -1
    }

}

    