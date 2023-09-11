package coordenada;

/**
 *
 * @author JORGE TICONA
 */
public class Principal {
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada(1, 2);
        Coordenada c2 = new Coordenada(4, 6);
        Rectangulo rectangulo = new Rectangulo(c1, c2);

        System.out.println("Coordenada 1: " + c1.toString());
        System.out.println("Coordenada 2: " + c2.toString());
        System.out.println("Distancia entre coordenadas: " + c1.distancia(c2));
        System.out.println("Distancia estatica entre coordenadas: " + Coordenada.distancia(c1, c2));
        System.out.println(rectangulo.toString());
        
        
        // Área y perímetro del rectángulo original
        double areaOriginal = Manejador.area(rectangulo);
        double perimetroOriginal = Manejador.perimetro(rectangulo);
        System.out.println("Area del rectangulo original: " + areaOriginal);
        System.out.println("Perimetro del rectangulo original: " + perimetroOriginal);

        // Mover el rectángulo en el eje X e Y
        Manejador.moverX(rectangulo, 2);
        Manejador.moverY(rectangulo, 3);

        System.out.println("Rectangulo desplazado en el eje X e Y: " + rectangulo.toString());

        // Área y perímetro del rectángulo después de moverlo
        double areaDesplazado = Manejador.area(rectangulo);
        double perimetroDesplazado = Manejador.perimetro(rectangulo);
        System.out.println("Area del rectangulo desplazado: " + areaDesplazado);
        System.out.println("Perimetro del rectangulo desplazado: " + perimetroDesplazado);
        
        // Color de rectángulo
        Rectangulo rectangulo2 = new Rectangulo(5,3);
        System.out.println("Color derectangulo: " +rectangulo2.toString());
    }
    }
