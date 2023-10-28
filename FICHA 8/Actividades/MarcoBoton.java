import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;

public class MarcoBoton extends JFrame {
    private final JButton botonJButtonSimple; 
    private final JButton botonJButtonElegante; 

    public MarcoBoton() {
        super("Integrantes de grupo: Ana Paula Garzon Mendoza");
        setLayout(new FlowLayout());

        botonJButtonSimple = new JButton("Boton basico");
        add(botonJButtonSimple); 

        ImageIcon iconOriginal = new ImageIcon("C:\\Users\\Ana Paula\\OneDrive\\UNIVERSIDAD\\LP 3\\PRACTICA\\Disney.png");
        // Escalar la imagen al tamaño deseado (por ejemplo, 100x100 píxeles)
        Image imgEscalada = iconOriginal.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Icon drag1 = new ImageIcon(imgEscalada);

        ImageIcon iconOriginalRollover = new ImageIcon("C:\\Users\\Ana Paula\\OneDrive\\UNIVERSIDAD\\LP 3\\PRACTICA\\Mickey.png");
        // Escalar la imagen de sustitución al tamaño deseado
        Image imgEscaladaRollover = iconOriginalRollover.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Icon drag2 = new ImageIcon(imgEscaladaRollover);

        botonJButtonElegante = new JButton("Boton personalizado", drag1);
        botonJButtonElegante.setRolloverIcon(drag2);
        add(botonJButtonElegante);

        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener(manejador);
        botonJButtonSimple.addActionListener(manejador);
    }

    private class ManejadorBoton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            JOptionPane.showMessageDialog(MarcoBoton.this,
                    String.format("Usted apretó: %s", evento.getActionCommand()));
        }
    }
}
