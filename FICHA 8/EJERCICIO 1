
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompraPasajesApp extends JFrame {
    private JTextField txtNombre, txtDocumento, txtFechaViaje;
    private JCheckBox chkAudifonos, chkManta, chkRevistas;
    private JRadioButton rdbPrimerPiso, rdbSegundoPiso;
    private JComboBox<String> cmbOrigen, cmbDestino;
    private JList<String> lstCalidadServicio;

    public CompraPasajesApp() {
        setTitle("Compra de Pasajes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        JPanel panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(0, 2));

        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(20);
        JLabel lblDocumento = new JLabel("Documento de Identidad:");
        txtDocumento = new JTextField(10);
        JLabel lblFechaViaje = new JLabel("Fecha de Viaje:");
        txtFechaViaje = new JTextField(10);

        JLabel lblServiciosOpcionales = new JLabel("Servicios Opcionales:");
        chkAudifonos = new JCheckBox("Audífonos");
        chkManta = new JCheckBox("Manta");
        chkRevistas = new JCheckBox("Revistas");

        JLabel lblPiso = new JLabel("Piso:");
        rdbPrimerPiso = new JRadioButton("1er Piso");
        rdbSegundoPiso = new JRadioButton("2do Piso");
        ButtonGroup pisoGroup = new ButtonGroup();
        pisoGroup.add(rdbPrimerPiso);
        pisoGroup.add(rdbSegundoPiso);

        JLabel lblOrigen = new JLabel("Origen:");
        cmbOrigen = new JComboBox<>(new String[]{"Ciudad A", "Ciudad B", "Ciudad C"});
        JLabel lblDestino = new JLabel("Destino:");
        cmbDestino = new JComboBox<>(new String[]{"Ciudad X", "Ciudad Y", "Ciudad Z"});

        JLabel lblCalidadServicio = new JLabel("Calidad de Servicio:");
        lstCalidadServicio = new JList<>(new String[]{"Económico", "Standard", "VIP"});

        panelDatos.add(lblNombre);
        panelDatos.add(txtNombre);
        panelDatos.add(lblDocumento);
        panelDatos.add(txtDocumento);
        panelDatos.add(lblFechaViaje);
        panelDatos.add(txtFechaViaje);

        panelDatos.add(lblServiciosOpcionales);
        panelDatos.add(new JPanel()); // Espacio vacío
        panelDatos.add(chkAudifonos);
        panelDatos.add(chkManta);
        panelDatos.add(chkRevistas);

        panelDatos.add(lblPiso);
        panelDatos.add(new JPanel()); // Espacio vacío
        panelDatos.add(rdbPrimerPiso);
        panelDatos.add(rdbSegundoPiso);

        panelDatos.add(lblOrigen);
        panelDatos.add(cmbOrigen);
        panelDatos.add(lblDestino);
        panelDatos.add(cmbDestino);

        panelDatos.add(lblCalidadServicio);
        panelDatos.add(new JScrollPane(lstCalidadServicio));

        JPanel panelBoton = new JPanel();
        panelBoton.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton btnResumen = new JButton("Mostrar Resumen");
        panelBoton.add(btnResumen);

        add(panelDatos, BorderLayout.CENTER);
        add(panelBoton, BorderLayout.SOUTH);

        // Manejador para el botón de resumen
        btnResumen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarResumen();
            }
        });
    }

    private void mostrarResumen() {
        StringBuilder resumen = new StringBuilder("Resumen de la Compra:\n");
        resumen.append("Nombre: ").append(txtNombre.getText()).append("\n");
        resumen.append("Documento de Identidad: ").append(txtDocumento.getText()).append("\n");
        resumen.append("Fecha de Viaje: ").append(txtFechaViaje.getText()).append("\n");
        resumen.append("Servicios Opcionales: ");
        if (chkAudifonos.isSelected()) resumen.append("Audífonos ");
        if (chkManta.isSelected()) resumen.append("Manta ");
        if (chkRevistas.isSelected()) resumen.append("Revistas ");
        resumen.append("\n");
        resumen.append("Piso: ").append(rdbPrimerPiso.isSelected() ? "1er Piso" : "2do Piso").append("\n");
        resumen.append("Origen: ").append(cmbOrigen.getSelectedItem()).append("\n");
        resumen.append("Destino: ").append(cmbDestino.getSelectedItem()).append("\n");
        resumen.append("Calidad de Servicio: ").append(lstCalidadServicio.getSelectedValue());

        JOptionPane.showMessageDialog(this, resumen.toString(), "Resumen de Compra", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CompraPasajesApp app = new CompraPasajesApp();
            app.setVisible(true);
        });
    }
}
