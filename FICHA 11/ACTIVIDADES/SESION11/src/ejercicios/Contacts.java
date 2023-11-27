/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

public class Contacts {

    private final Dictionary<String, String> contacts;

    
    
    public Contacts() {
        contacts = new Dictionary<>();
    }

    // Agrega un contacto al diccionario
    public void addContact(String name, String phoneNumber) {
        contacts.add(name, phoneNumber);
    }

    // Elimina un contacto del diccionario
    public boolean deleteContact(String name) {
        return contacts.delete(name);
    }

    // Obtiene el número de teléfono asociado a un nombre de contacto
    public String getPhoneNumber(String name) throws Dictionary.ObjectNoExistException {
        return (String) contacts.getValue(name);
    }

    // Muestra todos los contactos en el diccionario
    public void displayContacts() {
        System.out.println("Lista de contactos:");
        System.out.println(contacts);
    }
}