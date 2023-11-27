/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actvidiad4;

// Subclase Chocolates

class Chocolates extends Goodies_2 {
    private String sabor;

    public Chocolates(String name, String sabor) {
        super(name);
        if (sabor == null || sabor.isEmpty()) {
            throw new IllegalArgumentException("El sabor no puede ser nulo o vacío");
        }
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void display() {
        System.out.println("Chocolate: " + getName() + ", Sabor: " + sabor);
    }
}