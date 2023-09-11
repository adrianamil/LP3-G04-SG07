package coordenada;
public class Manejador {
    // Método de clase denominado area que permite calcular el área de un rectángulo.
    public static double area(Rectangulo rectangulo) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        int base = Math.abs(esquina2.getX() - esquina1.getX());
        int altura = Math.abs(esquina2.getY() - esquina1.getY());
        return base * altura;
    }
    // Método de clase denominado perímetro que permite calcular el perímetro de un rectángulo.
    public static double perimetro(Rectangulo rectangulo) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        int base = Math.abs(esquina2.getX() - esquina1.getX());
        int altura = Math.abs(esquina2.getY() - esquina1.getY());
        return 2 * (base + altura);
    }
    // Método de clase denominado moverX que desplaza un rectángulo en el eje X.
    public static void moverX(Rectangulo rectangulo, int puntos) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        esquina1.setX(esquina1.getX() + puntos);
        esquina2.setX(esquina2.getX() + puntos);
    }
    // Método de clase denominado moverY que desplaza un rectángulo en el eje Y.
    public static void moverY(Rectangulo rectangulo, int puntos) {
        Coordenada esquina1 = rectangulo.getEsquina1();
        Coordenada esquina2 = rectangulo.getEsquina2();
        esquina1.setY(esquina1.getY() + puntos);
        esquina2.setY(esquina2.getY() + puntos);
    }

}
