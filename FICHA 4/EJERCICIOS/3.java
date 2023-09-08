import java.util.Arrays;
public class Ventas {
    public static void main(String[] args) {
        int[][] ventas = new int[4][5]; 
        int[][] notasVentas = {
            {1, 1, 106},
            {2, 1, 120},
            {3, 2, 200},
            {1, 3, 310},
            {2, 4, 380},
        };
        for (int i = 0; i < notasVentas.length; i++) {
            int vendedor = notasVentas[i][0];
            int producto = notasVentas[i][1];
            int valorVenta = notasVentas[i][2];
            ventas[vendedor - 1][producto - 1] += valorVenta;
        }
        System.out.println("Producto\tVendedor 1\tVendedor 2\tVendedor 3\tVendedor 4\tTotal");
        for (int i = 0; i < 5; i++) {
            System.out.print("Producto " + (i + 1) + "\t");
            int totalProducto = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print(ventas[j][i] + "\t\t");
                totalProducto += ventas[j][i];
            }
            System.out.println(totalProducto);
        }
        System.out.print("Total\t\t");
        int[] totalVendedor = new int[4];
        Arrays.fill(totalVendedor, 0);

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                totalVendedor[j] += ventas[j][i];
            }
            System.out.print(totalVendedor[j] + "\t\t");
        }
        System.out.println();
    }
}
