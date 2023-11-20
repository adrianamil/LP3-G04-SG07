/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion10;

/**
 *
 * @author JORGE TICONA
 */
    // Persona class definition
class Persona implements Comparable<Persona> {
        String dni;
        String nombres;
        String direccion;

        public Persona(String dni, String nombres, String direccion) {
            this.dni = dni;
            this.nombres = nombres;
            this.direccion = direccion;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "dni='" + dni + '\'' +
                    ", nombres='" + nombres + '\'' +
                    ", direccion='" + direccion + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Persona otraPersona) {
            return this.nombres.compareTo(otraPersona.nombres);
        }
    }