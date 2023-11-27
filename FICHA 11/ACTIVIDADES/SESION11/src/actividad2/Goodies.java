/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

public class Goodies implements Contenedorapp<Integer> {
    private int id;
    private String description;
    private float price;

    // Constructor de la clase Goodies
    public Goodies(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public boolean contiene(Integer valor) {
        return id == valor;
    }

}
