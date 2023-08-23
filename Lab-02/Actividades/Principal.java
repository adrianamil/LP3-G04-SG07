/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/package-info.java to edit this template
 */
package principal4;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        // Crear objetos Perro
        Perro fido = new Perro("chihuahua", "marron");
        Perro pelusa = new Perro("pequines", "blanco");

        // Incrementar edades
        fido.increEdad(2);
        pelusa.increEdad(5);

        // Imprimir información de los pDierros
        System.out.println("Información de Fido: " + fido.toString());
        System.out.println("Información de Pelusa: " + pelusa.toString());

        // Realizar diagnósticos de vacunas
        

        Diagnóstico d1 = new Diagnóstico(){};
        d1.aptoVacunaA(fido);
        d1.aptoVacunaB(pelusa.getEdad(),pelusa.peso, pelusa.getTemp());
        
        Scanner a1 = new Scanner(System.in);
        System.out.println("Nueva Temperatura: ");
        double newTemp = a1.nextDouble();
        pelusa.setTemp(newTemp);

        System.out.println("Nueva Edad: ");
        int newEdad = a1.nextInt();
        pelusa.setEdad(newEdad);

        System.out.println("Nuevo Peso: ");
        double newPeso = a1.nextDouble();
        pelusa.peso=newPeso;
        
        System.out.println("Información de Pelusa: " + pelusa.toString());
        d1.aptoVacunaA(pelusa);
        d1.aptoVacunaB(pelusa.getEdad(), pelusa.peso, pelusa.getTemp());
    }
}
