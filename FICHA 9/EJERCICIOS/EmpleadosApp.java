import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadosApp {
    private List<Empleado> empleados = new ArrayList<>();
    private JFrame frame;
    private JPanel panel;
    private JTextField numeroField, nombreField, sueldoField;
    private JTextArea empleadosTextArea;
    public EmpleadosApp() {
        frame = new JFrame("Empleados");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(new JLabel("Número:"));
        numeroField = new JTextField();
        panel.add(numeroField);
        panel.add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        panel.add(nombreField);
        panel.add(new JLabel("Sueldo:"));
        sueldoField = new JTextField();
        panel.add(sueldoField);
        JButton agregarButton = new JButton("Agregar Empleado");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEmpleado();
            }
        });
        panel.add(agregarButton);
        empleadosTextArea = new JTextArea();
        empleadosTextArea.setEditable(false);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(empleadosTextArea), BorderLayout.CENTER);
        cargarEmpleadosDesdeArchivo(); 
        mostrarEmpleados();
        frame.setVisible(true);
    }
    private void agregarEmpleado() {
        try {
            int numero = Integer.parseInt(numeroField.getText());
            String nombre = nombreField.getText();
            double sueldo = Double.parseDouble(sueldoField.getText());
            Empleado nuevoEmpleado = new Empleado(numero, nombre, sueldo);
            empleados.add(nuevoEmpleado);
            guardarEmpleadosEnArchivo(); // Guardar el empleado en el archivo.
            mostrarEmpleados();
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Ingrese datos válidos para número y sueldo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void mostrarEmpleados() {
        empleadosTextArea.setText("");
        for (Empleado empleado : empleados) {
            empleadosTextArea.append(empleado.toString() + "\n");
        }
    }
    private void limpiarCampos() {
        numeroField.setText("");
        nombreField.setText("");
        sueldoField.setText("");
    }
    private void cargarEmpleadosDesdeArchivo() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empleados.txt"))) {
            empleados = (List<Empleado>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            empleados = new ArrayList<>();
        }
    }
    private void guardarEmpleadosEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empleados.txt"))) {
            oos.writeObject(empleados);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Error al guardar el archivo de empleados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EmpleadosApp();
            }
        });
    }
}

