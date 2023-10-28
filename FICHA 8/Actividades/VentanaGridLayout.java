package G;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaGridLayout extends JFrame {
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    public VentanaGridLayout() {
        super("Integrantes: Ana Paula Garzón Mendoza");
        setLayout(new GridLayout(3, 1));
        boton1 = new JButton("Rojo");
        boton2 = new JButton("Azul");
        boton3 = new JButton("Verde");
        add(boton1);
        add(boton2);
        add(boton3);
        ManejadorBotones manejador = new ManejadorBotones();
        boton1.addActionListener(manejador);
        boton2.addActionListener(manejador);
        boton3.addActionListener(manejador);
    }
    private class ManejadorBotones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            if (evento.getSource() == boton1) {
                getContentPane().setBackground(Color.RED);
            } else if (evento.getSource() == boton2) {
                getContentPane().setBackground(Color.BLUE);
            } else if (evento.getSource() == boton3) {
                getContentPane().setBackground(Color.GREEN);
            }
        }
    }
    public static void main(String[] args) {
        VentanaGridLayout ventana = new VentanaGridLayout();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(200, 200);
        ventana.setVisible(true);
    }
}
