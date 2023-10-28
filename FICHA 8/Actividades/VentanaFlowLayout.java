package F;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaFlowLayout extends JFrame {
    private JButton botonRojo;
    private JButton botonAzul;
    private JButton botonVerde;
    public VentanaFlowLayout() {
        super("Integrantes: Ana Paula Garzón Mendoza");
        setLayout(new FlowLayout());
        botonRojo = new JButton("Rojo");
        botonAzul = new JButton("Azul");
        botonVerde = new JButton("Verde");
        add(botonRojo);
        add(botonAzul);
        add(botonVerde);
        ManejadorBotones manejador = new ManejadorBotones();
        botonRojo.addActionListener(manejador);
        botonAzul.addActionListener(manejador);
        botonVerde.addActionListener(manejador);
    }

    private class ManejadorBotones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            if (evento.getSource() == botonRojo) {
                getContentPane().setBackground(Color.RED);
            } else if (evento.getSource() == botonAzul) {
                getContentPane().setBackground(Color.BLUE);
            } else if (evento.getSource() == botonVerde) {
                getContentPane().setBackground(Color.GREEN);
            }
        }
    }

    public static void main(String[] args) {
        VentanaFlowLayout ventana = new VentanaFlowLayout();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 100);
        ventana.setVisible(true);
    }
}
