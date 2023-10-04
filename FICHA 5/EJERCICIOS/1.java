//Clase Contacto
package agenda;

public class Contacto {
	String nombre, telefono, direccion;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Contacto(String nombre, String telefono, String direccion) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Contacto Nombre:" + nombre + ", telefono:" + telefono + ", direccion:" + direccion;
	}
}


//Clase agenda
package agenda;
import java.util.*;
public class Agenda {
	ArrayList<Contacto> agenda;

	public Agenda(ArrayList<Contacto> agenda) {
		this.agenda = agenda;
	}

	public Agenda() {
		this.agenda = new ArrayList<Contacto>();
	}
	public void add_contact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del nuevo contacto");
		String nombre = sc.nextLine();
		System.out.println("Ingrese el telefono del nuevo contacto");
		String telefono = sc.nextLine();
		System.out.println("Ingrese el dirección del nuevo contacto");
		String direccion = sc.nextLine();
		Contacto contacto = new Contacto(nombre, telefono, direccion);
		this.agenda.add(contacto);
	}

	public Contacto buscarContacto(String nombre) {
		for (Contacto contacto : this.agenda) {
			if (contacto.getNombre().equals(nombre)) {
				return contacto;
			}
		}
		System.out.println("No existe el contacto con nombre: " + nombre);
		return null;
	}

	public void update(String nombre) {
		int option = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < this.agenda.size();i++) {
			if (this.agenda.get(i) == null) {
				continue;
			}
			else if (this.agenda.get(i) != null){
				Contacto contacto = this.buscarContacto(nombre);
				System.out.println("¿Qué es lo que desea cambiar?");
				System.out.println("1. Nombre");
				System.out.println("2. Teléfono");
				System.out.println("3. Dirección");
				option = sc.nextInt();
				switch (option) {
				case 1:
					System.out.println("Datos actuales del contacto");
					System.out.println(contacto.toString());
					sc.nextLine();
					System.out.println("Ingrese el nuevo nombre");
					String newNombre;
					newNombre = sc.nextLine();
					contacto.setNombre(newNombre);
					break;
				case 2:
					System.out.println("Datos actuales del contacto");
					this.agenda.get(i).toString();
					sc.nextLine();
					System.out.println("Ingrese el nuevo teléfono");
					String newTelefono = sc.nextLine();
					this.agenda.get(i).setTelefono(newTelefono);
					break;
				case 3:
					System.out.println("Datos actuales del contacto");
					this.agenda.get(i).toString();
					sc.nextLine();
					System.out.println("Ingrese la nueva dirección");
					String newDireccion = sc.nextLine();
					this.agenda.get(i).setDireccion(newDireccion);
					break;
				default:
					System.out.println("Opción incorrecta");
					break;
				}
			} else if (this.agenda.get(i) == null && this.agenda.size()-1==i){
				System.out.println("No se encontro el contacto");
			}
		}
	}
	
	public void eliminate(String nombre) {
		int option = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < this.agenda.size();i++) {
			if (this.agenda.get(i) == null) {
				continue;
			}
			else if (this.agenda.get(i) != null){
				System.out.println("Esta seguro de eliminar este contacto\nSi => 1 || No =>0");
				option=sc.nextInt();
				if (option == 1) {
					this.agenda.remove(i);
				break;
				} else break;
			}
			else if (this.agenda.get(i) == null && this.agenda.size()-1==i){
				System.out.println("No se encontro el contacto");
			}
		}
	}
	
	public void show() {
		for (Contacto x:this.agenda){
			System.out.println(x.toString());
		}
	}
}

//main
package agenda;
import java.util.*;

public class main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        while (opcion != 6) {
            System.out.println("\nMenu de la agenda:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Actualizar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Mostrar contactos");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    agenda.add_contact();
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    Contacto contacto = agenda.buscarContacto(nombre);
                    if (contacto != null) {
                        System.out.println("Los datos del contacto son:");
                        System.out.println(contacto.toString());
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto a actualizar: ");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    agenda.update(nombre);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    sc.nextLine();
                    nombre = sc.nextLine();
                    agenda.eliminate(nombre);
                    break;
                case 5:
                    agenda.show();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
}
