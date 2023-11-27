package actvidiad4;
import java.util.Arrays;

public class Bag<T> {
    private T[] list;
    private int count;  
    public Bag(int n) {
        this.list = (T[]) new Object[n];
        this.count = 0;
    }
    public void add(T obj) throws IsFull {
        if (this.count < list.length) {
            list[count] = obj;
            count++;
        } else {
            throw new IsFull();
        }
    }
    public T[] getObjects() throws IsEmpty {
        if (this.count > 0) {
            return list;
        } else {
            throw new IsEmpty();
        }
    }
    public T remove(T obj) throws ObjectNoExist {
        int cont = 0;
        for (T i : this.list) {
            if (i != null && i.equals(obj)) {
                T devolver = list[cont];
                for (int j = cont; j < list.length - 1; j++) {
                    list[j] = list[j + 1];
                }
                list[list.length - 1] = null;
                count--;
                return devolver;
            }
            cont++;
        }
        throw new ObjectNoExist();
    }
    public int getIndex(T obj) {
        int cont = 0;
        for (T i : this.list) {
            if (i.equals(obj)) {
                return cont;
            }
            cont++;
        }
        return -1;
    }
    public String toString() {
        return "{" + Arrays.toString(list) + "}";
    }
}