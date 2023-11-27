/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad3;

/**
 *
 * @author JORGE TICONA
 */
public class ObjectNoExist extends Exception {
    public ObjectNoExist() {
        super("El objeto no existe en la bolsa");
    }
}