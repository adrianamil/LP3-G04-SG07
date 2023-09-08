package evaluacioncrediticia;

import java.util.Scanner;

public class EvaluacionCrediticia {

    public static void main(String[] args) {
        int totalPersonas;
        int hombres;
        int mujeres;
        int hombresTrabajan;
        int mujeresTrabajan;
        int sueldoHombresTrabajan;
        int sueldoMujeresTrabajan;
        try (Scanner scanner = new Scanner(System.in)) {
            totalPersonas = 8;
            hombres = 0;
            mujeres = 0;
            hombresTrabajan = 0;
            mujeresTrabajan = 0;
            sueldoHombresTrabajan = 0;
            sueldoMujeresTrabajan = 0;
            for (int i = 0; i < totalPersonas; i++) {
                System.out.println("Ingrese el sexo (1=masculino, 2=femenino): ");
                int sexo = scanner.nextInt();
                System.out.println("Trabaja? (1=si trabaja, 2=no trabaja): ");
                int trabaja = scanner.nextInt();
                int sueldo = 0;
                
                if (trabaja == 1) {
                    System.out.println("Ingrese el sueldo (entre 950 y 3000): ");
                    sueldo = scanner.nextInt();
                }
                
                if (sexo == 1) {
                    hombres++;
                    if (trabaja == 1) {
                        hombresTrabajan++;
                        sueldoHombresTrabajan += sueldo;
                    }
                } else {
                    mujeres++;
                    if (trabaja == 1) {
                        mujeresTrabajan++;
                        sueldoMujeresTrabajan += sueldo;
                    }
                }
            }
        }

        double porcentajeHombres = (double) hombres / totalPersonas * 100;
        double porcentajeMujeres = (double) mujeres / totalPersonas * 100;
        double porcentajeHombresTrabajan = (double) hombresTrabajan / hombres * 100;
        double porcentajeMujeresTrabajan = (double) mujeresTrabajan / mujeres * 100;
        double sueldoPromedioHombresTrabajan = (double) sueldoHombresTrabajan / hombresTrabajan;
        double sueldoPromedioMujeresTrabajan = (double) sueldoMujeresTrabajan / mujeresTrabajan;

        System.out.println("a) Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("b) Porcentaje de mujeres: " + porcentajeMujeres + "%");
        System.out.println("c) Porcentaje de hombres que trabajan: " + porcentajeHombresTrabajan + "%");
        System.out.println("d) Porcentaje de mujeres que trabajan: " + porcentajeMujeresTrabajan + "%");
        System.out.println("e) Sueldo promedio de los hombres que trabajan: " + sueldoPromedioHombresTrabajan);
        System.out.println("f) Sueldo promedio de las mujeres que trabajan: " + sueldoPromedioMujeresTrabajan);
    }
}

