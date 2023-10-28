package CC;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCuadrosCombinados extends JFrame {
    private JComboBox<String> cuadroCombinado;

    public VentanaCuadrosCombinados() {
        super("Integrantes: Ana Paula Garzón Mendoza");
        setLayout(new FlowLayout());

        String[] opciones = { "Opción 1", "Opción 2", "Opción 3", "Opción 4" };
        cuadroCombinado = new JComboBox<>(opciones);
        add(cuadroCombinado);
        ManejadorCuadrosCombinados manejador = new ManejadorCuadrosCombinados();
        cuadroCombinado.addActionListener(manejador);
    }
    private class ManejadorCuadrosCombinados implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            String opcionSeleccionada = (String) cuadroCombinado.getSelectedItem();
            System.out.println("Opción seleccionada: " + opcionSeleccionada);
        }
    }
    public static void main(String[] args) {
        VentanaCuadrosCombinados ventana = new VentanaCuadrosCombinados();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 100);
        ventana.setVisible(true);
    }
}
