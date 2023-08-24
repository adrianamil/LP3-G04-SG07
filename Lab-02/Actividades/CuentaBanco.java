/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.ejercicio.pkg1;

/**
 *
 * @author ADRIANA TICONA
 */
public class CuentaBanco {
    private String titular;
    private double cantidad;

    // Constructor con titular obligatorio y cantidad opcional
    public CuentaBanco(String titular) {
        this.titular = titular;
    }

    public CuentaBanco(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Métodos getter y setter
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método para ingresar dinero a la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = Math.max(0, this.cantidad - cantidad);
        }
    }

    @Override
    public String toString() {
        return "Titular: " + titular + ", Cantidad: " + cantidad;
    }
}
