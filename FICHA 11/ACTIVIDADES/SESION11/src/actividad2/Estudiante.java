/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

public class Estudiante extends Persona implements Contenedorapp<String> {
    private final String especialidad;
    private final Procedencia procedencia;

    public Estudiante(String nombre, String direccion, String telefono, String especialidad, Procedencia procedencia) {
        super(nombre, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia = procedencia;
    }


    @Override
    public boolean contiene(String valor) {
        // Verificación por nombre
        return getNombre().equals(valor);
    }

    public boolean contiene(String nombre, Procedencia procedencia) {
        // Verificación por nombre y procedencia
        return getNombre().equals(nombre) && this.procedencia.equals(procedencia);
    }

}
