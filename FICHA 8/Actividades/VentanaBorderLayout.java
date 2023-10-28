package B;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaBorderLayout extends JFrame {
    private JButton botonNorte;
    private JButton botonSur;
    private JButton botonEste;
    private JButton botonOeste;
    private JButton botonCentro;
    public VentanaBorderLayout() {
        super("Integrantes: Ana Paula Garzón Mendoza");
        setLayout(new BorderLayout());
        botonNorte = new JButton("Norte");
        botonSur = new JButton("Sur");
        botonEste = new JButton("Este");
        botonOeste = new JButton("Oeste");
        botonCentro = new JButton("Centro");
        add(botonNorte, BorderLayout.NORTH);
        add(botonSur, BorderLayout.SOUTH);
        add(botonEste, BorderLayout.EAST);
        add(botonOeste, BorderLayout.WEST);
        add(botonCentro, BorderLayout.CENTER);
        ManejadorBotones manejador = new ManejadorBotones();
        botonNorte.addActionListener(manejador);
        botonSur.addActionListener(manejador);
        botonEste.addActionListener(manejador);
        botonOeste.addActionListener(manejador);
        botonCentro.addActionListener(manejador);
    }
    private class ManejadorBotones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            if (evento.getSource() == botonNorte) {
                getContentPane().setBackground(Color.RED);
            } else if (evento.getSource() == botonSur) {
                getContentPane().setBackground(Color.BLUE);
            } else if (evento.getSource() == botonEste) {
                getContentPane().setBackground(Color.GREEN);
            } else if (evento.getSource() == botonOeste) {
                getContentPane().setBackground(Color.YELLOW);
            } else if (evento.getSource() == botonCentro) {
                getContentPane().setBackground(Color.WHITE);
            }
        }
    }
    public static void main(String[] args) {
        VentanaBorderLayout ventana = new VentanaBorderLayout();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 200);
        ventana.setVisible(true);
    }
}
