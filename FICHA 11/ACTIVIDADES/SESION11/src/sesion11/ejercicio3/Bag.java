/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion11.ejercicio3;

public class Bag<T> {
    private final T[] list;
    private int count; // Contador de objetos que hay en la bolsa
    private final int capacity; // Capacidad máxima de la bolsa

    public Bag(int capacity) {
        this.capacity = capacity;
        this.list = (T[]) new Object[capacity];
        this.count = 0;
    }

    public void add(T obj) throws IsFull {
        if (count < capacity) {
            list[count++] = obj;
        } else {
            throw new IsFull("La bolsa está llena.");
        }
    }

    public T[] getObjects() throws IsEmpty {
        if (count > 0) {
            return list;
        } else {
            throw new IsEmpty("La bolsa está vacía.");
        }
    }

    public T remove(T obj) throws ObjectNoExist {
        int index = getIndex(obj);
        if (index != -1) {
            T removedObject = list[index];
            System.arraycopy(list, index + 1, list, index, count - index - 1);
            list[--count] = null; // Eliminar referencia al último elemento
            return removedObject;
        } else {
            throw new ObjectNoExist("El objeto no existe en la bolsa.");
        }
    }

    public int getIndex(T obj) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Bag [");
        for (int i = 0; i < count; i++) {
            result.append(list[i]);
            if (i < count - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
