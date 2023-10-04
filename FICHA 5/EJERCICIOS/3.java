import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
    private List<Cliente> clientes = new ArrayList<>();

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente darBajaCliente(String nombre) {
        Cliente clienteAEliminar = null;
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getNombre().equals(nombre)) {
                clienteAEliminar = cliente;
                iterator.remove();
                break;
            }
        }
        return clienteAEliminar;
    }

    public List<Cliente> clientesTipo(String tipo) {
        List<Cliente> clientesPorTipo = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getTipo().equals(tipo)) {
                clientesPorTipo.add(cliente);
            }
        }
        return clientesPorTipo;
    }
}
/////////
public class Cliente {
    private String nombre;
    private String tipo;

    public Cliente(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tipo: " + tipo;
    }
}
//////////////
import java.util.List;

public class TestAsociacion {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("Cliente1", "C");
        Cliente cliente2 = new Cliente("Cliente2", "C");
        Cliente cliente3 = new Cliente("Cliente3", "B");
        Cliente cliente4 = new Cliente("Cliente4", "E");

        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);
        banco.agregarCliente(cliente3);
        banco.agregarCliente(cliente4);

        Cliente clienteEliminado = banco.darBajaCliente("Cliente2");
        if (clienteEliminado != null) {
            System.out.println("Cliente eliminado: " + clienteEliminado);
        } else {
            System.out.println("Cliente no encontrado.");
        }

        // Prueba del método clientesTipo
        List<Cliente> clientesCliente = banco.clientesTipo("C");
        System.out.println("Clientes de tipo C:");
        for (Cliente cliente : clientesCliente) {
            System.out.println(cliente);
        }

        List<Cliente> clientesBancaExclusiva = banco.clientesTipo("B");
        System.out.println("Clientes de tipo B:");
        for (Cliente cliente : clientesBancaExclusiva) {
            System.out.println(cliente);
        }

        List<Cliente> clientesEmpresarial = banco.clientesTipo("E");
        System.out.println("Clientes de tipo E:");
        for (Cliente cliente : clientesEmpresarial) {
            System.out.println(cliente);
        }
    }
}
