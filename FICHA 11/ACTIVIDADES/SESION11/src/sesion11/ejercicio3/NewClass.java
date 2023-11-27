/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion11.ejercicio3;

class IsFull extends Exception {
    public IsFull(String message) {
        super(message);
    }
}

class IsEmpty extends Exception {
    public IsEmpty(String message) {
        super(message);
    }
}

class ObjectNoExist extends Exception {
    public ObjectNoExist(String message) {
        super(message);
    }
}