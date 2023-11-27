/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actvidiad4;

public class Jerarquia {
    public static void main(String[] args) {
        try {
            Goodies_2 goodies = new Goodies_2("LLavero");
            goodies.display();
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo crear Goodies: " + e.getMessage());
        }
        try {
            Biscuits biscuits = new Biscuits("Chocosoda", 10);
            biscuits.display();
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo crear Biscuits: " + e.getMessage());
        }
        try {
            Chocolates chocolates = new Chocolates("Chocolate Bitter", "Amargo");
            chocolates.display();
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo crear Chocolates: " + e.getMessage());
        }
        try {
            Soda soda = new Soda("Pepsi", 5, "Personal");
            soda.display();
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo crear Soda: " + e.getMessage());
        }
        try {
            Sweet sweet = new Sweet("Pastel", 8, "Tres Leches");
            sweet.display();
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo crear Sweet: " + e.getMessage());
        }
    }
}