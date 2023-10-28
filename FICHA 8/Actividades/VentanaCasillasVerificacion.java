package CV;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaCasillasVerificacion extends JFrame {
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    public VentanaCasillasVerificacion() {
        super("Integrantes: Ana Paula Garzón Mendoza");
        setLayout(new FlowLayout());
        checkBox1 = new JCheckBox("Casilla 1");
        checkBox2 = new JCheckBox("Casilla 2");
        checkBox3 = new JCheckBox("Casilla 3");
        JPanel panel = new JPanel();
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        add(panel);
        ManejadorCasillasVerificacion manejador = new ManejadorCasillasVerificacion();
        checkBox1.addActionListener(manejador);
        checkBox2.addActionListener(manejador);
        checkBox3.addActionListener(manejador);
    }
    private class ManejadorCasillasVerificacion implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            String mensaje = "Casillas seleccionadas: ";
            if (checkBox1.isSelected()) {
                mensaje += "Casilla 1 ";
            }
            if (checkBox2.isSelected()) {
                mensaje += "Casilla 2 ";
            }
            if (checkBox3.isSelected()) {
                mensaje += "Casilla 3 ";
            }

            System.out.println(mensaje);
        }
    }
    public static void main(String[] args) {
        VentanaCasillasVerificacion ventana = new VentanaCasillasVerificacion();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 100);
        ventana.setVisible(true);
    }
}
