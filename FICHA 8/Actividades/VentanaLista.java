package L;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.FlowLayout;
public class VentanaLista extends JFrame {
    private JList<String> lista;

    public VentanaLista() {
        super("Integrantes: Ana Paula Garzón Mendoza");
        setLayout(new FlowLayout());

        String[] elementos = { "Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4" };
        lista = new JList<>(elementos);
        lista.setVisibleRowCount(4);

        JScrollPane scrollPane = new JScrollPane(lista);
        add(scrollPane);
        ManejadorLista manejador = new ManejadorLista();
        lista.addListSelectionListener(manejador);
    }

    private class ManejadorLista implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent evento) {
            if (!evento.getValueIsAdjusting()) {
                Object[] elementosSeleccionados = lista.getSelectedValuesList().toArray();
                System.out.print("Elementos seleccionados: ");
                for (Object elemento : elementosSeleccionados) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        VentanaLista ventana = new VentanaLista();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(300, 150);
        ventana.setVisible(true);
    }
}
