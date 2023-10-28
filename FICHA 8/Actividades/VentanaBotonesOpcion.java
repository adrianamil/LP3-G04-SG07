package BO;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaBotonesOpcion extends JFrame {
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    public VentanaBotonesOpcion() {
        super("Integrantes: Ana Paula Garzón Mendoza");
        setLayout(new FlowLayout());
        radioButton1 = new JRadioButton("Opción 1");
        radioButton2 = new JRadioButton("Opción 2");
        radioButton3 = new JRadioButton("Opción 3");
        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(radioButton1);
        grupoBotones.add(radioButton2);
        grupoBotones.add(radioButton3);
        JPanel panel = new JPanel();
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        add(panel);
        ManejadorBotonesOpcion manejador = new ManejadorBotonesOpcion();
        radioButton1.addActionListener(manejador);
        radioButton2.addActionListener(manejador);
        radioButton3.addActionListener(manejador);
    }
    private class ManejadorBotonesOpcion implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            String opcionSeleccionada = ((JRadioButton) evento.getSource()).getText();
            System.out.println("Opción seleccionada: " + opcionSeleccionada);
        }
    }
    public static void main(String[] args) {
        VentanaBotonesOpcion ventana = new VentanaBotonesOpcion();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 100);
        ventana.setVisible(true);
    }
}
