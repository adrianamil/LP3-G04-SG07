/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package principal4;

 

public class Diagnóstico {
    public void aptoVacunaA(Perro p1) {
        double temp = p1.getTemp();
        int edad = p1.getEdad();
        double peso = p1.peso;

        if(temp >= 37 && temp <=40 && peso > 5 && edad >1)
            System.out.println("Perro sano");
        else
            System.out.println("Perro enfermo");
    } 

    public void aptoVacunaB(int edad, double peso, double temp) {
        if(temp >= 37 && temp <=40 && peso > 5 && edad >1)
            System.out.println("Diagnostico: Perro sano");
        else
            System.out.println("Diagnostico: Perro enfermo");
    }

 

}  
