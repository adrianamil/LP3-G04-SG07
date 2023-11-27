/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actvidiad4;

class Goodies_2 {
    private String name;

    public Goodies_2(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("No puede tener un nombre nulo o vacio");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Goodie: " + name);
    }
}