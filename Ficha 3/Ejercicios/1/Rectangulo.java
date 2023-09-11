package coordenada;

/**
 *
 * @author JORGE TICONA
 */
public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;
    private String color;
    private static String[] colores = {"verde", "amarillo", "rojo"};
    private static int ultimoColorIndex = -1;
    
    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = c1;
        this.esquina2 = c2;
        asignarSiguienteColor();
    }
    public Rectangulo(int base, int altura) {
        this.esquina1 = new Coordenada(0, 0);
        this.esquina2 = new Coordenada(base, altura);
        asignarSiguienteColor();
    }
    public Coordenada getEsquina1() {
        return esquina1;
    }
    public void setEsquina1(Coordenada c) {
        esquina1 = c;
    }
    public Coordenada getEsquina2() {
        return esquina2;
    }
    public void setEsquina2(Coordenada c) {
        esquina2 = c;
    }
    public String getColor() {
        return color;
    }
    
    private void asignarSiguienteColor(){
        ultimoColorIndex = (ultimoColorIndex + 1) % colores.length;
        color = colores[ultimoColorIndex];
    }
    @Override
    public String toString() {
        return "Rectangulo: Esquina1" + esquina1.toString() + ", Esquina2" + esquina2.toString()+ ". Color: " + color;
    }
}
