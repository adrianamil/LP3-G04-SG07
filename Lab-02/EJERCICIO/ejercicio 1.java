/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author ADRIANA TICONA
 */
public class PRACTICA2EJERCICIO1 {

    public static void main(String[] args) {
        
        try (java.util.Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el nombre del titular de la cuenta: ");
            String titular = scanner.nextLine();
            
            System.out.print("Desea ingresar una cantidad inicial? (si/no): ");
            String respuesta = scanner.nextLine();
            
            CuentaBanco cuenta;
            
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.print("Ingrese la cantidad inicial: ");
                double cantidadInicial = scanner.nextDouble();
                cuenta = new CuentaBanco(titular, cantidadInicial);
            } else {
                cuenta = new CuentaBanco(titular);
            }
            
            System.out.println("Informacion de la cuenta:");
            System.out.println(cuenta);
            
            int opcion;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Ingresar dinero");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Mostrar saldo actual");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese la cantidad a ingresar: ");
                        double cantidadIngresar = scanner.nextDouble();
                        cuenta.ingresar(cantidadIngresar);
                    }
                    case 2 -> {
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double cantidadRetirar = scanner.nextDouble();
                        cuenta.retirar(cantidadRetirar);
                    }
                    case 3 -> System.out.println("Saldo actual: " + cuenta.getCantidad());
                    case 4 -> System.out.println("Hasta luego!");
                    default -> System.out.println("Opcion no valida");
                }
            } while (opcion != 4);
        }
    }
}
